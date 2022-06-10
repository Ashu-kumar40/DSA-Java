package com.Ashu.searching;

import java.sql.SQLOutput;
import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
//        String ask = in.nextLine();
//        if(ask.equals("Apple")){
//            System.out.println("Gravity");
//        }else{
//            System.out.println("Space");
//        }
//        -------------------------------------------------

        int l = 9;
        String word = "NTNTNTNTN";
        int countn = 0,countt = 0;
//        System.out.println(word.charAt(2));
        for (int i = 0; i < 9; i++) {
            if(word.charAt(i) == 'N'){
                countn++;
            }
            else{
                countt++;
            }
        }
        if (countn > countt){
            System.out.println("Nutan");
        }else{
            System.out.println("Tusla");
        }
    }
}
