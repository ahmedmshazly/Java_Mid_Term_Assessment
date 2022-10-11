# Java_Mid_Term_Assessment
This repository contains the codes of the Mid Term Assessment project for the course "Database Systems" in my year two at The African Leadership University in Rwanda.


### The promot is as the following:

**Instructions**

    The assessment will be done individually.
    The assessment will be graded out of 15.
    The assessment will be submitted via canvas only.
    The codes will be expected to be commented sufficiently.
    The assessment will be expecting the proper use of collections, methods, control flow and repetitive structures.

**Assessed Learning Outcomes**

    Mastering the structure of a program in Java
    Mastering data types and variables.
    Proper use of flow controls and repetitive structures.
    Combining built-in functions and customized functions (methods).
    Creating and using classes and objects.
    Running and testing a java program.
    
    

**Qn1. Multiple Question Trivia**


Create a program in java that simulates a multiple question trivia game. In this game the computer asks a question and presents the user 5 answers among which the user will choose one answer. Among the 5 answers one answer is expected to be true while others will be false answers.

Upon selecting the answer, the computer will grade the user and display to the console whether or not the user got the correct answer. The computer will as well ask the user whether s/he wants to play again. If the user types a yes, the computer will display another question and present five multiple answers where the user can choose the correct one and see if s/he got it right or wrong. The game will continue until the user is no longer interested in playing the game. As the computer communicates to the user whether s/he got it right or not, it will equally print the time (in second) it took the user to answer.

  **Expected Answer:**

  As you run the code, you see a welcome message and give you instructions of the game.
  A question will be presented and asks the user to type a correct answer from 5 answers provided.
  The user will choose the answer and submit it (hit enter)
  The system will notify the user whether s/he got it right or wrong and the number of seconds taken to answer the question.
  The system will ask the user to type yes in case s/he wants to keep playing or no if no longer interested. When the user types a yes, another question will be displayed and a set of answers will be provided like earlier. But if a no was typed, the game will end (Thank you for playing, see you!).


**Qn2. Traffic Lights**

Write a java program to simulate traffic and traffic lights. Here is what you need to do , the cars come randomly and they are being added to your collection of cars and they can only go when the light is green, or yellow but when the light is red cars will stay in the queue.

What this means is that throughout the time that the program is running, you will be generating cars randomly and adding them to your queue , regardless of the light of the traffic lights. You only stop adding the cars when your collection has 100 cars in the queue

The yellow light lasts for 10 seconds , the green one 30 seconds and the red one 20 seconds.

When when the light is green the cars go , one by one (every second a car gets out )

When the light is yellow , the cars go , one by one (every two seconds one  car gets out , because yellow is for caution so the cars are going a little slower )

When the light is red, no car gets to go . They all stay where they are.

your program only ends when all the cars in your collection are gone.

 

  **Expected Results**

  The program will keep adding cars to the collection and will be stopped when the cars queueing up reach 100 cars. Cars can come whether the traffic lights are permitting them to go or not.
  The program will allow cars to be taken off the queue as the traffic lights are green or yellow.
  The program will stop running when all cars are off the collection.
