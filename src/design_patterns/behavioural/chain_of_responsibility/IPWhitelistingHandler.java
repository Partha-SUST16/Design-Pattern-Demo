package design_patterns.behavioural.chain_of_responsibility;

public class IPWhitelistingHandler implements AuthenticationHandler{
    private AuthenticationHandler authenticationHandler;

    @Override
    public void setNextHandler(AuthenticationHandler authenticationHandler) {
        this.authenticationHandler = authenticationHandler;
    }

    @Override
    public boolean authenticate(String userName, String password) {
        // Simulating IP whitelisting
        String clientIP = getClientIP();
        if (!clientIP.contains("192.168.192.")) {
            System.out.println("IPWhitelistingHandler: Authentication failed.");
            return false;
        } else if (authenticationHandler != null) {
            System.out.println("IPWhitelistingHandler: Authentication successful.");
            return authenticationHandler.authenticate(userName, password);
        } else {
            System.out.println("IPWhitelistingHandler: Authentication failed.");
            return false;
        }
    }

    private String getClientIP() {
        // Simulated method to get client IP address
        return "192.168.192.";
    }
}
