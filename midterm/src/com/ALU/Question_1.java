package com.ALU;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;
import java.util.Random;

public class Question_1 {
    // Main Function with all question

    // Questions
    public static String[] questions = {"Who is the Founder of African Leadership University?", "Who is the Founder of African Leadership University?", "How many campuses does African leadership have?", "Who is the Head of college for the Rwandan Campus?", "How many degree programs does African Leadership University have?", "Where do we have our programming two class?", "When was ALU’s Rwandan campus opened?", "What time Computer Science students begin classes", "Who is the facilitator for programming two?", "Who is the Data Structure and algorithm facilitator?"};
    //Correct answers
    public static String[] answers = {"Fred Swaniker", "2015", "2", "Silla Ogidi", "6", "Zoom", "2017", "8.am", "Thadee Gatera", "Simeon Nsabiyumva"};
    // choices
    public static String[] Ans1 = {"Swaniker Fred", "Fred Swaniker", "Farida", "Ahmed", "Mimi"};
    public static String[] Ans2 = {"2015", "2011", "2013", "2014", "2016", "2017"};
    public static String[] Ans3 = {"2", "3", "4", "5", "6"};
    public static String[] Ans4 = {"Silla Ogidi", "Fred Swaniker", "Farida", "Ahmed", "Mimi"};
    public static String[] Ans5 = {"6","2", "3", "4", "5"};
    public static String[] Ans6 = {"Zoom", "Kenya", "Egypt", "Morroco", "Sudan"};
    public static String[] Ans7 = {"2017", "2011", "2013", "2014", "2016", "2015"};
    public static String[] Ans8 = {"8.am", "9.am", "10.am", "11.am", "12.am"};
    public static String[] Ans9 = {"Thadee Gatera", "Fred Swaniker", "Farida", "Ahmed", "Mimi"};
    public static String[] Ans10 = {"Simeon Nsabiyumva", "Thadee Gatera", "Fred Swaniker", "Farida", "Ahmed"};
    //to store the points
    public static int points;
    //to get the answer number from the user
    public static int user_ans;
    // to get if the user want to play again
    public static int again = 2;

    public static int counter = 0;
    public static int counter2 = 1;
    public static String _answers = " ";
    public static Random rand = new Random();
    public static int x;
    public static Scanner input = new Scanner(System.in);


    static void Trivia() {

        //to print the first question then see if he wants to play again
        do {
            counter++;
            System.out.println("Question " + counter + " :-");
            System.out.println(questions[counter - 1]);
            for (int i = 0; i < 5; i++) {
//                x = rand.nextInt(10);
                _answers += counter2;
                _answers += "- ";
                _answers += answers[i];
                _answers += "\n";
                counter2 ++;
            }
//            _answers += counter2;
//            _answers += "- ";
//            _answers += answers[counter-1];
//            _answers += "\n";

            System.out.println(_answers);
            System.out.println("Please type the answer number");
            user_ans = input.nextInt();
            //the cases are for checking the answeres of each question to get weather the answer is right or not, please go to the variables to understand
            switch (counter){
                case 1:
                    if (Ans1[user_ans-1] == Ans1[0]) {
                        points++;
                        System.out.println("Correct answer");
                    } else {
                        System.out.println("Wrong answer");
                    }
                    break;

                case 2:
                    if (Ans2[user_ans-1] == Ans2[0]) {
                        points++;
                        System.out.println("Correct answer");
                    } else {
                        System.out.println("Wrong answer");
                    }
                    break;

                case 3:
                    if (Ans3[user_ans-1] == Ans3[0]) {
                        points++;
                        System.out.println("Correct answer");
                    } else {
                        System.out.println("Wrong answer");
                    }
                    break;

                case 4:
                    if (Ans4[user_ans-1] == Ans4[0]) {
                        points++;
                        System.out.println("Correct answer");
                    } else {
                        System.out.println("Wrong answer");
                    }
                    break;


                case 5:
                    if (Ans5[user_ans-1] == Ans5[0]) {
                        points++;
                        System.out.println("Correct answer");
                    } else {
                        System.out.println("Wrong answer");
                    }
                    break;

                case 6:
                    if (Ans6[user_ans-1] == Ans6[0]) {
                        points++;
                        System.out.println("Correct answer");
                    } else {
                        System.out.println("Wrong answer");
                    }
                    break;

                case 7:
                    if (Ans7[user_ans-1] == Ans7[0]) {
                        points++;
                        System.out.println("Correct answer");
                    } else {
                        System.out.println("Wrong answer");
                    }
                    break;

                case 8:
                    if (Ans8[user_ans-1] == Ans8[0]) {
                        points++;
                        System.out.println("Correct answer");
                    } else {
                        System.out.println("Wrong answer");
                    }
                    break;

                case 9:
                    if (Ans9[user_ans-1] == Ans9[0]) {
                        points++;
                        System.out.println("Correct answer");
                    } else {
                        System.out.println("Wrong answer");
                    }
                    break;

                case 10:
                    if (Ans10[user_ans-1] == Ans10[0]) {
                        points++;
                        System.out.println("Correct answer");
                    } else {
                        System.out.println("Wrong answer");
                    }
                    break;
            }



            //asking if he wants to play agin
            System.out.println("Do you want to play agian? \n 1- Yes \n 2- No \n [Please type 1 or 2]");
            again = input.nextInt();
            counter2 = 0;
            _answers = " ";
        }

            while (again == 1);
        // print the points
        System.out.printf("You have scored %d points", points);
        }

    public static void main(String[] args) throws InterruptedException
    {
        Trivia();
    }

    }

