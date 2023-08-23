package org.example.subject;

import org.example.observer.Observer;

public interface Subject {
    void registerObserver(Observer user);

    void removeObserver(Observer user);

    void notifyObservers();
}
