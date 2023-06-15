package com.company;

import java.util.ArrayList;

public class convert {

    public static int binaryToNum(String binary){
        int total=0;
        int count=1;
        //split the binary into each digit
        String[] input=binary.split("");
        int position= input.length-1;
        //convert each 1 to their corisponding number
        for(int i=0; i< input.length;i++){
            if (input[position].equals("1")){
                total+=count;
            }
            //change variable
            count*=2;
            position-=1;



        }
        //output total
        return total;
    }

    public static ArrayList numToBinary(int num){
        int binaryNum=1;
        int count=1;
        //get the corrisponding to the power of 2 for the number
        ArrayList<String> binary= new ArrayList<String>();
        while (num>binaryNum){
            binaryNum*=2;
            count+=1;
        }

        while (count>0){
            //convert number to binary
            if (num-binaryNum>=0){
                //one if the number can be subtracted
                binary.add("1");
                num-=binaryNum;
            }
            //and a zero if it can't
            else{
                binary.add("0");}
            count-=1;
            binaryNum/=2;
        }
        //return binary
        return binary;

    }

    public static ArrayList hexToBinary(String input){
        String[] splitInput=input.split("");
        ArrayList<String> binary= new ArrayList<String>();
//loop until we get the binary for each hex
        for (int i = 0; i < splitInput.length; i++) {
            //converts the hex to binary
            if (splitInput[i].equalsIgnoreCase("0")){
                binary.add("0000");
            }
            else if (splitInput[i].equalsIgnoreCase("1")){
                binary.add("0001");
            }
            else if (splitInput[i].equalsIgnoreCase("2")){
                binary.add("0010");
            }

            else if (splitInput[i].equalsIgnoreCase("3")){
            binary.add("0011");
        }
            else if (splitInput[i].equalsIgnoreCase("4")){
            binary.add("0100");
        }
            else if (splitInput[i].equalsIgnoreCase("5")){
                binary.add("0101");
            }
            else if (splitInput[i].equalsIgnoreCase("6")){
                binary.add("0110");
            }
            else if (splitInput[i].equalsIgnoreCase("7")){
                binary.add("0111");
            }
            else if (splitInput[i].equalsIgnoreCase("8")){
                binary.add("1000");
            }
            else if (splitInput[i].equalsIgnoreCase("9")){
                binary.add("1001");
            }
            else if (splitInput[i].equalsIgnoreCase("a")){
                binary.add("1010");
            }
            else if (splitInput[i].equalsIgnoreCase("b")){
                binary.add("1011");
            }
            else if (splitInput[i].equalsIgnoreCase("c")){
                binary.add("1100");
            }
            else if (splitInput[i].equalsIgnoreCase("e")){
                binary.add("1101");
            }
            else if (splitInput[i].equalsIgnoreCase("f")){
                binary.add("1111");
            }
            else{
                binary.add("invalid");
            }
        }
        //return binary list
        return binary;
    }
}
