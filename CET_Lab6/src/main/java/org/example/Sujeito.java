package org.example;

public interface Sujeito {
    void addObservers(Observer var1);

    void removeObserver(Observer var1);

    void notifyObservers();
}

