// This program shows connectivity of devices 
// I define an interface for devices that can connect to a network
interface NetworkConnectable {
    void connectToNetwork(); // Method for connecting to a network
}

// class representing a Smartphone, implements Network Connectable interface
class Smartphone implements NetworkConnectable {
    @Override
    public void connectToNetwork() {
        System.out.println("Smartphone connected to network");
    }

    public void makeCall() {
        System.out.println("Making a call from smartphone");
    }
}

// Class representing a Tablet, implements Network connectable interface
class Tablet implements NetworkConnectable {
    @Override
    public void connectToNetwork() {
        System.out.println("Tablet connected to network");
    }

    public void playGame() {
        System.out.println("Playing a game on tablet");
    }
}

// class representing a Laptop, implements Network connectable interface
class Laptop implements NetworkConnectable {
    @Override
    public void connectToNetwork() {
        System.out.println("Laptop connected to network");
    }

    public void doWork() {
        System.out.println("Doing work on laptop");
    }
}

// class representing a desktop, implements Network connectable interface
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
        myPhone.connectToNetwork(); // connect the smartphone to the network
        myPhone.makeCall(); // make a call using the smartphone

        Tablet myTablet = new Tablet();
        myTablet.connectToNetwork(); // Connect the tablet 
        myTablet.playGame(); // play a game on the tablet

        Laptop myLaptop = new Laptop();
        myLaptop.connectToNetwork(); // connect the laptop 
        myLaptop.doWork(); // Do some work on the laptop

        Desktop myDesktop = new Desktop();
        myDesktop.connectToNetwork(); // Connect the desktop computer to network
        myDesktop.runSoftware(); // run software on the desktop computer
    }
}
