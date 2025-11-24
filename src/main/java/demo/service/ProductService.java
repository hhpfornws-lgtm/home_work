package demo.service;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    Product getById(String id);
    List<Product> search(String name);
    Product add(Product product);
    Product update(String id, Product product);
    boolean delete(String id);
}