import java.util.Arrays;

public class KnapsackGreedy {
    static class Item implements Comparable<Item> {
        int weight;
        int value;
        double ratio;

        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
            this.ratio = (double) value / weight;
        }

        @Override
        public int compareTo(Item other) {
            return Double.compare(other.ratio, this.ratio);  // เรียงตามความคุ้มค่า
        }
    }

    public static void main(String[] args) {
        int capacity = 10;  // ขนาดถุง
        Item[] items = {
            new Item(4, 12),  // วัตถุ 1
            new Item(8, 32),  // วัตถุ 2
            new Item(2, 40),  // วัตถุ 3
            new Item(6, 30),  // วัตถุ 4
            new Item(1, 50)   // วัตถุ 5
        };

        Arrays.sort(items);  // เรียงตามความคุ้มค่า

        int totalWeight = 0;
        int totalValue = 0;

        for (Item item : items) {
            if (totalWeight + item.weight <= capacity) {
                totalWeight += item.weight;
                totalValue += item.value;
                System.out.println("Selected item with weight " + item.weight + " and value " + item.value);
            }
        }

        System.out.println("Total value in the bag: " + totalValue);
    }
}
//Selected item with weight 1 and value 50
//Selected item with weight 2 and value 40
//Selected item with weight 6 and value 30
//Total value in the bag: 120

