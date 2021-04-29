package object.linkedlist;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Objects;

public class AnimalList {
    AnimalListItem head;

    public AnimalList() {

    }

    public AnimalList(AnimalListItem head){
        this.head = head;
    }

    @Override
    public String toString() {
        if(head == null){
            return "";
        }

        StringBuilder builder = new StringBuilder(head.getValue().toString());
        AnimalListItem iterable = head;
        String allnames = "";
        while(iterable !=null){
            allnames = allnames + iterable.getValue().getName();
            if(iterable.next != null){
                allnames = allnames+ " -> ";
            }
            iterable = iterable.getNext();
        }
       return allnames;
    }

    public void add(Animal animal){
        AnimalListItem iterable = head;
        if(head == null){
            head = new AnimalListItem(animal);
        }else {
            while(iterable.getNext() !=null){
                iterable = iterable.getNext();
            }
            iterable.setNext(new AnimalListItem(animal));
        }
    }

    public AnimalListItem isLastItem(AnimalListItem item){
        return item.getNext() == null ? item : isLastItem(item.getNext());
    }

    public void remove(Animal animal){
        if(head == null){
            return;
        }
        AnimalListItem iterable = head;
        AnimalListItem secondLastItem;
        if(iterable.getNext() != null){
            while(iterable.getNext() != null){
                if(iterable.getNext().getNext() != null) {
                    if (animal.getName().equals(iterable.getValue().getName())) {
                        iterable.setValue(iterable.getNext().getValue());
                        iterable.setNext(iterable.getNext().getNext());
                        return;
                    }
                    iterable = iterable.getNext();
                }else{
                    if (animal.getName().equals(iterable.getValue().getName())) {
                        iterable.setValue(iterable.getNext().getValue());
                        iterable.setNext(iterable.getNext().getNext());
                        return;
                    }
                }


            }
            if(animal.getName().equals(iterable.getValue().getName())){
                iterable
            }
        }else{
            if(animal.getName().equals(iterable.getValue().getName())){
                iterable.getValue().setName("");
            }
        }
    }

    public void removeMasterSolution(Animal animal){
        while(head != null && head.getValue().equals(animal)){
            head = head.getNext();
        }

        if(head == null){
            return;
        }

        AnimalListItem iterable = head;

        while(iterable.getNext() != null){
            if(Objects.equals(iterable.getNext().getValue(), animal)){
                iterable.setNext(iterable.getNext().getNext());
            }else{
                iterable = iterable.getNext();
            }

        }
    }
}
