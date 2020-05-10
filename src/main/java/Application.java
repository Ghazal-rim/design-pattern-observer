import java.util.ArrayList;
import java.util.List;


public class Application {
    private int users;
    private int id;

    private List<Observer> observers = new ArrayList<>();

    public Application(int id) {

        this.id = id;
    }


    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
        updateAll();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void subscribe(Observer observer)
    {
        this.observers.add(observer);
    }

    private void updateAll(){
        this.observers.stream().forEach(observer -> observer.update());
    }
}
