package com.emily.classespractice.models;

public class Expense {
    private double amount;
    private String description;
    private String category;
    private int ID;
    private static int id_tracker=0;

    public Expense(){};
    public Expense(double amount, String description, String category){
        this.amount = amount;
        this.description = description;
        this.category = category;
        this.ID = id_tracker;
        id_tracker += 1;
    }

    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }

}
