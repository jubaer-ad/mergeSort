package com.jb;

public class practice4 {
    public static void main(String arg[]){
        int a [] = new int[10];
        for (int i=0;i<a.length;i++){
            a[i] = fib(i);
        }
        System.out.println("Index\tValue");
        for (int i=0;i<a.length;i++){

            System.out.println(i+"\t\t\t"+a[i]);
        }
    }
    public static int fib(int G){
        if(G<=1)
            return G;
        else{
            return fib(G-1)+fib(G-2);
        }
    }
}
