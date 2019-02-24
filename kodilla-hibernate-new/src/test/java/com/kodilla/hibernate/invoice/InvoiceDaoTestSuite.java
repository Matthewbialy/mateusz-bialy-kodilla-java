package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.dao.InvoiceDao;
import com.kodilla.hibernate.invoice.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product macBook = new Product("MacBook");
        Product apple = new Product("SmartWatch");
        Product iphone = new Product("Iphone");

        Item item = new Item(new BigDecimal(4000), 10, new BigDecimal(4000));
        Item item2 = new Item(new BigDecimal(2000), 10, new BigDecimal(2000));
        Item item3 = new Item(new BigDecimal(3000), 10, new BigDecimal(3000));

        productDao.save(macBook);
        productDao.save(apple);
        productDao.save(iphone);

        macBook.getItems().add(item);
        macBook.getItems().add(item2);
        apple.getItems().add(item3);

        item.setProduct(macBook);
        item2.setProduct(macBook);
        item3.setProduct(apple);

        Invoice invoiceOne = new Invoice("InvoiceOne");
        invoiceOne.getItems().add(item);
        invoiceOne.getItems().add(item2);
        invoiceOne.getItems().add(item3);

        item.setInvoice(invoiceOne);
        item2.setInvoice(invoiceOne);
        item3.setInvoice(invoiceOne);

        //When
        invoiceDao.save(invoiceOne);
        int id = invoiceOne.getId();

        //Then
        Assert.assertNotEquals(0, id);
        Assert.assertEquals(3,invoiceOne.getItems().size());

        //CleanUp
        invoiceDao.delete(id);
    }
}