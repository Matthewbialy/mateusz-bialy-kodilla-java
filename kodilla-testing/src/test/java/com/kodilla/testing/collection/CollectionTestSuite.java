package com.kodilla.testing.collection;


import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    public static void main(String[] args) {
    }

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testAddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> theList = new ArrayList<>();
        theList.add(1);
        theList.add(4);
        theList.add(7);
        theList.add(10);

        //When
        AddNumbersExterminator ex = new AddNumbersExterminator();
        ArrayList<Integer> resultList = ex.exterminate(theList);
        System.out.println("testing" + resultList);

        //Then
        Assert.assertEquals(2, resultList.size());

    }


    @Test
    public void testAddNumbersExterminatorEmptyList() {

        AddNumbersExterminator addNumbersExterminator = new AddNumbersExterminator();

        //Given
        ArrayList<Integer> newList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        //When
        List<Integer> result = addNumbersExterminator.exterminate(newList);

        //Then
        Assert.assertEquals(0, result.size());


    }
}










