
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Component
class A {
    public void msg() {
        System.out.println("Hello from A!");
    }
}

@Configuration
@ComponentScan(basePackages = "test")
class Config {}

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        A a = context.getBean(A.class);
        a.msg();
    }
}
