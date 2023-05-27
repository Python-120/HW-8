
public class Main {
    public static void main(String[] args) {

        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("Book 1");
        printableItems[1] = new Magazine("Magazine 1");
        printableItems[2] = new Book("Book 2");
        printableItems[3] = new Magazine("Magazine 2");

        for (Printable printable : printableItems) {
            printable.print();
        }

        printBooks(printableItems);
        printMagazines(printableItems);
    }

    // Статичний метод printBooks, який виводить назви лише книг
    public static void printBooks(Printable[] printableItems) {
        System.out.println("\nPrinting books:");
        for (Printable printable : printableItems) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }

    // Статичний метод printMagazines, який виводить назви лише журналів
    public static void printMagazines(Printable[] printableItems) {
        System.out.println("\nPrinting magazines:");
        for (Printable printable : printableItems) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }

    }
}