//Bank system program to practice encapsulation

//Author: James Wambui Bajee
 //Reg no: CT101/G/19504/23
 //Date: 13/3/2025
 //version 1.0

import java.util.Scanner;


class BankAccount{
    //private variable called balance (data encapsulation)
    private double balance;

    //public constructor to initialize the object
    public BankAccount(double initialBalance){
        if(initialBalance >= 0){
            balance=initialBalance;
        }
        else{
            balance=0;
        }
        }

    //public method to get the balance(getter)
    public double getBalance(){
        return balance;
    }



    //method to deposit money
    public void deposit(double amount){        
        if(amount<=0){
            System.out.println("Invalid deposit amount" + amount); 
        }
        else{
            balance += amount;
          
        }
    
    }

    //method to withdraw money
    public void withdraw(double amount){
        if(amount<= 0){
            System.out.println("INVALID INPUT");
        }
        else if(amount>balance){
            System.out.println("Insufficient balance!");
        }
        else{
            balance -=amount;
    
        }
    }
}

public class main{
    public static void main(String[] args){
        //creating a new bank account object with an initial balance;
        BankAccount account=new BankAccount(1000);
        
        //accessing the bank account balance using the getter method
        System.out.println("initial Balance: " + account.getBalance());

        //Deposit money using setter method
        //using a scanner to collect the amount to be deposited
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the amount to deposit INITIAL BALANCE IS 1000:");
        double amount =input.nextDouble();

        account.deposit(amount);
        System.out.println("You deposited " + amount + " your new account balance is: " + account.getBalance());

        //withdraw money using setter method
        System.out.println("Enter the amount you want to withdraw: ");
        amount=input.nextDouble();
        
        account.withdraw(amount);
        System.out.println("You withdrew: " + amount + "Your new account balance is: " + account.getBalance());

        input.close();

    }
    

    
}