package com.jb;
import java.util.Scanner;


public class practice {
    public static void main(String[ ] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter terminate Point:");
        int terminatePoint=sc.nextInt();
        int check=0;
        for(int intNo=0;intNo>-1;intNo++){

            int w;

            w = prime(intNo);
            if (w==0&&intNo!=1&&intNo!=0){
                check++;
                if (check==terminatePoint){
                    System.out.println(intNo+" is prime "+check);
                    main(arg);
                }


            }
        }
        main(arg);

    }
    public static int prime(int intNo){
        int check=0,hudai=1,behuda=1;
//        for(int z=1;z<=intNo;z++){
//            hudai*=z;
//        }
//        intNo=hudai;
//        for (int x=1;x<=intNo;x++){
//            behuda/=x;
//        }
//        intNo=behuda;
        for(int i=2;i<=Math.sqrt(intNo); i++){
            if(intNo % i==0){
                check++;
               // System.out.println(i+"\n");
            }
        }

        return check;
    }

}
