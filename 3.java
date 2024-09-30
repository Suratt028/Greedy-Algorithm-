public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {9, 8, 7};
        int target = 15;

        int numCoins = 0;
        for (int coin : coins) {
            while (target >= coin) {
                target -= coin;
                numCoins++;
                System.out.println("Selected coin: " + coin);
            }
        }

        System.out.println("Total coins used: " + numCoins);
    }
}
//Selected coin: 8
//Selected coin: 7
//Total coins used: 2
