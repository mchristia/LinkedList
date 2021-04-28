package object.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalListTest {
    @Test
    @DisplayName("AnimalList returns a String of elements")
    public void toStringTest(){
        //Given
        AnimalList animalList = new AnimalList();
        animalList.add(new Animal("a"));
        animalList.add(new Animal ("b"));
        animalList.add(new Animal("c"));
        animalList.add(new Animal("d"));
        animalList.add(new Animal("e"));

        //When
        String actual = animalList.toString();

        //Then
        String expected = "a -> b -> c";

        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("AnimalList removes an animal")
    public void removeAnimalTest(){
        //Given
        AnimalList animalList = new AnimalList();
        animalList.add(new Animal("a"));
        animalList.add(new Animal ("b"));
        animalList.add(new Animal("c"));
        animalList.add(new Animal("d"));
        animalList.add(new Animal("e"));

        //When
        animalList.remove(new Animal ("e"));
        String actual = animalList.toString();

        //Then
        String expected = "a -> b -> c -> d";

        assertEquals(expected, actual);

    }

}
