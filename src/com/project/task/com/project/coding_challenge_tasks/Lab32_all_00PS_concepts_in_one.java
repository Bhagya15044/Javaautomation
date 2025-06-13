package com.project.coding_challenge_tasks;

public class Lab32_all_00PS_concepts_in_one
{
    public static void main(String[] args)
    {
        Bank b = new Cardholder("bhagya", 500, 1223);
        b.withdraw();
        b.setBalance(100, 1223);
        System.out.println(b.getBalance());

       Cardholder c = new Cardholder("bhagya", 100, 1223);
        c.message("bhagya");
        c.withdraw();
        c.getBalance();
        c.setBalance(2000 , 1223);
        c.getName();
        c.dispaly_balance(1223);
        c.check("bhagya",2000);
    }
}

// Base class demonstrating encapsulation
class Bank
{
    private String name;
    private int balance;
    private int pin;

    public boolean validatePin(int enteredPin)
    {
        return this.pin == enteredPin;
    }
    //parameterized constructor
    public Bank(String name, int balance , int pin)
    {
        this.name = name;
        this.balance = balance;
        this.pin = pin;
    }


    //Getter and setter methods( it shows encapsulation concept)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance , int enteredPin)
    {
        if(validatePin(enteredPin))
        this.balance = balance;
        else
        {
            System.out.println("Not allowed to set the balance, entered incorrect pin");
        }
    }

    //writing some methods

    void dispaly_balance(int enteredPin)
    {
        if(validatePin(enteredPin))
        System.out.println("balance"+getBalance());
        else
        {
            System.out.println("entered incorrect pin");
        }
    }

    void withdraw()
    {
        System.out.println("amount is "+getBalance());
    }
}

// Derived class demonstrating inheritance, method overriding, and overloading
 class Cardholder extends Bank // this shows inheritance
{
    public Cardholder(String name, int balance , int pin)
    {
        super(name, balance, pin);
    }

    @Override
    void withdraw()
    {
        super.withdraw();
    }

    // Method overloading
    void message(String name)
    {
        System.out.println("Hi" +name +" welcome");
    }
    void check(String name , int balance)
    {
        System.out.println("Hi" +name +" welcome"+ "your balance is: " + balance);
    }
    // Overloaded version of message()
    void message(String name, int customerId)
    {
        System.out.println("Hi " + name + ", your customer ID is " + customerId);
    }
}

/*
     /*
============================================================
💡 PROGRAM SUMMARY – FLOW OF EXECUTION (BANK + OOPS CONCEPTS)
============================================================

This Java program simulates a **basic banking system** using OOPS concepts.

----------------------------
🔁 FLOW OF PROGRAM EXECUTION:
----------------------------

1️⃣ The program starts with the `main()` method in the `Lab32_all_00PS_concepts_in_one` class.

2️⃣ It creates an object `b` of type `Bank`, but using the child class `Cardholder`:
      ➤ This uses inheritance (child object assigned to parent reference).
      ➤ A cardholder named "bhagya" is created with ₹500 and PIN 1223.

3️⃣ The method `withdraw()` is called on `b`.
      ➤ It prints the current balance of the cardholder (₹500).

4️⃣ The method `setBalance(100, 1223)` is called.
      ➤ It checks if the entered PIN is correct.
      ➤ Since the PIN matches, the balance is updated to ₹100.

5️⃣ `getBalance()` prints the updated balance: ₹100.

6️⃣ Now another object `c` is created directly as a `Cardholder` (not via `Bank`).
      ➤ A second cardholder named "bhagya" is created with ₹100 and PIN 1223.

7️⃣ The method `message("bhagya")` is called.
      ➤ It prints a welcome message for the user.

8️⃣ `withdraw()` prints the current balance for this second cardholder: ₹100.

9️⃣ `getBalance()` is called (no output in this case as it's not printed).

🔟 `setBalance(2000, 1223)` is called.
      ➤ Since the PIN is correct, the balance updates to ₹2000.

1️⃣1️⃣ `getName()` fetches the user name (not printed in the code but accessible).

1️⃣2️⃣ `dispaly_balance(1223)` is called.
      ➤ PIN is correct, so it prints the balance: ₹2000.

1️⃣3️⃣ `check("bhagya", 2000)` is called.
      ➤ It prints a combined message showing name and balance.

------------------------
🔚 FINAL OUTPUT IN CONSOLE:
------------------------

amount is 500
balance is updated (to 100)
100
Hi bhagya welcome
amount is 100
(balance updated to 2000)
balance2000
Hi bhagya welcome your balance is: 2000

-------------------------------------
🎯 WHAT YOU LEARN FROM THIS PROGRAM:
-------------------------------------

✔ Object creation using constructors
✔ PIN validation logic
✔ Inheritance between Bank and Cardholder
✔ Overriding and overloading of methods
✔ Encapsulation using private fields and public getters/setters
✔ Real-world simulation of a banking system

This flow helps you or anyone reviewing your code understand exactly how the program behaves from top to bottom.

*/

