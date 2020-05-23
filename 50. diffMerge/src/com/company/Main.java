package com.company;

public class Main {

   public static void main(String[] args) {
      BankAccount bankAccount = new BankAccount("12345", 5000, "Evan BC", "bob@bob.com", "(206) 321-2313" );

      System.out.println("Account number= " + bankAccount.getAccountNumber());
      System.out.println("Balance= " + bankAccount.getBalance());
      System.out.println("Customer Name= " + bankAccount.getCustomerName());
      System.out.println("Email= " + bankAccount.getEmail());
      System.out.println("Phone Number= " + bankAccount.getPhoneNumber());

      bankAccount.depositFunds(500);
      bankAccount.withdrawFunds(3000);
      bankAccount.withdrawFunds(3000);
      System.out.println("Account number= " + bankAccount.getAccountNumber());

      BankAccount bankAccount1 = new BankAccount();

      System.out.println("Balance= " + bankAccount1.getBalance());
      System.out.println("Customer Name= " + bankAccount1.getCustomerName());
      System.out.println("Email= " + bankAccount1.getEmail());
      System.out.println("Phone Number= " + bankAccount1.getPhoneNumber());

      bankAccount1.depositFunds(500);
      bankAccount1.withdrawFunds(3000);
      bankAccount1.withdrawFunds(3000);
      System.out.println("Account number= " + bankAccount.getAccountNumber());

//      Person person = new Person();
//      person.setFirstName("");
//      person.setLastName("");
//      person.setAge(10);
//      System.out.println("fullName= " + person.getFullName());
//      System.out.println("teen= " + person.isTeen());
//      person.setFirstName("John");
//      person.setAge(18);
//      System.out.println("fullName " + person.getFullName());
//      System.out.println("teen= " + person.isTeen());
//      person.setLastName("Smith");
//      System.out.println("fullName " + person.getFullName());

   }

}