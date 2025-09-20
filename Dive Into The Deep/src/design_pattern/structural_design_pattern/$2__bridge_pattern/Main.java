package design_pattern.structural_design_pattern.$2__bridge_pattern;

interface Network {
    void useNetwork();
}

class Grameenphone implements Network {
    public void useNetwork() { System.out.println("Using Grameenphone network."); }
}
class Robi implements Network {
    public void useNetwork() { System.out.println("Using Robi network."); }
}

abstract class MobileBanking {
    protected Network network;
    public MobileBanking(Network network) { this.network = network; }
    abstract void sendMoney();
}

class bKash extends MobileBanking {
    public bKash(Network network) { super(network); }
    public void sendMoney() {
        network.useNetwork();
        System.out.println("Sending money via bKash.");
    }
}

class Nagad extends MobileBanking {
    public Nagad(Network network) { super(network); }
    public void sendMoney() {
        network.useNetwork();
        System.out.println("Sending money via Nagad.");
    }
}

public class Main {
    public static void main(String[] args) {
        MobileBanking bkash = new bKash(new Grameenphone());
        bkash.sendMoney();

        MobileBanking nagad = new Nagad(new Robi());
        nagad.sendMoney();
    }
}

