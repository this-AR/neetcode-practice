
class Solution {
    boolean found = false;

    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int x : matchsticks) {
            sum += x;
        }

        if (sum % 4 != 0)
            return false;

        sum /= 4;
        Arrays.sort(matchsticks);
        for (int i = 0, j = matchsticks.length - 1; i < j; i++, j--) {
            int temp = matchsticks[i];
            matchsticks[i] = matchsticks[j];
            matchsticks[j] = temp;
        }

        int[] gsum = {sum, sum, sum, sum};
        find(matchsticks, gsum, 0);

        return found;
    }

    void find(int[] m, int[] g, int n) {
        if (found) return;

        if (n == m.length) {
            found = allZero(g);
            return;
        }

        for (int x = 0; x < 4; x++) {

            if (g[x] < m[n])
                continue;

            g[x] -= m[n];

            find(m, g, n + 1);

            g[x] += m[n];

            if (g[x] == g[0] || (x > 0 && g[x] == g[x - 1]))
                break;
        }
    }

    boolean allZero(int[] arr) {
        for (int x : arr) {
            if (x != 0)
                return false;
        }
        return true;
    }
}