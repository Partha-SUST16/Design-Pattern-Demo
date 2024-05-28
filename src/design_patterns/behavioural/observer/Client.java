package design_patterns.behavioural.observer;

public class Client {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel("CodeWithMe");

        User user1 = new User("John");
        User user2 = new User("Jane");
        User user3 = new User("Bob");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        channel.uploadVideo("Java Design Patterns");
        System.out.println("------------------------");
        channel.unsubscribe(user3);
        channel.uploadVideo("Java Streams");
    }// Decoupling between subject and observer
    // Reusability, Scalability
}
