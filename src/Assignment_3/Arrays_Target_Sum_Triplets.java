package Assignment_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrays_Target_Sum_Triplets {
    public static void main(String[] args) {
        int[] nums = {5, 7, 9, 1, 2, 4, 6, 8, 3};
        int target = 10;

        List<List<Integer>> triplets = findThreeNumbers(nums, target);

        if (!triplets.isEmpty()) {
            System.out.println("Three numbers found:");
            for (List<Integer> triplet : triplets) {
                System.out.println(triplet.get(0) + ", " + triplet.get(1) + ", " + triplet.get(2));
            }
        } else {
            System.out.println("No three numbers found in the array that sum up to the target.");
        }
    }

    public static List<List<Integer>> findThreeNumbers(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array in ascending order
        List<List<Integer>> triplets = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++; // Skip duplicates
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--; // Skip duplicates
                    }
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return triplets;
    }
}
