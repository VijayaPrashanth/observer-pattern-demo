package org.example;
import org.example.observer.User;
import org.example.subject.Product;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User("Sam");
        User user2 = new User("Daniel");
        User user3 = new User("Richard");

        Product prod = new Product("WATCH", 15000, false);


        //registering observer

        prod.registerObserver(user1);
        prod.registerObserver(user2);
        prod.registerObserver(user3);


        // notifying promotion

        prod.setPrice(10000);
        prod.setPromotion(true);

        //unregistering observer
        prod.removeObserver(user3);

        // Finish promotion
        prod.setPrice(15000);
        prod.setPromotion(false);


    }

}