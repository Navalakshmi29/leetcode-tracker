// Last updated: 10/07/2026, 21:07:12
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    public List<String> binaryTreePaths(TreeNode root) {
19        List<String> ans = new ArrayList<>();
20        find(root, "", ans);
21        return ans;
22    }
23
24    public void find(TreeNode root, String path, List<String> ans) {
25        if (root == null)
26            return;
27
28        if (path.length() == 0)
29            path = "" + root.val;
30        else
31            path = path + "->" + root.val;
32
33        if (root.left == null && root.right == null) {
34            ans.add(path);
35            return;
36        }
37
38        find(root.left, path, ans);
39        find(root.right, path, ans);
40    }
41}