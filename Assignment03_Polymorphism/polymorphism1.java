import java.util.Scanner;

class Publication {
    Scanner sc = new Scanner(System.in);
    private String title;
    private int price;
    private int copies = 0;

    public int getcopies() {
        return this.copies;
    }

    public String gettitle() {
        return this.title;
    }

    public double getprice() {
        return this.price;
    }

    public void setcopies(int copies) {
        this.copies = copies;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public void sellcopy(int num) {
        System.out.println("Total Publication sell : $" + (num * price));
    }
}

class Book extends Publication {
    String author;

    public void ordercopies(int copies1) {
        setcopies(getcopies() + copies1);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublication() {
        System.out.println("-------------------------------------------------------");
        String title;
        int price;
        System.out.println("Enter the Title of the Book : ");
        title = sc.nextLine();
        System.out.println("Enter the Author of the Book : ");
        author = sc.nextLine();
        System.out.println("Enter the Price of the Book : ");
        price = sc.nextInt();
        System.out.println("-------------------------------------------------------");
        setprice(price);
        settitle(title);
    }

    public void getBooksDetail() {
        System.out.println("-------------------------------------------------------");
        System.out.println("BOOK Name : " + gettitle());
        System.out.println("BOOK Author : " + author);
        System.out.println("Price per Book  : " + getprice());
        System.out.println("Total Books sell : " + getcopies());
        System.out.println("Total Books price : " + (getcopies() * getprice()));
        System.out.println("-------------------------------------------------------");
    }
}

class Magazine extends Publication {
    public void ordercopies(int copies1) {
        setcopies(getcopies() + copies1);
    }

    public void setPublication() {
        System.out.println("-------------------------------------------------------");
        String title;
        int price;
        System.out.println("Enter the Title of the Magazine : ");
        title = sc.nextLine();
        System.out.println("Enter the Price of the Magazine : ");
        price = sc.nextInt();
        setprice(price);
        settitle(title);
        System.out.println("-------------------------------------------------------");
    }

    public void getMagDetail() {
        System.out.println("-------------------------------------------------------");
        System.out.println("Magazine Name : " + gettitle());
        System.out.println("Price per Magazine  : " + getprice());
        System.out.println("Total Magazine sell : " + getcopies());
        System.out.println("Total Magazine price : " + (getcopies() * getprice()));
        System.out.println("-------------------------------------------------------");
    }
}

public class polymorphism1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1;
        Book obj1 = new Book();
        obj1.setPublication();
        Magazine obj2 = new Magazine();
        obj2.setPublication();
        while (true) {
            System.out.println("-------------------------------------------------------");
            System.out
                    .println("To Add the Book : PRESS 1\nTo display the Summary : PRESS 2\nTo EXIT the Shop : PRESS 0");
            num1 = sc.nextInt();
            System.out.println("-------------------------------------------------------");
            if (num1 == 1) {
                int copies, copies1;
                System.out.println("How many Book do you want to order ? : ");
                copies = sc.nextInt();
                System.out.println("How many Magazines do you want to order ? : ");
                copies1 = sc.nextInt();
                obj1.ordercopies(copies);
                obj2.ordercopies(copies1);
                System.out.println("\n");
            } else if (num1 == 2) {
                obj1.getBooksDetail();
                obj2.getMagDetail();
                System.out.println("-------------------------------------------------------");
                System.out.println("TOTAL ORDER PRICE : "
                        + ((obj1.getcopies() * obj1.getprice()) + (obj2.getcopies() * obj2.getprice())));
                System.out.println("-------------------------------------------------------");
                System.out.println("\n");
            } else {
                System.out.println("Shop Closed");
                System.out.println("\n");
                sc.close();
                break;
            }
        }

    }
}