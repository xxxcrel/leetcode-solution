package beer.cheese.queue;

import java.util.PriorityQueue;

/**
 * LeetCode: 239
 */
public class MaxSlidingWindow {

    public static void main(String[] args) {
        int[] param = {1, 3, -1, -3, 5, 3, 6, 7};
        for (int i : maxSlidingWindow(param, 3)) {
            System.out.println(i + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (x, e) -> e - x);
        int[] result = new int[nums.length - k + 1];
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= k) {
                result[r++] = queue.peek();
                queue.remove(nums[i - k]);
            }
            queue.offer(nums[i]);
        }
        result[r] = queue.peek();
        return result;
    }
}