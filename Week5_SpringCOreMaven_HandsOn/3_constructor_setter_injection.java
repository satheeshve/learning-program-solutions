
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Employee e = (Employee) context.getBean("e");
        e.show();
    }
}

class Address {
    private String city;

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

class Employee {
    private Address address;

    public Employee(Address address) {
        this.address = address;
    }

    public void show() {
        System.out.println("City: " + address.getCity());
    }
}
