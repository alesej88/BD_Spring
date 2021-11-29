package homeWork.lesson2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class ProductRepository {

private List<Product> products;


    public ProductRepository() {
products = new CopyOnWriteArrayList<>();
    }
    public List<Product> getProducts(){

    }
}



