package com.jb;

import java.util.Scanner;

public class practice2 {

    static int c=0,c2=0;


    public static void main(String[ ] arg){
        int check2=0;


        System.out.println("Enter a positive integer number: ");
        Scanner sc =new Scanner (System.in);
        int intNo = sc.nextInt();
        if(intNo<0) {
            check2=c2;
            check2++;
            c2=check2;
            System.out.println(intNo+" is not positive. Try again...");
            if(check2!=4){
                System.out.println("Chances remaining..."+(4-check2));
                main(arg);
            }
            else{
                System.out.println("You are dead...\nPray to GOD or run again.");
            }

        }
        else {
            int w = prime(intNo);
            if (w==0&&intNo!=1&&intNo!=0)
                System.out.println(intNo+" is prime");
            else
                System.out.println(intNo+" is not prime");
            main(arg);
        }


    }
    public static int prime(int intNo){
        int check=0,check2=0;


        for(int i=2;i<=Math.sqrt(intNo); i++){
            if(intNo % i==0){
                check++;
                System.out.println(i+"\n");
            }
        }

        return check;
    }

}
