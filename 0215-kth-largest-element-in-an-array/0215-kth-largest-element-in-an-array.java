class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); 
        for (int i=0; i<nums.length; i++) {
            maxHeap.add(nums[i]);  //pushing all elements in maxHeap
        }
        while (k>1) {
            maxHeap.poll();   //popping (k-1) times
            k--;
        }
        return maxHeap.poll();  //returning the top element in maxHeap
    }
}
