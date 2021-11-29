package homeWork.lesson2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {

ProductRepository productRepository;
List<Product>  products;

    public Cart() {
products = new ArrayList<>();

    }
    public Product getProduct(int id){
        return products.stream().filter(x -> x.getId == id).findFirst().orElseThrow();
    }
    public void addProduct(int id){
        this.products.add(productRepository.getProducts(id));
    }
    public void removeProduct(int id){
products.removeIf(p -> p.getId() ==id);
    }
    public List<Product> listProducts(){
        return products;
    }
    public List<Product> listAvaliableProducts(){
return productRepository.getProducts();
    }
}
