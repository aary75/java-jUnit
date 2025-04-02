package com.bridgelabz.testing;

import com.bridgelabz.javaJunit.LinkedListFunctions;
import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;

import java.util.LinkedList;

public class LinkedListFunctionsTest {

    LinkedList<Integer> li = new LinkedList<>();

    @Test
    public void addElement(){
        boolean result = LinkedListFunctions.addElement(li, 23);
        boolean expected = true;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void addElement2(){
        boolean result = LinkedListFunctions.addElement(li, 43);
        boolean expected = true;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void removeElement(){
        LinkedListFunctions.addElement(li,23);
        boolean result = LinkedListFunctions.removeElement(li, 23);
        boolean expected = true;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void getSize(){
        LinkedListFunctions.addElement(li,3);
        LinkedListFunctions.addElement(li,32);

        int result = LinkedListFunctions.getSize(li);
        int expected = 2;

        Assert.assertEquals(expected, result);
    }
}

// All test cases passed
