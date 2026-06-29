class Solution {
    public String addBinary(String a, String b) {

        String shorter, longer;

        if (a.length() < b.length()) {
            shorter = a;
            longer = b;
        } else {
            shorter = b;
            longer = a;
        }

        int carry = 0;
        StringBuilder ans = new StringBuilder();

        int i = shorter.length() - 1;
        int j = longer.length() - 1;

        while (i >= 0) {
            int sum = (shorter.charAt(i) - '0')
                    + (longer.charAt(j) - '0')
                    + carry;

            ans.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        while (j >= 0) {
            int sum = (longer.charAt(j) - '0') + carry;

            ans.append(sum % 2);
            carry = sum / 2;

            j--;
        }

        if (carry == 1) {
            ans.append('1');
        }

        return ans.reverse().toString();
    }
}