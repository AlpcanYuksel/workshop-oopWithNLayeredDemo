package com.etiya.business;

import com.etiya.core.Logger;
import com.etiya.dataAccess.ProductDao;
import com.etiya.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {

        if (product.getUnitPrice() < 10) {
            throw new Exception("Unit price needs to be greater than 10");
        }
        productDao.add(product);

        for (Logger logger: loggers){
            logger.log(product.getName());
        }
    }
}
