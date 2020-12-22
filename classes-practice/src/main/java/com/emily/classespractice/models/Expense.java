package com.emily.classespractice.models;

public class Expense {
    private double amount;
    private String description;
    private String category;
    private int ident=0;

    public Expense();
    public Expense(double amount, String description, String category){
        this.amount = amount;
        this.description = description;
        this.category = category;
        this.ident = ident;

    }

}
