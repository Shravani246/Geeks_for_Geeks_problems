import java.util.*;

class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            // Remove indices out of the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove elements smaller than current from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Add current index to the back
            dq.offerLast(i);

            // Window has hit size k, record max
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }
}
