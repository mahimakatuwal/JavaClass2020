package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scnr  = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scnr.next();

        System.out.println("The score for " + password + " is: " + String.format("%.3f", password_strength(password)));
    }

    public static double password_strength(String password) throws IOException {
        //variables for each cases.
        double pw_score = 0;
        double pass_lc = 0;
        double pass_uc = 0;
        double pass_digit = 0;
        double pass_char = 0;
        double pass_dictionary = 0;
        int pass_length = password.length();

        //Changing password into characters
        char[] toChar = password.toCharArray();

        //checking for lower case and upper case letters in the password
        for(int i = 0; i< toChar.length; i++) {
            if (Character.isLowerCase(toChar[i])) {
                pass_lc = (Math.log(Math.pow(26, pass_length)) / Math.log(2)) ;
                i = toChar.length;
            }
        }
        for(int a = 0; a < toChar.length; a++){
            if(Character.isUpperCase(toChar[a])){
                pass_uc = (Math.log(Math.pow(26, pass_length))/Math.log(2)) ;
                a = toChar.length;
            }
        }

        //checking the use of the numbers in the password
        for(int j = 0; j < toChar.length; j++){
            if(Character.isDigit(toChar[j])){
                pass_digit = (Math.log(Math.pow(10, pass_length)) /Math.log(2));
                j = toChar.length;
            }
        }

        //checking the use of special characters in the password
        for(int k = 0; k < toChar.length; k++){
            if(!Character.isDigit(toChar[k]) & !Character.isLetter(toChar[k])){
                pass_char = (Math.log(Math.pow(33, pass_length))/Math.log(2));
                k = toChar.length;
            }
        }

        //checking the use of dictionary words in the password
        //reads each line from the file and adding all the words in the arraylist called wordInDict
        FileReader fr = new FileReader("words");
        BufferedReader bufferedReader = new BufferedReader(fr);
        List<String> wordInDict = new ArrayList<String>();
        String lineInDict = null;
        while((lineInDict = bufferedReader.readLine()) != null){
            String[] words = lineInDict.split("\n");
            wordInDict.addAll(Arrays.asList(words));
        }

        //iterates through each word from the array list, wordIndict, and compares with the password.
        double max_dictscore = 0;
        double min_dictscore = 0;
        for(String str: wordInDict) {
            if (password.equalsIgnoreCase(str)) {
                System.out.println("You have a dictionary word in your password.");
                pass_dictionary = (Math.log(wordInDict.size()) / Math.log(2)) * pass_length;
                max_dictscore = (Math.log(wordInDict.size())/Math.log(2)) * 256;
                min_dictscore = (Math.log(wordInDict.size())/Math.log(2));
                break;
            }
        }

        //checking the length of the password
        double max_score = 0;
        double min_score = (Math.log(95)/ Math.log(2)) + min_dictscore;

        if(password.length() >= 1 & password.length() <= 256){
            max_score =  (256 * (Math.log(95)/Math.log(2))) + max_dictscore;
        }
        else {
            System.out.println("Please enter password with length in between 1-256");
            return 0;
        }

        //total possible scores for the password
        pw_score = pass_char + pass_digit + pass_lc + pass_uc + pass_dictionary;
        System.out.println("Entropy bits: " + pw_score + " bits.");

        //normalizing the password score, pw-score.
        double norm_score = (pw_score - min_score) / (max_score - min_score);
        return norm_score;
    }
}
