class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] freq = new int[512];

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if (freq[a] != freq[256 + b]) {
                return false;
            }

            freq[a] = i + 1;
            freq[256 + b] = i + 1;
        }

        return true;
    }
}