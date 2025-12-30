class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                sb.append(c);
                continue;
            }

            if (sb.length() == 0) {
                return false;
            }
            
            char top = sb.charAt(sb.length()-1);
            if (('(' == top && ')' == c) || 
                ('{' == top && '}' == c) ||
                ('[' == top && ']' == c)) {
                sb.deleteCharAt(sb.length()-1);
            } else {
                return false;
            }
        }
        return (sb.length() == 0);
    }
}