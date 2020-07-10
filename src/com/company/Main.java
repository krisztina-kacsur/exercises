package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Exercises exercises = new Exercises();
        TryCatch tryCatch = new TryCatch();


        exercises.cozaLozaWoza();
        exercises.printNumber(1);
        exercises.stars();
        exercises.linePattern();


        int [] populatedArray = {9, 72, 136, 98, 4};
        int [] emptyArray = new int[populatedArray.length];
        exercises.copyArray(populatedArray, emptyArray);


        int [] reverseThisArray = {7,8,9,10,11};
        exercises.reverseArray(reverseThisArray);


        int[] withDuplicates = {1,2,3,6,3,2,9,8};
        exercises.duplicated(withDuplicates);


        String[] first = {"apple" , "car", "coffee" , "cat" , "cherry"};
        String[] second = {"apple", "cherry" , "grapes"};
        exercises.similarValues(first, second);


        List<Integer> myList = new ArrayList();
        myList.add(1);
        myList.add(2);
        myList.add(9);
        myList.add(21);
        myList.add(31);
        myList.add(60);
        myList.add(74);
        myList.add(105);

        exercises.startListFromPosition(myList, 4);
        exercises.reverseList(myList);
        exercises.returnMaxValue(myList);
        exercises.switchPosition(myList, 2, 3);


        
        String inputS = tryCatch.getString();
        int inputI = tryCatch.getInt();
        float inputF = tryCatch.getFloat();
        double inputD = tryCatch.getDouble();
        byte inputB = tryCatch.getByte();
        tryCatch.arrayIndexInput(4);
        tryCatch.returnList();










    }
}
