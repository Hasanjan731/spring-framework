package stereotype_annotations.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@AllArgsConstructor
@Data
@Component
public class DataStructure {

    //@Autowired // Using this annotation for injection, field injection (not recommended)
    @NonNull //When use @Data annotation, put @NonNull annotation
    ExtraHours extraHours;

    //@Autowired // Construction injection (if there is only one construction, we don't need to use the annotation)
    /*public DataStructure(ExtraHours extraHours) {
        this.extraHours = extraHours;
    }*/

    public void getTotalHours(){

        System.out.println("Total hours: " + (35 + extraHours.getHours()));
    }

}
