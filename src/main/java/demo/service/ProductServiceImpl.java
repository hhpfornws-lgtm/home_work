package demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    // Giả lập Database trong RAM
    private List<Product> products = new ArrayList<>(List.of(
            new Product("1", "iPhone 15", 1200),
            new Product("2", "Samsung S24", 1000)
    ));

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(String id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Product> search(String name) {
        return products.stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public Product add(Product product) {
        product.setId(UUID.randomUUID().toString()); // Tự sinh ID
        products.add(product);
        return product;
    }

    @Override
    public Product update(String id, Product product) {
        Product existing = getById(id);
        if (existing != null) {
            existing.setName(product.getName());
            existing.setPrice(product.getPrice());
            return existing;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        return products.removeIf(p -> p.getId().equals(id));
    }
}