
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int[] result = {-1, -1}; // Default result if target is not found

//         // First binary search loop to find the leftmost (first) occurrence of target
//         int left = 0, right = nums.length - 1;
//         while (left <= right) {
//             int mid = (left + right) / 2;
//             if (nums[mid] < target) {
//                 left = mid + 1; // Search in the right half
//             } else {
//                 right = mid - 1; // Search in the left half
//             }
//         }
//         // Check if target is found and is present at the left index
//         if (left >= nums.length || nums[left] != target) return result; 
//         result[0] = left; // Set leftmost index of target

//         // Second binary search loop to find the rightmost (last) occurrence of target
//         right = nums.length - 1; // Reset right boundary
//         while (left <= right) {
//             int mid = (left + right) / 2;
//             if (nums[mid] <= target) {
//                 left = mid + 1; // Search in the right half
//             } else {
//                 right = mid - 1; // Search in the left half
//             }
//         }
//         result[1] = right; // Set rightmost index of target

//         return result; // Return the range [leftmost, rightmost]
//     }
// }


class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                if (result[0] == -1) result[0] = i; // First occurrence
                result[1] = i; // Update last occurrence
                
            }
        }

        return result;
    }
} 