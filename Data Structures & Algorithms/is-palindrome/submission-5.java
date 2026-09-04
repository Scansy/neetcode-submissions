class Solution {
    public boolean isPalindrome(String s) {
        int x, y;
        x = 0;
        StringBuilder str = trim(s);
        y = str.length() - 1;

        while (x < y) {
            if (str.charAt(x) != str.charAt(y)) {
                return false;
            }
            x++; y--;
        }
        return true;
    }

    private StringBuilder trim(String s) {
        StringBuilder str = new StringBuilder(s.length());
        s = s.toLowerCase();

        for (char v : s.toCharArray()) {
            if (Character.isLetterOrDigit(v)) {
                str.append(v);
            }
        }
        return str;
    }
}
