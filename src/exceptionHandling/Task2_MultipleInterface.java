package exceptionHandling;

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class MultifunctionPrinter implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class Task2_MultipleInterface {
    public static void main(String[] args) {
        MultifunctionPrinter printer = new MultifunctionPrinter();
        printer.print();
        printer.scan();
    }
}

