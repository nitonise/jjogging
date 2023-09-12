package code.jjogging.track.array;

import java.util.Arrays;

public class ArrayCompare {
    public static void main(String[] args) {
        var arr1 = new Integer[0];
        var arr2 = new Integer[1];
        var arr3 = new Integer[2];
        var arr4 = new Integer[] {null};
        var arr5 = new Integer[] {1};

        System.out.println(Arrays.compare(arr1, arr2));
        System.out.println(Arrays.compare(arr2, arr3));
        System.out.println(Arrays.compare(arr1, arr4));
        System.out.println(Arrays.compare(arr4, arr5));
        System.out.println(Arrays.compare(arr3, arr5));
        System.out.println(Arrays.compare(arr2, arr4));
    }
}
