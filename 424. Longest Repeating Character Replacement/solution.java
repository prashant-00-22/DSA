class Solution {
    public int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int left = 0;
        int maxcount = 0;
        int maxlen = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add right character
            count[s.charAt(right) - 'A']++;

            // Maximum frequency in current window
            maxcount = Math.max(
                maxcount,
                count[s.charAt(right) - 'A']
            );

            // Characters which need replacement
            while (right - left + 1 - maxcount > k) {

                // Remove LEFT character
                count[s.charAt(left) - 'A']--;

                left++;
            }

            maxlen = Math.max(
                maxlen,
                right - left + 1
            );
        }

        return maxlen;
    }
}
