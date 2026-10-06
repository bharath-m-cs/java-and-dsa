package Algorithms;

import java.util.Scanner;

public class SlideWindow {


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);


        System.out.println(" enter the no of frames");
        int n = sc.nextInt();


        System.out.println(" enter the window size");
        int w = sc.nextInt();


        System.out.println(" enter the frame no to simulate loss");
        int lost = sc.nextInt();




        int i =0 ;
        while( i<n)
        {
int end = Math.min( i+w, n);
            System.out.println(" sending frames");

            for( int j =i ; j<end ; j++)
            {
                System.out.print(" sending  "+ j +" frame");


            }


            boolean error = false;


            for(int j =i ; j<end ; j++)
            {
                if( j == lost )
                {
                    System.out.println(" frame " + j +"lost ");
                    error = true ;
                    break;

                }
                System.out.println(" ACk recrevied from frame "+ j );

            }

if( error )
{


    System.out.println(" retransimit");


    i= lost ;
    lost = -1;
}

else {


    System.out.println(" window lside forwsrd ");
    i = end ;


}

            System.out.println(" sucessuly comp[leted transimissom " +
                    "");



        }
    }
}
