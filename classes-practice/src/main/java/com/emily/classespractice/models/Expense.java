package com.emily.classespractice.models;

public class Expense {
    private double amount;
    private String description;
    private String category;
    private int id;
    private static int id_tracker=0;

    public Expense(){
        this.id = id_tracker++;
    };
    public Expense(double amount, String description, String category){
        this.amount = amount;
        this.description = description;
        this.category = category;
        this.id = id_tracker++;
        //id_tracker += 1;
    }

    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        String two = String.format("%.2f", amount);
        this.amount = Double.parseDouble(two);
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
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

}
