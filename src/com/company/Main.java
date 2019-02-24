package com.company;

public class Main {

    public static void main(String[] args) {

        Notifier notifier = (item) -> {
            System.out.printf("Sold item %s for %s",
                    item.getName(),
                    item.getRetailPrice());
        };
        VendingMachine machine = new VendingMachine(notifier, 10, 10, 10);
    }
}
