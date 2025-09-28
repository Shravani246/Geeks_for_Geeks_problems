class Solution {
    public int findMaximum(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Edge cases: if mid is at boundaries
            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid]; // Bitonic point found
                } else if (arr[mid] > arr[mid - 1]) {
                    low = mid + 1; // Go right (increasing slope)
                } else {
                    high = mid - 1; // Go left (decreasing slope)
                }
            } 
            // If mid is at boundaries
            else if (mid == 0) {
                return arr[0] >= arr[1] ? arr[0] : arr[1];
            } 
            else if (mid == arr.length - 1) {
                return arr[arr.length - 1] >= arr[arr.length - 2] 
                        ? arr[arr.length - 1] 
                        : arr[arr.length - 2];
            }
        }
        return -1; // should never happen (guaranteed one bitonic point)
    }
}
