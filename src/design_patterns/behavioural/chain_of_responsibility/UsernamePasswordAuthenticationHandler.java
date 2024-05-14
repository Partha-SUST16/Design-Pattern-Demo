package design_patterns.behavioural.chain_of_responsibility;

public class UsernamePasswordAuthenticationHandler implements AuthenticationHandler{
    private AuthenticationHandler authenticationHandler;

    @Override
    public void setNextHandler(AuthenticationHandler authenticationHandler) {
        this.authenticationHandler = authenticationHandler;
    }

    @Override
    public boolean authenticate(String userName, String password) {
        if (userName.equals("admin") && password.equals("admin123")) {
            System.out.println("UsernamePasswordAuthenticationHandler: Authentication successful.");
            return true;
        } else if (authenticationHandler != null) {
            return authenticationHandler.authenticate(userName, password);
        } else {
            System.out.println("UsernamePasswordAuthenticationHandler: Authentication failed.");
            return false;
        }
    }
}
