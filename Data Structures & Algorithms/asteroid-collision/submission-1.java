
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();

        for (int x : asteroids) {
            boolean destroyed = false;

            while (!s.isEmpty() && s.peek() > 0 && x < 0) {

                if (s.peek() < -x) {
                    s.pop();
                }
                else if (s.peek() == -x) {
                    s.pop();
                    destroyed = true;
                    break;
                }
                else {
                    destroyed = true; 
                    break;
                }
            }

            if (!destroyed) {
                s.push(x);
            }
        }

        int[] ans = new int[s.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = s.pop();
        }

        return ans;
    }
}