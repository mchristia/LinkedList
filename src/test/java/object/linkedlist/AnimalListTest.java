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

        //When
        String actual = animalList.toString();

        //Then
        String expected = "a -> b -> c";

        assertEquals(expected, actual);
    }
}
