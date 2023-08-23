package org.example.subject;

import org.example.observer.Observer;
import org.example.observer.User;
import org.example.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private String name;
    private double price;
    private boolean promotion;

    public Product(String name, double price, boolean promotion) {
        this.name = name;
        this.price = price;
        this.promotion = promotion;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer user) {
        observers.add(user);

    }

    @Override
    public void removeObserver(Observer user) {
        observers.remove(user);

    }

    @Override
    public void notifyObservers() {
        System.out.println();
        System.out.println("---Notifying to all the users when product has a promotion---");
        System.out.println();
        for (Observer observer : observers) {
            observer.update(this.price, this.promotion);
        }

    }
}
