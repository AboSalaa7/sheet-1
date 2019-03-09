package com.company;

import java.util.Arrays;

public class specialutils {

    public static void reverse (int[] arr){
        int i;
        for (i=0;i<arr.length/2;i++){
            int temp;
            temp=arr[i];
            arr[i]= arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

        }

    }
    public static int[] sumEvenOdd(int[] arr) {
      int sum[]=new int[]{0,0};
      int i;
      for (i=0;i<arr.length;i++){
          if (arr[i]%2==0){
              sum[0]+=arr[i];
          }
          else {
              sum[1]+=arr[i];
          }
      }
      return sum;
    }
    public static double average(int[] arr){
        double sum=0;
        int i;
        for (i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg = sum/arr.length;
        return avg;
    }

    public static void moveValue(int[] arr, int val){
        int i,j,temp,counter=0;

        for (i=0;i<arr.length-1-counter;i++){

            if (arr[i]==val){
                temp=arr[i];
                arr[i]=arr[arr.length-1-counter];
                arr[arr.length-1-counter]=temp;

                counter++;

                for(j=i;j<arr.length-1-counter;j++){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                i--;
            }

        }
    }
    public static int [][] transpose(int[][] arr){
        int i,j,temp;
        int [][] tarr=new int[arr[0].length][arr.length];
        for (i=0;i<arr[0].length;i++){
            for(j=0;j<arr.length;j++){
              tarr[i][j]=arr[j][i];
            }

        }
        return tarr;
    }


    public static double fibonacci(int num){
        double fib0=0,fib1=1;
        double sum=0;
        if (num==0){
            return sum;
        }
        else if (num==1){
        return fib1;
        }
        else {
            for (int i=2;i<num;i++){

                sum=fib0+fib1;
                fib0=fib1;
                fib1=sum;
            }
        }
        return sum;
    }

}


