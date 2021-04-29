package object.linkedlist;

public class AnimalListItem {
    private Animal value;
    public AnimalListItem next;

    public AnimalListItem(){
        this(new Animal(""));
    }
    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public Animal getValue() {
        return value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }

    public void setValue(Animal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
