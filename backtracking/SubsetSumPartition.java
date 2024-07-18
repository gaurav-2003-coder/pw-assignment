package backtracking;

public class SubsetSumPartition {
    public static boolean canPartitionKSubsets(int[] arr, int k) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        if (totalSum % k != 0) {
            return false;
        }
        int target = totalSum / k;
        boolean[] visited = new boolean[arr.length];
        return canPartition(0, arr, visited, k, 0, target);
    }

    private static boolean canPartition(int start, int[] arr, boolean[] visited, int k, int currentSum, int target) {
        if (k == 0) {
            return true;
        }
        if (currentSum == target) {
            return canPartition(0, arr, visited, k - 1, 0, target);
        }
        for (int i = start; i < arr.length; i++) {
            if (!visited[i] && currentSum + arr[i] <= target) {
                visited[i] = true;
                if (canPartition(i + 1, arr, visited, k, currentSum + arr[i], target)) {
                    return true;
                }
                visited[i] = false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2};
        int k = 2;
        System.out.println(canPartitionKSubsets(arr, k)); // Output: true
    }
}

