package com.company;

import java.util.Arrays;
import java.util.List;

public class Exercises {



        public void cozaLozaWoza () {
            int startFrom = 1;
            int endAt = 110;

            while (startFrom <= endAt) {
                if (startFrom % 11 == 0) {
                    System.out.println(startFrom + "\n");
                } else if (startFrom % 3 == 0 && startFrom % 5 == 0 && startFrom % 7 == 0) {
                    System.out.print("CozaLozaWoza ");
                } else if (startFrom % 5 == 0 && startFrom % 7 == 0) {
                    System.out.print("WozaLoza ");
                } else if (startFrom % 3 == 0 && startFrom % 7 == 0) {
                    System.out.print("CozaWoza ");
                } else if (startFrom % 3 == 0 && startFrom % 5 == 0) {
                    System.out.print("CozaLoza ");
                } else if (startFrom % 7 == 0) {
                    System.out.print("Woza ");
                } else if (startFrom % 5 == 0) {
                    System.out.print("Loza ");
                } else if (startFrom % 3 == 0) {
                    System.out.print("Coza ");
                } else
                    System.out.print(startFrom + " ");
                startFrom++;

            }
        }


        public void printNumber ( int number){
            switch (number) {
                case 0:
                    System.out.println("The number is 0");
                    break;
                case 1:
                    System.out.println("The number is 1");
                    break;
                case 2:
                    System.out.println("The number is 2");
                    break;
                case 3:
                    System.out.println("The number is 3");
                    break;
                case 4:
                    System.out.println("The number is 4");
                    break;
                case 5:
                    System.out.println("The number is 5");
                    break;
                case 6:
                    System.out.println("The number is 6");
                    break;
                case 7:
                    System.out.println("The number is 7");
                    break;
                case 8:
                    System.out.println("The number is 8");
                    break;
                case 9:
                    System.out.println("The number is 9");
                    break;
                default:
                    System.out.println("Not allowed");
            }
        }

        public void stars () {
            System.out.println("Star pattern \n");
            int rows;
            int columns;

            for (rows = 7; rows >= 1; rows--) {
                for (columns = 1; columns <= rows; columns++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        public void linePattern () {

            char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};

            for (int i = 0; i <= 10; i++) {
                System.out.println(line);
            }
        }


        public void copyArray ( int[] originalArray, int[] emptyArray){

            for (int i = 0; i < originalArray.length; i++) {
                emptyArray[i] = originalArray[i];
            }
        }

    public void reverseArray (int [] array) {

        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < array.length/2; i++){

            int rev = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = rev;
        }
        System.out.println("Array after reverse: " + Arrays.toString(array));
    }

    public void duplicated (int[] array) {

        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++){

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array [j]) {
                    System.out.println("Repeated elements: " + array[i]);
                }
            }

        }

    }

    public void similarValues (String[] firstArray, String[] secondArray)  {

        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        for (int i = 0; i < firstArray.length; i++){

            for (int j = 0; j < secondArray.length; j++) {

                if (firstArray[i].equals(secondArray [j])) {
                    System.out.print (firstArray[i] + " ");
                }
            }
        }
    }


    public void startListFromPosition (List<Integer> list, int startFromPosition) {

        for (int i = startFromPosition; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public void reverseList (List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }


    public int returnMaxValue (List<Integer> list) {

        int max = 0;

        for (int i = 0; i < list.size(); i++) {
            if ( list.get(i) > max) {
                max = list.get(i);

            }
        }

        System.out.println(max);
        return max;

    }

    public void switchPosition (List<Integer> list, int firstIndex, int secondIndex) {
        System.out.println("original list: " + list);



        int firstValue;
        int secondValue;

        firstValue = list.get(firstIndex);
        secondValue = list.get(secondIndex);

        list.remove(firstIndex);
        list.add(firstIndex, secondValue);

        list.remove(secondIndex);
        list.add(secondIndex,firstValue);


        System.out.println(list);


    }


}
