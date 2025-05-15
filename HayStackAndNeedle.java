public class HayStackAndNeedle {
    public int strStr(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();

        int i = 0;
        while (i <= m - n) {
            int j = 0;

            if (haystack.charAt(i) == needle.charAt(j)) {
                int k = i;
                while (haystack.charAt(k) == needle.charAt(j)) {
                    k++;
                    j++;
                    if (j == n)
                        return i;
                }
            }
            i++;
        }
        return -1;
    }
}

//TC: O(m*n), SC: O(1)
