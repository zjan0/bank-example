package org.example.observer;

public interface Subject
{
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObservers();
    public void getUpdate(Observer observer);
}
