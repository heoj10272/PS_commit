class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] a = new int[256];
        int[] b = new int[256];

        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i);
            int y = t.charAt(i);
            if (a[x] != b[y]) {
                return false;
            }
            // 마지막 등장 위치 추적
            a[x] = i + 1;
            b[y] = i + 1;
        }
        return true;
    }
}