class Solution {
    public int romanToInt(String s) {
        int rslt = 0;
        int length = s.length();
        for (int i = 0; i <= length -1; i++) {
            int currInt = valueOf(s.charAt(i));
            if (i == (length -1)) {
                rslt += currInt;
                continue;
            }
            int nextInt = valueOf(s.charAt(i+1));
            
            rslt += (currInt < nextInt) ? -currInt : currInt;
        }
        return rslt;
    }

    private static int valueOf(char c) {
        return switch(c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default ->
                throw new IllegalArgumentException();
        };
    }
}