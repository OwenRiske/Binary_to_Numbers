package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner INPUT = new Scanner(System.in);

        while(true){
            //turn off code
            if (true) {
                //input for binary
                System.out.println("Binary: ");
                //convert to num
                System.out.println(convert.binaryToNum(INPUT.nextLine()));
                //input number
                System.out.println("Number: ");
                //convert to binary
                ArrayList binary = convert.numToBinary(INPUT.nextInt());
                for (int i = 0; i < binary.size(); i++) {
                    System.out.print(binary.get(i));
                }
                System.out.println("\n");
            }
            else{
                //input hex
                System.out.println("Hexidecimal: ");
                //convert to binary
                ArrayList binary = convert.hexToBinary(INPUT.nextLine());
                for (int i = 0; i < binary.size(); i++) {
                    System.out.print(binary.get(i)+" ");

                }
                System.out.println("\n");
            }


        } }
    }
