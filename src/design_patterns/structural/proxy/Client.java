package design_patterns.structural.proxy;

public class Client {
    public static void main(String[] args) {
        Internet internet = new ProxyInterent();

        internet.connectTo("google.com");
        // Output: Connecting to google.com

        internet.connectTo("blocked-site.com");
        // Output: Access to blocked-site.com is restricted.

        internet.connectTo("open-site.com");
        // Output: Connecting to open-site.com
    }
}
