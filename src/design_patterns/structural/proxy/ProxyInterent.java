package design_patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInterent implements Internet{
    private Internet realInternet;
    private List<String> restrictedSites;

    public ProxyInterent() {
        realInternet = new RealInterent();
        restrictedSites = new ArrayList<>();
        restrictedSites.add("blocked-site.com");
        restrictedSites.add("restricted-site.com");
    }

    @Override
    public void connectTo(String serverHost) {
        if (restrictedSites.contains(serverHost)) {
            System.out.println("Access to " + serverHost + " is restricted.");
        } else {
            realInternet.connectTo(serverHost);
        }
    }
}
