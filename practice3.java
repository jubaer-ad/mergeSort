package com.jb;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] arg) {
        int copy;
        int check;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter targeted no.:");
        int targetedPoint=sc.nextInt();
        if (targetedPoint<100000&&targetedPoint>0){
            copy=2;
            check = 0;
            test(copy, check, targetedPoint);
            main(arg);
        }
        else if (targetedPoint>=100000&&targetedPoint<=199999){
            copy=1299709;
            check = 99999;
            test(copy, check, targetedPoint);
            main(arg);
        }


        else if (targetedPoint>=200000&&targetedPoint<=299999){
            copy=2750159;
            check = 199999;
            test(copy, check, targetedPoint);
            main(arg);
        }

        else if (targetedPoint>=300000&&targetedPoint<=399999) {
            copy = 425623;
            check = 299999;
            test(copy, check, targetedPoint);
            main(arg);
        }

        else if (targetedPoint>=400000&&targetedPoint<=499999){
            copy=5800079;
            check = 399999;
            test(copy, check, targetedPoint);
            main(arg);
        }

        else if (targetedPoint>=500000&&targetedPoint<=599999){
            copy=7368787;
            check = 499999;
            test(copy, check, targetedPoint);
            main(arg);
        }

        else if (targetedPoint>=600000&&targetedPoint<=699999){
            copy=8960453;
            check = 599999;
            test(copy, check, targetedPoint);
            main(arg);
        }

        else if (targetedPoint>=700000&&targetedPoint<=799999){
            copy=10570841;
            check = 699999;
            test(copy, check, targetedPoint);
            main(arg);
        }

        else if (targetedPoint>=800000&&targetedPoint<=899999){
            copy=12195257;
            check = 799999;
            test(copy, check, targetedPoint);
            main(arg);
        }

        else if (targetedPoint>=900000&&targetedPoint<=999999){
            copy=13834103;
            check = 899999;
            test(copy, check, targetedPoint);
            main(arg);
        }

        else if  (targetedPoint==999999){
            copy=15485857;
            check = 999998;
            test(copy, check, targetedPoint);
            main(arg);
        }
    }

    public static int prime(int intNo){
        int check2=0;
        for(int i=2;i<=Math.sqrt(intNo); i++){
            if(intNo % i==0){
                check2++;
            }
        }
        return check2;
    }

    public static void test(int copy, int check, int targetedPoint){
        for(int intNo=copy;intNo>-1;intNo++){
            int w;
            w = prime(intNo);
            if (w==0&&intNo!=1&&intNo!=0){
                check++;
                if (check==targetedPoint){
                    System.out.println(intNo+" is prime "+check);
                    break;
                }
            }
        }
    }
}