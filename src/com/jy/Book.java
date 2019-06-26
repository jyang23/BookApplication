package com.jy;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    public Book() {
        title = "";
        author = "";
        description = "";
        price = 0;
        isInStock = true;
    }

    @Override
    public String toString() {
        return  "Title:                " + title + "\n" +
                "Author:               " + author + "\n" +
                "Description:          " + description + "\n" +
                "Price:                " + this.getFormattedPrice(price) + "\n"+
                "In Stock:             " + isInStock + "\n";
    }

    private String getFormattedPrice(double price) {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat number = NumberFormat.getInstance();
        number.setMaximumFractionDigits(2);
        number.setMinimumFractionDigits(2);
        number.setRoundingMode(RoundingMode.HALF_UP);
        return number.format(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}