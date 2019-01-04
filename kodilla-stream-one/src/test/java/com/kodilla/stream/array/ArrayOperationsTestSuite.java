package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        List<ArrayOperations> theList = new ArrayList<>();
        int [] myArray = {1,10,17,24};

        //When
        double list = ArrayOperations.getAverage(myArray);

        //Then
        double expectedArray = new Double(13.0);
       Assert.assertEquals(expectedArray,list,0001);
    }
}
