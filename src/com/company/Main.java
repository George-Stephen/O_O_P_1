package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Starts with introduction
        System.out.println("Welcome to your entrance test\n" +
                "Please begin by entering your KCSE grades ");
        Scanner scanner = new Scanner(System.in);
        // enters KCSE grades
        int kcse_grades = scanner.nextInt();
        if(kcse_grades >= 65){
            System.out.println("Congratulations \n" +
                    "Please enter your scores from the Interview(1-10)");
            // Input interview scores if kcse grades are above 65
            int inter_scores = scanner.nextInt();
            if (inter_scores >= 6){
                System.out.println("You are doing great so one more thing\n" +
                        "Please enter your confidence level scores(1-10)");
                // Input confidence scores if interview scores are above 6
                int conf_scores = scanner.nextInt();
                if (conf_scores >= 6){
                    // all three conditions are true
                    System.out.println("You have been admitted \n" +
                            "You have met the school KCSE requirement,interview scores and confidence scores");
                }
                else{
                    // two conditions : KCSE and interview scores are true
                    System.out.println("You have been admitted \n" +
                            "You have met the school KCSE requirement and interview scores");
                }
            }else{
                System.out.println("Sorry you did not meet the minimum interview score,\n" +
                        "Please enter your confidence level scores(1-10)");
                // Input confidence scores if  interview scores are false
                int conf_scores = scanner.nextInt();
                if (conf_scores >= 5){
                    //KCSE and confidence scores are true
                    System.out.println("You have been admitted \n" +
                            "You have met the school KCSE requirement,and confidence scores");
                }
                else{
                    // Both conditions : confidence and interview scores are false
                    System.out.println("You have been rejected \n" +
                            "You have not met the school interview and confidence scores requirement");
                }
            }
        }else {
            // KCSE condition is false <65
            System.out.println("You have been rejected \n" +
                    "You have not met the school KCSE requirement");
        }
    }
}
