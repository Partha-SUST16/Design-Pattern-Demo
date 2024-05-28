package design_patterns.behavioural.observer;

// Concrete Observer
public class User implements Subscriber {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String channelName, String videoName) {
        System.out.println("Hey " + userName + ", a new video '" + videoName + "' has been uploaded to '" + channelName + "' channel!");
    }
}
