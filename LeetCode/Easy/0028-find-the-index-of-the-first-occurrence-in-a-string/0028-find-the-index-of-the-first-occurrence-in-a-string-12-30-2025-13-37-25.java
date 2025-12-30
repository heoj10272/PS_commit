class Solution {
    public int strStr(String haystack, String needle) {
        int hl = haystack.length();
        int nl = needle.length();

        if (hl < nl) {
            return -1;
        }
        for (int i = 0; i < hl - nl + 1; i++) {
            if(checkString(haystack, needle, i)){
                return i;
            }
        }
        return -1;
    }

    private boolean checkString(String h, String n, int idx) {
        for (int i = 0; i < n.length(); i++) {
            if (h.charAt(i+idx) != n.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}