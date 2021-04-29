package object.linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    @Test
    @DisplayName("Does toString return what we expect")
    public void toStringTest(){
        // Given
        Animal animal = new Animal("Platybus");

        // When
        String actual = animal.toString();

        // Then
        assertEquals("Platybus", actual);
    }

}