/*
Create package 'stores'. Under it create a class called 'Stock' with member variables (item_no, item_name, stock_available and cost). Under the default package create a class called 'Sales' with field name (qty_sold) and it is the child class of 'Stock' class. Write a program to print the current stock of each item and perform addition.
*/

import stores.Stock;

class Sales extends Stock {
    public int[] qty_sold = new int[3];

    public Sales() {
        qty_sold[0] = 50;
        qty_sold[1] = 65;
        qty_sold[2] = 84;
    }
}

public class Program4 {
    public static void main(String[] args) {
        Sales s = new Sales();

        for (int i = 0; i < 3; i++) {
            System.out.println("Item no: " + s.item_no[i] + "\tItem Name: " + s.item_name[i] + "\tStock Available: "
                    + s.stock_available[i] + "\tCost: " + s.cost[i] + "\tQuantity Sold: " + s.qty_sold[i]);
        }

        System.out.println("\n\nTotal Cost of all items per plate: " + (s.cost[0] + s.cost[1] + s.cost[2]));
        System.out.println("Total Quantities of all items sold: " + (s.qty_sold[0] + s.qty_sold[1] + s.qty_sold[2]));
    }
}