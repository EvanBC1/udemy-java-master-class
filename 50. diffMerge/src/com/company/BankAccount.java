package com.company;

public class BankAccount {
   private String accountNumber;
   private double balance;
   private String customerName;
   private String email;
   private String phoneNumber;

 public BankAccount () {
    this("4444", 7000, "bob johnso", "me@notyou.net", "8675309");
    System.out.println("Empty Constructor called");

 }

 public BankAccount (String accountNumber, double balance, String customerName, String email, String phoneNumber) {
    System.out.println("Account constructor with parameters called");
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
 }

   public void depositFunds(int deposit) {
      this.balance += deposit;
      System.out.println("You deposited $" + deposit + " your new balance is $" + this.balance);
   }
   public void withdrawFunds(int withdrawal) {
      if(this.balance - withdrawal >= 0) {
         this.balance -= withdrawal;
         System.out.println("You have withdrawn $" + withdrawal + " your new balance is $" + this.balance);
      } else {
         this.balance -= withdrawal + 30;
         System.out.println("You have overdrawn your account by $" + (Math.abs(this.balance) - 30) +  " and a $30 overdrawn fee has been added. Your new balance is $" +this.balance);
      }
   }

   public String getAccountNumber() {
      return accountNumber;
   }

   public double getBalance() {
      return balance;
   }

   public String getCustomerName() {
      return customerName;
   }

   public String getEmail() {
      return email;
   }

   public String getPhoneNumber() {
      return phoneNumber;
   }
}

