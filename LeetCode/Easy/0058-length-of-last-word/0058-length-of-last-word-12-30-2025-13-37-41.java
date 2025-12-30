class Solution {
    public int lengthOfLastWord(String s) {
        String st = s.strip();
        return st.length() - (st.lastIndexOf(' ') + 1);
    }
}