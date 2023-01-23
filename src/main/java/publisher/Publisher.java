package publisher;

import subcriber.PublisherActionSubscriber;

import java.util.ArrayList;

public class Publisher implements PublisherInterface {
    private ArrayList<PublisherActionSubscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscribers(PublisherActionSubscriber subscriber) {

        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscribers(PublisherActionSubscriber subscriber) {

        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String message) {
        for (PublisherActionSubscriber actionSubscriber : subscribers) {
            actionSubscriber.doAction(message);
        }
    }

    public void createNewMessage(String message) {
        System.out.println("Publisher printed a new post!" + message);
        notifySubscribers(message);
    }
}

