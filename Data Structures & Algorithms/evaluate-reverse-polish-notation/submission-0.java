class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for (int x = 0; x < tokens.length; x++) {

            if (tokens[x].equals("+") ||
                tokens[x].equals("-") ||
                tokens[x].equals("*") ||
                tokens[x].equals("/")) {

                int w = s.pop(); 
                int t = s.pop();

                if (tokens[x].equals("+")) {
                    s.push(t + w);
                } 
                else if (tokens[x].equals("-")) {
                    s.push(t - w);
                } 
                else if (tokens[x].equals("*")) {
                    s.push(t * w);
                } 
                else {
                    s.push(t / w);
                }

            } else {
                s.push(Integer.parseInt(tokens[x]));
            }
        }

        return s.pop();
    }
}