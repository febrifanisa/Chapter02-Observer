package Tugas;
import java.util.ArrayList;
import java.util.List;
interface Observer {
    void update(String notification);
}
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String notification);
}
class Instagram implements Subject {
        private List<Observer> observers = new ArrayList<>();
        private String username;

        public Instagram(String username) {
            this.username = username;
        }

        @Override
        public void registerObserver(Observer observer) {
            observers.add(observer);
        }

        @Override
        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        @Override
        public void notifyObservers(String notification) {
            for (Observer observer : observers) {
                observer.update(notification);
            }
        }

        public void postPhoto(String caption) {
            String notification = username + " posted a new photo: " + caption;
            System.out.println(notification);
            notifyObservers(notification);
        }
    }
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String notification) {
        System.out.println(name + " received a notification: " + notification);
    }
}
