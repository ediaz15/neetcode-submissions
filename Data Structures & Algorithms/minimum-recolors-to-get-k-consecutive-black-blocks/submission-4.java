class Solution {
    public int minimumRecolors(String blocks, int k) {
        int currentW = 0;
        int minW = k;

        for (int i = 0; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W')           currentW++;
            if (i >= k && blocks.charAt(i - k) == 'W') currentW--;
            if (i >= k - 1) minW = Math.min(minW, currentW);
        }

        return minW;
    }
}