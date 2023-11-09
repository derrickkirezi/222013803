// Define an interface for devices that can connect to a network
interface NetworkConnectable {
    void connectToNetwork(); // Method signature for connecting to a network
}

// Class representing a Smartphone, implements NetworkConnectable interface
class Smartphone implements NetworkConnectable {
    @Override
    public void connectToNetwork() {
        System.out.println("Smartphone connected to network");
    }

    public void makeCall() {
        System.out.println("Making a call from smartphone");
    }
}

// Class representing a Tablet, implements NetworkConnectable interface
class Tablet implements NetworkConnectable {
    @Override
    public void connectToNetwork() {
        System.out.println("Tablet connected to network");
    }

    public void playGame() {
        System.out.println("Playing a game on tablet");
    }
}

// Class representing a Laptop, implements NetworkConnectable interface
class Laptop implements NetworkConnectable {
    @Override
    public void connectToNetwork() {
        System.out.println("Laptop connected to network");
    }

    public void doWork() {
        System.out.println("Doing work on laptop");
    }
}

// Class representing a Desktop, implements NetworkConnectable interface
class Desktop implements NetworkConnectable {
    @Override
    public void connectToNetwork() {
        System.out.println("Desktop computer connected to network");
    }

    public void runSoftware() {
        System.out.println("Running software on desktop computer");
    }
}

public class Main {
    public static void main(String[] args) {
        Smartphone myPhone = new Smartphone();
        myPhone.connectToNetwork(); // Connect the smartphone to the network
        myPhone.makeCall(); // Make a call using the smartphone

        Tablet myTablet = new Tablet();
        myTablet.connectToNetwork(); // Connect the tablet to the network
        myTablet.playGame(); // Play a game on the tablet

        Laptop myLaptop = new Laptop();
        myLaptop.connectToNetwork(); // Connect the laptop to the network
        myLaptop.doWork(); // Do some work on the laptop

        Desktop myDesktop = new Desktop();
        myDesktop.connectToNetwork(); // Connect the desktop computer to the network
        myDesktop.runSoftware(); // Run software on the desktop computer
    }
}
