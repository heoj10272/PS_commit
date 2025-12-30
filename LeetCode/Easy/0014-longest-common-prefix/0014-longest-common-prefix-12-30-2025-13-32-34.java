class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {
            for (String s : strs) {
                if (i+1 > s.length() || first.charAt(i) != s.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(first.charAt(i));
        }
        return sb.toString();
    }
}