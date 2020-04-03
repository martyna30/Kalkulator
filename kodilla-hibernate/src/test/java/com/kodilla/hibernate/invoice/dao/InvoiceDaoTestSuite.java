package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
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
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product2 = new Product("Bread");
        Product product3 = new Product("Milk");
        Product product4 = new Product("Yogurt");
        Product product5 = new Product("Butter");

        productDao.save(product2);
        productDao.save(product3);
        productDao.save(product4);
        productDao.save(product5);
        int idProduct2 = product2.getId();

        Invoice invoice1 = new Invoice("1");

        invoiceDao.save(invoice1);
        int idInvoice = invoice1.getId();

        Item item1 = new Item(2, new BigDecimal(2), new BigDecimal(4));
        Item item2 = new Item(3, new BigDecimal(4), new BigDecimal(12));
        Item item3 = new Item(4, new BigDecimal(4), new BigDecimal(16));
        Item item4 = new Item(4, new BigDecimal(5), new BigDecimal(20));

        product2.getItems().add(item1);
        product3.getItems().add(item2);
        product4.getItems().add(item3);
        product5.getItems().add(item4);

        item1.setProduct(product2);
        item2.setProduct(product3);
        item3.setProduct(product4);
        item4.setProduct(product5);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item4);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice1);

        //When
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        int idItem1 = item1.getId();

        //Then
        Assert.assertNotEquals(0, idProduct2);
        Assert.assertNotEquals(0, idItem1);
        Assert.assertNotEquals(0, idInvoice);

        //CleanUp
        invoiceDao.deleteById(idInvoice);
        productDao.deleteAll();
        itemDao.deleteAll();

    }
}


