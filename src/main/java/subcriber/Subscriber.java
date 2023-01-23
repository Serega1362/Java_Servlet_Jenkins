package subcriber;

public class Subscriber implements PublisherActionSubscriber {
    @Override
    public void doAction(String message) {
        System.out.println(message + " from " + this.getClass().getName());
    }
}
