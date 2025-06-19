import java.util.*;

interface Observe {
    void update(String message);
}

class Subscriber implements Observe {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class Publisher {
    private final List<Observe> subscribers = new ArrayList<>();

    public void subscribe(Observe o) {
        subscribers.add(o);
    }

    public void notifyAllObservers(String msg) {
        for (Observe o : subscribers) {
            o.update(msg);
        }
    }
}

public class Observer {
    public static void main(String[] args) {
        Publisher p = new Publisher();
        System.out.println("This is the output for 4_Observer Pattern");
        p.subscribe(new Subscriber("Alice"));
        p.subscribe(new Subscriber("Bob"));
        p.notifyAllObservers("New course released!");
    }
}
