package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PurchaseItem {
    private int itemId;
    private int getItemPrice;
    private int count;


}
