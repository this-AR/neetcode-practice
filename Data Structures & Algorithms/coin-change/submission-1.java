class Solution {
  
    public int coinChange(int[] coins, int amount) {

    int ans = find(coins, amount, 0);

    return ans == Integer.MAX_VALUE ? -1 : ans;
}
    int find(int[] coins, int a, int n) {

    if (a == 0)
        return 0;

    if (a < 0 || n == coins.length)
        return Integer.MAX_VALUE;

    int take = find(coins, a - coins[n], n);
    if (take != Integer.MAX_VALUE)
        take++;

    int skip = find(coins, a, n + 1);

    return Math.min(take, skip);
}
}
