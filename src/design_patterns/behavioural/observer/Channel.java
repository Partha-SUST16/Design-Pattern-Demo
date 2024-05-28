package design_patterns.behavioural.observer;

// Subject interface
public interface Channel {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String videoName);
}
