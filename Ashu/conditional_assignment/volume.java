package com.Ashu.conditional_assignment;

import java.util.Scanner;

public class volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // volume of cone
//        System.out.print("Enter the Radius of the cone = ");
//        int r = in.nextInt();
//        System.out.print("Enter the height of the cone = ");
//        int h = in.nextInt();
//        float vol = 1/3f*3.14f*r*r*h;
//        System.out.print("The volume of the cone is = " +vol);

        // Volume of the prism
//        System.out.print("Write the side of the prism = ");
//        int s = in.nextInt();
//        System.out.print("Enter the height of the prism = ");
//        int H = in.nextInt();
//        float volP = (float) ((Math.sqrt(3)/2)*s*s * H);
//        System.out.print("The volume of the prism is = "+volP);

        //volume of pyramid
        System.out.print("base length: ");
        int bl = in.nextInt();
        System.out.print("base width: ");
        int bw = in.nextInt();
        System.out.print("height: ");
        int ph = in.nextInt();
        float volpy = bl*bw*ph/3f;
        System.out.print("The volume of the pyramid is = "+volpy);

    }
}
