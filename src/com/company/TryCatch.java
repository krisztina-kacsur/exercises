package com.company;

import java.util.*;

public class TryCatch {

    public String getString () {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }


    public int getInt () {

        boolean repeat = true;
        int inputInt = 0;

        do {
            try {
                System.out.println("Enter a number: ");
                Scanner scan = new Scanner(System.in);
                inputInt = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value entered, please try again. ");
            }

        } while (repeat);

        return inputInt;

    }


    public float getFloat () {

        boolean repeat = true;
        float inputFloat = 0F;

        do {
            try {
                System.out.println("Enter a number: ");
                Scanner scan = new Scanner(System.in);
                inputFloat = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value entered, please try again. ");
            }

        } while (repeat);


        return inputFloat;

    }



    public double getDouble () {

        boolean repeat = true;
        double inputDouble = 0D;

        do {
            try {
                System.out.println("Enter a number: ");
                Scanner scan = new Scanner(System.in);
                inputDouble = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value entered, please try again. ");
            }

        } while (repeat);

        return inputDouble;

    }


    public byte getByte () {

        boolean repeat = true;
        byte inputByte = 0;

        do {
            try {
                System.out.println("Enter a number: ");
                Scanner scan = new Scanner(System.in);
                inputByte = scan.nextByte();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value entered, please try again. ");
            }

        } while (repeat);

        return inputByte;
    }



    public int[] arrayIndexInput (int position) {



        int [] myArray = new int[position];

        for (int i = 0; i < myArray.length; i++) {
            boolean test = true;

            do {

                try {

                    System.out.println("Please enter the " + (i + 1) + " number of the array: ");
                    Scanner scan = new Scanner(System.in);
                    myArray[i] = scan.nextInt();
                    test = false;

                } catch (InputMismatchException e) {
                    System.out.println("Incorrect value entered, please try again. ");
                }

            } while (test);
        }
        System.out.println("My array is: " + Arrays.toString(myArray));
        return myArray;

    }


    public List<Integer> returnList () {

        List<Integer> myList = new ArrayList<>();

        boolean stopTest = true;
        int input = 0;

        do {

            try {

                System.out.println("Please enter a value ");
                Scanner scan = new Scanner(System.in);
                input = scan.nextInt();
                myList.add(input);


            } catch (InputMismatchException e) {
                stopTest = false;
                System.out.println("Your list: " + myList);
            }
        } while ((input > Integer.MIN_VALUE) && (input <Integer.MAX_VALUE) && stopTest);

        return myList;

    }




}
