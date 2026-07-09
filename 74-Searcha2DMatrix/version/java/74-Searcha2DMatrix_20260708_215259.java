// Last updated: 08/07/2026, 21:52:59
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int low = 0;
7        int high = m * n - 1;
8
9        while (low <= high) {
10            int mid = low + (high - low) / 2;
11
12            int row = mid / n;
13            int col = mid % n;
14
15            if (matrix[row][col] == target) {
16                return true;
17            } else if (matrix[row][col] < target) {
18                low = mid + 1;
19            } else {
20                high = mid - 1;
21            }
22        }
23
24        return false;
25    }
26}