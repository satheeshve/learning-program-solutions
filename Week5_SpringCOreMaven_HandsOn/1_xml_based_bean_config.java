
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        A a = (A) context.getBean("a");
        a.msg();
    }
}

class A {
    public void msg() {
        System.out.println("Hello from A!");
    }
}
