// Last updated: 08/07/2026, 21:40:15
class Solution {
    static final long MOD = 1000000007L;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        int size = 2 * m;
        long[][] T = new long[size][size];
        for (int x = 0; x < m; x++) {
            // up -> down
            for (int y = x + 1; y < m; y++) {
                T[m + y][x] = 1;
            }

            // down -> up
            for (int y = 0; y < x; y++) {
                T[y][m + x] = 1;
            }
        }
        long[][] P = power(T, n - 2);
        long[] start = new long[size];
        for (int a = 0; a < m; a++) {
            for (int b = 0; b < m; b++) {
                if (a < b)
                    start[a]++;
                else if (a > b)
                    start[m + a]++;
            }
        }

        long ans = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                ans = (ans + start[j] * P[j][i]) % MOD;
            }
        }

        return (int) ans;
    }

    private long[][] power(long[][] mat, long exp) {
        int n = mat.length;

        long[][] res = new long[n][n];
        for (int i = 0; i < n; i++) {
            res[i][i] = 1;
        }

        while (exp > 0) {
            if ((exp & 1) == 1)
                res = multiply(res, mat);

            mat = multiply(mat, mat);
            exp >>= 1;
        }

        return res;
    }

    private long[][] multiply(long[][] A, long[][] B) {
        int n = A.length;
        long[][] C = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (A[i][k] == 0) continue;

                for (int j = 0; j < n; j++) {
                    C[i][j] = (C[i][j] + A[i][k] * B[k][j]) % MOD;
                }
            }
        }

        return C;
    }
}