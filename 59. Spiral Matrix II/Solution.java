class Solution {
    public int[][] generateMatrix(int n) {

        int[][] spiral = new int[n][n];

        int fr = 0;
        int lr = n - 1;
        int fc = 0;
        int lc = n - 1;

        int num = 1;

        while (fr <= lr && fc <= lc) {

            // Left to Right
            for (int i = fc; i <= lc; i++) {
                spiral[fr][i] = num++;
            }
            fr++;

            // Top to Bottom
            for (int i = fr; i <= lr; i++) {
                spiral[i][lc] = num++;
            }
            lc--;

            // Right to Left
            if (fr <= lr) {
                for (int i = lc; i >= fc; i--) {
                    spiral[lr][i] = num++;
                }
                lr--;
            }

            // Bottom to Top
            if (fc <= lc) {
                for (int i = lr; i >= fr; i--) {
                    spiral[i][fc] = num++;
                }
                fc++;
            }
        }

        return spiral;
    }
}
