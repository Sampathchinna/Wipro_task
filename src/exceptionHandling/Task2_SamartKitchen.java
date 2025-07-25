package exceptionHandling;

interface Controllable {
    void turnOn();  // abstract method

    default void status() {
        System.out.println("Appliance is functioning properly.");
    }

    static void showSupportedDevices() {
        System.out.println("Supported Smart Kitchen Devices: Oven, Toaster, Kettle");
    }
}

class SmartOven implements Controllable {
    public void turnOn() {
        System.out.println("Smart Oven is preheating...");
    }
}

class SmartToaster implements Controllable {
    public void turnOn() {
        System.out.println("Smart Toaster is toasting bread...");
    }
}

class SmartKettle implements Controllable {
    public void turnOn() {
        System.out.println("Smart Kettle is boiling water...");
    }
}

public class Task2_SamartKitchen {
    public static void main(String[] args) {
        // Static method from interface
        Controllable.showSupportedDevices();

        // Smart Oven
        SmartOven oven = new SmartOven();
        oven.turnOn();
        oven.status();

        // Smart Toaster
        SmartToaster toaster = new SmartToaster();
        toaster.turnOn();
        toaster.status();

        // Smart Kettle
        SmartKettle kettle = new SmartKettle();
        kettle.turnOn();
        kettle.status();
    }
}
