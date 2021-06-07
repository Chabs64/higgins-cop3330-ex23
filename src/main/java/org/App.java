package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

/*
An expert system is a type of artificial intelligence program that uses a knowledge base
and a set of rules to perform a task that a human expert might do.
Many websites are available that will help you self-diagnose a medical issue by answering a series of questions.
And many hardware and software companies offer online troubleshooting tools to help people solve simple technical issues
before calling a human.

Create a program that walks the user through troubleshooting issues with a car.
Use the following decision tree to build the system:

Example Output
Is the car silent when you turn the key? y
Are the battery terminals corroded? n
The battery cables may be damaged.
Replace cables and try again.

Constraint
Ask only questions that are relevant to the situation and to the previous answers. Don’t ask for all inputs at once.
 */

import java.util.Locale;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key?");
        String answer = in.nextLine().toLowerCase(Locale.ROOT);

        if(answer.equals("y"))
        {
            System.out.println("Are the battery terminal corroded?");
            answer = in.nextLine().toLowerCase(Locale.ROOT);
            if(answer.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cable and try again.");
            }
        }
        else
        {
            System.out.println("Does the car make a slicking noise?");
            answer = in.nextLine().toLowerCase(Locale.ROOT);
            if(answer.equals("y"))
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                System.out.println("Does the car crank up but fail to start");
                answer = in.nextLine().toLowerCase(Locale.ROOT);
                if(answer.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else
                {
                    System.out.println("Does the engine start and then die?");
                    answer = in.nextLine().toLowerCase(Locale.ROOT);
                    if(answer.equals("y"))
                    {
                        System.out.println("Does your car have fuel injection?");
                        answer = in.nextLine().toLowerCase(Locale.ROOT);
                        if(answer.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }

    }
}
