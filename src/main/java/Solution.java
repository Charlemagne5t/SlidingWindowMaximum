import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k + 1];
        int left = 0;
        int right = k - 1;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());


        for (int i = 0; i < k; i++) {
            priorityQueue.add(nums[i]);
        }

        for (int i = 0; right < nums.length; left++, right++, i++) {
            result[i] = priorityQueue.peek();
            deleteFromPQ(priorityQueue, nums[left]);
            if(right != nums.length - 1) {
                priorityQueue.add(nums[right + 1]);
            }
        }

        return result;

    }
    private void deleteFromPQ(PriorityQueue<Integer> priorityQueue, int val){
        Queue<Integer> temp = new LinkedList<>();

        while (priorityQueue.peek() != val){
            temp.add(priorityQueue.poll());
        }
        priorityQueue.poll();
        priorityQueue.addAll(temp);
    }
}
