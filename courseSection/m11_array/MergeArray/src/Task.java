import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArray(new int[]{1, 2, 3}, new int[]{4, 5})));
        System.out.println(Arrays.toString(mergeArray(new int[]{5, 25, 1}, new int[]{0, 3, 6})));
        System.out.println(Arrays.toString(mergeArray(new int[]{8}, new int[]{4, 10, 9, 2})));
    }

    public static int[] mergeArray(int[] nums1, int[] nums2){

        //Write your solution here
        int[] merged = new int[nums1.length + nums2.length];
        int index = 0;
        int i = 0;

        while (i < nums1.length && i < nums2.length) {
            merged[index++] = nums1[i];
            merged[index++] = nums2[i];
            i++;
        }

        while (i < nums1.length) {
            merged[index++] = nums1[i++];
        }

        while (i < nums2.length) {
            merged[index++] = nums2[i++];
        }
        return merged;
    }

}