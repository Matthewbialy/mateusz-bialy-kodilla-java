package com.kodilla.stream.invoice.simple;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {

    @Test
    public void testGetValueToPat() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();
        //When
        invoice.addItem(new Simpleitem(new SimpleProduct("Product1", 17.28),2.0));
        invoice.addItem(new Simpleitem(new SimpleProduct("Product2", 11.99), 3.5));
        invoice.addItem(new Simpleitem(new SimpleProduct("Product3", 6.49), 5.0));
        //Then
        Assert.assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }
}
