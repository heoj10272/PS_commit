class Solution {
    public boolean isPalindrome(String s) {
        if (s.strip().length() < 2) return true;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 97 && s.charAt(i) <= 122) ||
                (s.charAt(i) >= 48 && s.charAt(i) <= 57)) {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) >= 65 && s.charAt(i) <= 90){
                sb.append((char) (s.charAt(i) + 32));
            }
        }
        return sb.substring(0, sb.length()/2).equals(sb.reverse().substring(0, sb.length()/2));
    }
}