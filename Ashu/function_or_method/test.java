package com.Ashu.function_or_method;

public class test {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,5,9}
        };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if((i+j) % 2 != 0){ // because i+j = odd
                    sum = sum + arr[i][j];
                }
            }
        }
        for (int i = 2; i < sum; i++) {
            if (sum%i == 0) {
                System.out.println(sum+" is not prime");
                break;
            }
            if (i==sum-1) System.out.println(sum+" is Prime");
        }
        if (sum==2) System.out.println("Prime");


        // interchange the position of first element of the array with the last element


        int[] oldArr = {1,2,3,4,5,6,7,8,9};
        int[] NewArr = new int[oldArr.length];

        for (int i = 0; i < oldArr.length; i++) {
            if (i == 0){
                NewArr[i] = oldArr[oldArr.length-1];
            }
            else {
                NewArr[i] = oldArr[i-1];
            }
            System.out.print(NewArr[i]);
        }

        int[] array = {1,2,3,4,5,6,7,8,9};
        int max = array[0];
        int min = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
                max = array[i];
            else if (array[i] < min)
                min = array[i];
        }
        int k = max - min;

        System.out.println(k);

        // checking for prime
        for (int i = 2; i < k; i++) {
            if (k%i == 0) {
                System.out.println(k +" is not prime");
                break;
            }
            if (i==k-1) System.out.println(k+" is Prime");
        }
        if (k==2) System.out.println("Prime");
    }
}
