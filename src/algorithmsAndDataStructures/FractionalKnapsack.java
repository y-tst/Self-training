package algorithmsAndDataStructures;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {

        final int W = 7;

        final Item ITEM1 = new Item(4, 20);
        final Item ITEM2 = new Item(3, 18);
        final Item ITEM3 = new Item(2, 14);

        final Item[] items = {ITEM1, ITEM2, ITEM3};

        Arrays.sort(items, Comparator.comparingDouble(Item::specificValueUnitPerWeight).reversed());

        System.out.println(Arrays.toString(items));

        int currentItem = 0;
        int currentWeight = 0;
        double currentValue = 0;

        while (currentItem < items.length && currentWeight != W) {
            if (items[currentItem].getWeight() + currentWeight < W) {
                currentWeight += items[currentItem].getWeight();
                currentValue += items[currentItem].getValue();
            } else {
                currentValue += (items[currentItem].getValue() * (W - currentWeight) / (double) items[currentItem].getWeight());
                currentWeight = W;
            }
            currentItem++;
        }


        System.out.println("Max value: " + currentValue);
    }

    static class Item {
        private int weight;
        private int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        public double specificValueUnitPerWeight() {
            return value / (double) weight;
        }

        public int getWeight() {
            return weight;
        }

        public int getValue() {
            return value;
        }

        public String toString() {
            return "{w: " + weight + ", v: " + value + "}";
        }
    }
}
