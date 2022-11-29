package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigEmployee.class);

        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);

        ft.createAccount();

        PartTimeEmployee pt = container.getBean(PartTimeEmployee.class);

        pt.createAccount();
    }
}
