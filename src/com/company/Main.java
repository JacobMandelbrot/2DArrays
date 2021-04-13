package com.company;

public class Main {

    public static void main(String[] args) {

       // int[][] myArr = new int[2][2];

        int[][] myArr = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i = 0; i < myArr.length; i++) {
            for(int k = 0; k < myArr[0].length; k++){
                System.out.print(myArr[i][k]);
            }
            System.out.println();
            System.out.println();
        }
    }
}
