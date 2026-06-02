class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - 1;
        List<Integer> list = new ArrayList<>();

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x)
            {
                l=m;
                r=l-1;
                break;
            }
                
            else if (arr[m] > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        int a = l - 1, b = l;

        while (k-- > 0) {
            if (a >= 0 && b < arr.length) {
                if (Math.abs(arr[a] - x) <= Math.abs(arr[b] - x)) {
                    list.add(arr[a--]);
                } else {
                    list.add(arr[b++]);
                }
            } else if (a >= 0) {
                list.add(arr[a--]);
            } else {
                list.add(arr[b++]);
            }
        }

        Collections.sort(list);
        return list;
    }
}