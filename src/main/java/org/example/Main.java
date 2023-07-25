package org.example;

import lombok.val;
import org.example.service.CartService;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CartService service = new CartService();
        service.add(new PurchaseItem(1, 1_000, 1));
        service.add(new PurchaseItem(2, 4_000, 4));
        service.add(new PurchaseItem(3, 5_000, 1));
        service.add(new PurchaseItem(4, 7_000, 9));
        service.add(new PurchaseItem(5, 2_000, 1));
        service.add(new PurchaseItem(6, 8_000, 10));

        System.out.println(service.sortedBy((o1, o2) -> 0));


    }
}