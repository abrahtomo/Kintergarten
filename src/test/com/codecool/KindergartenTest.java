package com.codecool;

import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KindergartenTest {

    static Kindergarten test = new Kindergarten();

    @Test
    public void testInitFillsList(){
        test.init();
        assertNotNull(test.getChildren());
    }

    @Test
    public void wrongInput() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                ()->test.activity("WRONG") );
    }

    /*@Test
    public void activityBehaviour(){
        test.init();
        test.activity(1);
        assertEquals(3, test.getChildren().get(1).getSatisfactionLevel());
    }*/

}