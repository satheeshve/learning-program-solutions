
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Component
class Engine {
    public void start() {
        System.out.println("Engine started!");
    }
}

@Component
class Car {
    @Resource
    private Engine engine;

    public void drive() {
        engine.start();
    }
}

@Configuration
@ComponentScan(basePackages = "test")
class Config {}

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Car car = context.getBean(Car.class);
        car.drive();
    }
}
