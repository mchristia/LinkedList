package object.linkedlist;

public class AnimalList {
    AnimalListItem head;

    public AnimalList() {

    }

    public AnimalList(AnimalListItem head){
        this.head = head;
    }

    @Override
    public String toString() {
        AnimalListItem iterable = head;
        String allnames = "";
        while(iterable !=null){
            allnames = allnames + iterable.getValue().getName();
            if(iterable.next != null){
                allnames = allnames+ " -> ";
            }
            iterable = iterable.next;
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
}
