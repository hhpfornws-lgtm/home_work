package demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Tự tạo Getter, Setter
@AllArgsConstructor // Tự tạo Constructor full tham số
@NoArgsConstructor  // Tự tạo Constructor rỗng
public class Product {
    private String id;
    private String name;
    private int price;
}