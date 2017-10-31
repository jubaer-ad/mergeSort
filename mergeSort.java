package com.jb;
import java.util.Scanner;
public class mergeSort {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter array size: ");
        size = sc.nextInt();
        int[] Array = new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0; i<size; i++){
            System.out.println((i+1)+" :");
            Array[i] = sc.nextInt();
        }
        int[] result = merge(Array);
        System.out.println("Inputed Array is: ");
        for(int i=0; i<Array.length; i++){
            System.out.print(+Array[i]);
            if(i<(Array.length-1)){
                System.out.print("|");
            }
        }
        System.out.println("\n");
        System.out.println("Sorted Array is: ");
        for(int i=0; i<result.length; i++){
            System.out.print(+result[i]);
            if(i<(result.length-1)){
                System.out.print("|");
            }
        }
        System.out.println("\n");
        main(arg);

    }

    public static int[] merge(int [] array){

        int size = array.length;
        if(size<2)
            return array;
        int[] left = new int[(size/2)];
        int[] right = new int[(size-(size/2))];
        for(int i=0; i<(size/2); i++ ){
            left[i] = array[i];
        }
        for(int i=(size/2); i<(size); i++ ){
            right[i-(size/2)] = array[i];
        }
        merge(left);
        merge(right);
        int[] a= mergeSort(left, right, array);
        return a;

    }

    public static int[] mergeSort(int[] left, int[] right,int[] array){
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                array[k] = left[i];
                i++;
            }
            else{
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            array[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            array[k] = right[j];
            j++;
            k++;
        }
        return array;
    }

}
