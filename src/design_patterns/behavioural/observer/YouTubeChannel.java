package design_patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class YouTubeChannel implements Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String videoName) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(channelName, videoName);
        }
    }

    public void uploadVideo(String videoName) {
        System.out.println("New video '" + videoName + "' uploaded to channel '" + channelName + "'");
        notifySubscribers(videoName);
    }
}