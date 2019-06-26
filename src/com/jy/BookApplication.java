package com.jy;

public class BookApplication {

    public static void main(String[] args) {

        Book b = new Book();
        b.setAuthor("Justin Yang");
        b.setTitle("INFOSYS Training");
        b.setDescription("A book about Java Training");
        b.setPrice(100.32);
        

        System.out.println(b.toString());
    }
}
