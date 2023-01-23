package publisher;

import subcriber.PublisherActionSubscriber;


public interface PublisherInterface {

    void addSubscribers(PublisherActionSubscriber subscriber);

    public void removeSubscribers(PublisherActionSubscriber subscriber);

    public void notifySubscribers(String message);
}
