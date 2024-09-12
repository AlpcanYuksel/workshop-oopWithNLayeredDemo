package com.etiya;

import com.etiya.business.ProductManager;
import com.etiya.core.DatabaseLogger;
import com.etiya.core.FileLogger;
import com.etiya.core.Logger;
import com.etiya.core.MailLogger;
import com.etiya.dataAccess.HibernateProductDao;
import com.etiya.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "iPhone", 10000);
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product);
    }
}