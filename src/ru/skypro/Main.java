package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //
        int[] test = new int[3];
        test[0] = 1;
        test[1] = 2;
        test[2] = 3;
        System.out.print(test[0] + " " + test[1] + " " + test[2]);
        System.out.println();
        System.out.println(test[2] + " " + test[1] + " " + test[0]);


        double[] test2 = {1.57, 7.654, 9.986};
        test2[0] = 1.57;
        test2[1] = 7.654;
        test2[2] = 9.986;
        System.out.println(test2[0] + " " + test2[1] + " " + test2[2]);
        System.out.println(test2[2] + " " + test2[1] + " " + test2[0]);

        int[] one = {64, 250, 31};
        one[0] = 64;
        one[1] = 250;
        one[2] = 31;
        System.out.println(one[0] + " " + one[1] + " " + one[2]);
        int[] one2 = new int[3];
        one2[0] = 1;
        one2[1] = 2;
        one2[2] = 3;
        for( int i = 0; i< one2.length; i++) {
            if (one2[i] % 2 != 0) {

                one2[i]++ ;
            }
            System.out.print( one2[i]);
            if (i!= one2.length - 1 ) {
                System.out.print(", ");

            }
            




        }

    }
}














