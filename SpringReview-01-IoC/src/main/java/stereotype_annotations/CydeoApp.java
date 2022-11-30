package stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.Config.ConfigApp;
import stereotype_annotations.Model.DataStructure;
import stereotype_annotations.Model.Microservice;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        DataStructure ds = container.getBean(DataStructure.class);

        ds.getTotalHours();

        Microservice ms = container.getBean(Microservice.class);

        ms.getTotalHours();
    }
}
