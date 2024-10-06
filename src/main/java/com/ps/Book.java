package com.ps;

import com.sun.source.tree.WhileLoopTree;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOut;


    public Book(int id, String isbn, String title){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
                this.checkedOutTo = "";

                public void checkedOut(String Name)
        if(!isCheckOut){
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println("Book checked out to:" + name);
        }else{
            System.out.println("Sorry this book has been checked out already.");

            public void checkedIn() {

                if(!isCheckedOut) {
                    isCheckedOut = false;
                    checkedOutTo = Name;
                    System.out.println("Book is successfully checked in.");
                    System.out.println("This book has not been checked out.");

            }
            }
        }
        public int grtid() {
            return id;

        }

        public String getisbn() {
            return isdn;
        }

        public String gettitle() {
            return title;

        }

        public boolean isCheckedOut() {
            return isCheckedout;

        }

        public String getCheckedOutTO() {
            return checkedOutTo;

        }


        // Library class

        import java.util.Scanner;

        public class LibraryApp {
            public static void main(String [] args) {
                Scanner scanner = new scanner(System.in);

                //inventory
                Book[] book = new Book[20];
                for (int i = o; i <20; i++) {
                    Books[i] = new Book(i+1,"isbn");
                }

                While (true) {

                    System.out.println("Library");
                    System.out.println("1. Display Available Books");
                    System.out.println("2. Display Checked out Books");
                    System.out.println("3. Exit");
                    System.out.println("Select an option");
                    String choice = scanner.nextLine();

                    if (choice.equals("1")) {
                        System.out.println("Available Books");



                        }
                    }
                }