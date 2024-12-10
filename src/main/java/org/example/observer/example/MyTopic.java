package org.example.observer.example;

import org.example.observer.Observer;

public class MyTopic
{
    private String message;
    private boolean changed;
    private Object MUTEX;
    public MyTopic()
    {

    }
    public void register(Observer observer)
    {

    }
    public void unregister(Observer observer)
    {

    }
    public void notifyObservers()
    {

    }
    public Object getUpdate(Observer observer)
    {
        return this.message;
    }
    public void postMessage(String msg)
    {
        System.out.println();
        this.message=msg;
        this.changed=true;
        this.notifyObservers();
    }
}
