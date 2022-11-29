package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class NewConfigApp {

    @Primary
    @Bean
    //@Bean(name="message1")
    public String strObj1(){
        return "welcome to CydeoApp";
    }

    //@Bean(name="message2")
    public String strObj2(){
        return "Spring Core Practice";
    }
}
