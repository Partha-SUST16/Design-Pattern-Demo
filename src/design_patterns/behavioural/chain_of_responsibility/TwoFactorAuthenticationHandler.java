package design_patterns.behavioural.chain_of_responsibility;

public class TwoFactorAuthenticationHandler implements AuthenticationHandler{
    private AuthenticationHandler authenticationHandler;
    @Override
    public void setNextHandler(AuthenticationHandler authenticationHandler) {
        this.authenticationHandler = authenticationHandler;
    }

    @Override
    public boolean authenticate(String userName, String password) {
        // Simulating two-factor authentication
        if (userName.equals("user") && password.equals("user123") && verifyOTP("123456")) {
            System.out.println("TwoFactorAuthenticationHandler: Authentication successful.");
            return true;
        } else if (authenticationHandler != null) {
            return authenticationHandler.authenticate(userName, password);
        } else {
            System.out.println("TwoFactorAuthenticationHandler: Authentication failed.");
            return false;
        }
    }


    private boolean verifyOTP(String otp) {
        // Simulated OTP verification logic
        return otp.equals("123456");
    }
}
