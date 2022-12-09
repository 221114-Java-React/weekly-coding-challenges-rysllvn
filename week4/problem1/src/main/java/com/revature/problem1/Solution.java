package com.revature.problem1;

import java.util.Arrays;

public class Solution {
    public int elementNotInArray(int[] arr, int k) {
        Arrays.sort(arr);

        int i = 0;
        while (true) {
            if (arr[i] > k) {
                break;
            }
            i++;
        }

        int currEl = k + 1;
        for (int j = i; j < arr.length; j++) {
            if (arr[j] != currEl) {
                return currEl;
            }
            currEl = currEl + 1;
        }
        return currEl + 1;
    }
}

//    int[] arr = {1, 4, 5, 2, 7};
//    int k = 4; answer is 6,
