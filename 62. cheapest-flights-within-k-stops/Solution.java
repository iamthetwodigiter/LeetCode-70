class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // 1. Initialize prices array with infinity
        int[] prices = new int[n];
        Arrays.fill(prices, Integer.MAX_VALUE);
        prices[src] = 0;

        // 2. Run relaxation k+1 times
        for(int i=0; i<=k; i++) {
            // Create a copy to avoid using updated values in the same round
            int[] temp = Arrays.copyOf(prices, n);

            for(int[] flight: flights) {
                int u = flight[0]; // From
                int v = flight[1]; // To
                int price = flight[2];

                if(prices[u] != Integer.MAX_VALUE) {
                    if(prices[u] + price < temp[v]) {
                        temp[v] = prices[u] + price;
                    }
                }
            }
            // Update prices for the next iteration
            prices = temp;
        }
        return prices[dst] == Integer.MAX_VALUE ? -1 : prices[dst];
    }
}