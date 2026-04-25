class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (String op : operations) {

            if (op.equals("+")) {
                int last = st.pop();
                int secondLast = st.peek();

                int sum = last + secondLast;

                st.push(last);
                st.push(sum);
            }

            else if (op.equals("D")) {
                st.push(2 * st.peek());
            }

            else if (op.equals("C")) {
                st.pop();
            }

            else {
                st.push(Integer.parseInt(op));
            }
        }

        int total = 0;

        while (!st.isEmpty()) {
            total += st.pop();
        }

        return total;
    }
}