package demo.Controller;

// Import đầy đủ để không bị lỗi đỏ
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor // Tự động tạo Constructor để tiêm dependency
public class ProductController {

    // --- KHẮC PHỤC LỖI CŨ: Phải khai báo biến service ở đây ---
    private final ProductService service;
    // ---------------------------------------------------------

    // 1. Xem tất cả
    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    // 2. Xem theo ID
    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable String id) {
        Product p = service.getById(id);
        return p != null ? ResponseEntity.ok(p) : ResponseEntity.notFound().build();
    }

    // 3. Tìm kiếm
    @GetMapping("/search")
    public ResponseEntity<List<Product>> search(@RequestParam String name) {
        return ResponseEntity.ok(service.search(name));
    }

    // 4. Thêm mới
    @PostMapping
    public ResponseEntity<Product> create(@RequestBody Product product) {
        return ResponseEntity.ok(service.add(product));
    }

    // 5. Sửa
    @PutMapping("/{id}")
    public ResponseEntity<Product> update(@PathVariable String id, @RequestBody Product product) {
        Product p = service.update(id, product);
        return p != null ? ResponseEntity.ok(p) : ResponseEntity.notFound().build();
    }

    // 6. Xóa
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        return service.delete(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }
}