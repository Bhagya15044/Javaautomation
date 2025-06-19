package com.project.coding_challenge_tasks;

public class Lab36_book_class
{
    public static void main(String[] args)
    {
        Book b = new Book("The Harry Potter series","J.K. Rowling" , 450);
    }
}
class Book
{
    String title;
    String author;
    int price;

    Book(String title, String author,int price)
    {
        this.author = author;
        this.title = title;
        this.price = price;
        this.display();
    }
    void display()
    {
        System.out.println("Author: " + author + " Title " + title + " Price " + price);
    }
}