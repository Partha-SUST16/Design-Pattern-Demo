package design_patterns.behavioural.observer;

//Observer interface
public interface Subscriber {
    void update(String channelName, String videoName);
}
