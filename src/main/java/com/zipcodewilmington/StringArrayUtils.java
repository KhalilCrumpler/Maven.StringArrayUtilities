package com.zipcodewilmington;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int len = array.length;
        return array[len-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int len = array.length;
        return array[len-2];

    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i = 0; i < array.length; i++){
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int len = array.length;
        int j = len;
        String[] newArray = new String[len];
        for(int i = 0; i < array.length; i++){
            newArray[j-1] = array[i];
            j -=1;
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] newArray = StringArrayUtils.reverse(array);
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(newArray[i])){
                count +=1;
            }
        }
        return count == array.length;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String newString = "";
        for(int i = 0; i < array.length; i++){
            newString += array[i];
        }
        newString = newString.toLowerCase().replaceAll("[^a-z]", "").replaceAll("(.)(?=.*\\1)", "");

        return newString.length() == 26;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                count +=1;
            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int diffLength = array.length;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(valueToRemove)){
                diffLength--;
            }
        }
        String[] result = new String[diffLength];
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(!array[i].equals(valueToRemove)){
                result[count] = array[i];
                count++;
            }
        }
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.add(array[0]);
        String temp = array[0];
        for(int i = 1; i < array.length; i++){
            if(!temp.equals(array[i])){
                newArray.add(array[i]);
                temp = array[i];
            }
        }
      return newArray.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList<>();
        newArray.add(array[0]);
        String temp = array[0];
        int counter = 0;
        for(int i = 1; i < array.length; i++){
            if(temp.equals(array[i])) {
                newArray.set(counter, newArray.get(counter) + temp);
            }

            else{
                newArray.add(array[i]);
                temp = array[i];
                counter++;
            }
        }
        return newArray.toArray(new String[0]);
    }


}
