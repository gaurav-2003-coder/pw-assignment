package backtracking;

public class SubsetProduct {
    private static boolean canProductEqualTarget(int[] arr, int target) {
        return canProductEqualTarget(arr, target, 1, 0);
    }

    private static boolean canProductEqualTarget(int[] arr, int target, int product, int start) {
        if (product == target) {
            return true;
        }
        for (int i = start; i < arr.length; i++) {
            if (product * arr[i] <= target) {
                if (canProductEqualTarget(arr, target, product * arr[i], i + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 4};
        int target = 16;
        System.out.println(canProductEqualTarget(arr, target)); // Output: true
    }
}
