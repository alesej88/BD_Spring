package homeWork.lesson2;

import classwork.lesson2.annotation.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
var context = new AnnotationConfigApplicationContext(AppConfig.class);

context.getBean(Product.class);
        }

    }
}
