package org.example.observer.example;

import org.example.observer.Observer;
import org.example.observer.Subject;

public class MyTopicSubscriber implements Observer
{
    private String name;
    private Subject topic;
    public MyTopicSubscriber(String name_)
    {
        this.name=name_;
    }
    public void update()
    {
       //String msg=(String)topic.getUpdate();
    }
    public void setSubject(Subject subject)
    {
        this.topic=subject;
    }
}
