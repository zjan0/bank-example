package org.example.observer.example;

import org.example.observer.Observer;

public class TestObservers
{
    public static void main(String[] a)
    {
        MyTopic topic = new MyTopic();
        Observer myTopicSubscriber1 = new MyTopicSubscriber("Obj1");
        Observer myTopicSubscriber2 = new MyTopicSubscriber("Obj2");
        Observer myTopicSubscriber3 = new MyTopicSubscriber("Obj3");
        topic.register(myTopicSubscriber1);
        topic.register(myTopicSubscriber2);
        topic.register(myTopicSubscriber3);
        myTopicSubscriber1.update();
        topic.postMessage("New Message");
    }
}
