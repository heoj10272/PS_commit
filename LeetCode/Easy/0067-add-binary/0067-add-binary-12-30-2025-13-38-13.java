class Solution {
    public String addBinary(String a, String b) { // "1101", "100" -> "10001" // "1011" , "001"

        if (a.equals("0") && b.equals("0")) return "0";

		String longs;
		String shorts;
		if (a.length() > b.length()) {
			longs = a; shorts = b;
		} else {
			longs = b; shorts = a;
		}
		
		StringBuilder sbl = new StringBuilder(longs);
		StringBuilder sbs = new StringBuilder(shorts);
		
		sbl = sbl.reverse();
		sbs = sbs.reverse();
		
		sbl.append("0");
		
		while(sbl.length() > sbs.length()) sbs.append("0");
        System.out.println("sbl : " + sbl);
        System.out.println("sbs : " + sbs);
		
		for (int i = 0; i < sbl.length(); i++) {
			int l = Character.getNumericValue(sbl.charAt(i));
			int s = Character.getNumericValue(sbs.charAt(i));
			int sum = l + s;
			if (sum >= 2) {
                System.out.println("sum : " + sum);
                sbl.setCharAt(i, (char) ('0' + sum - 2));
                System.out.println((char) ('0' +  Character.getNumericValue(sbl.charAt(i)) + 1));
                sbl.setCharAt(i+1, (char) ('0' +  Character.getNumericValue(sbl.charAt(i+1)) + 1));
			} else {
                sbl.setCharAt(i, (char) ('0' + sum));
			}
            System.out.println(sbl);
		}
		
		for (int i = sbl.length() -1; i>=0;i--) {
			if (sbl.charAt(i) == '0') {
				sbl.deleteCharAt(i);
			} else {
				break;
			}
		}
		
		return sbl.reverse().toString();
    }
}