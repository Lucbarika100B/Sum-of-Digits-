//importing the Java Scanner Package;


import java.util.Scanner;

//creating a class that has same name of out file;

public class SumOfDigits{

  public static void main(String[] args){

    //printing an output to our user to enter the digits;
    System.out.println("Please enter a number to add digits : ");


    //Creating a new instance of scanner;
    Scanner inputOfUser = new Scanner(System.in);


    //initializing a new variable to computes the digits entered by the user;
    int number = inputOfUser.nextInt();
    int total = 0;


    //Using a while loop to compute the digits with modulo & division;
    while(number > 0) {

      int mod = number % 10;
      number = number / 10;
      total = total + mod;
    }
    System.out.println("Total is : " + total);
  }
}

