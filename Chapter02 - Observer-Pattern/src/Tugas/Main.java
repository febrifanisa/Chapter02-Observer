package Tugas;

public class Main {
    public static void main(String[] args) {
        Instagram instagram = new Instagram("john_doe");

        User user1 = new User("jane_doe");
        User user2 = new User("bob_jones");

        instagram.registerObserver(user1);
        instagram.registerObserver(user2);

        instagram.postPhoto("Cantiknya Matahari Terbenam di Laut");

        instagram.removeObserver(user1);

        instagram.postPhoto("Mencoba resep baru");
    }
}


