package beer.cheese.greedy;

import java.util.Arrays;

/**
 * LeetCode: 455
 */
public class FindContentChildren {

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{10, 9, 8, 7}, new int[]{10, 9, 8, 7}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                i++;
            }
            j++;
        }
        return i;
    }
}
