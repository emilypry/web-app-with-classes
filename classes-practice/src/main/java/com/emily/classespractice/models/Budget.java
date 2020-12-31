package com.emily.classespractice.models;
import java.util.ArrayList;

public class Budget {
    private double totalAmount;
    private ArrayList<Expense> expenses = new ArrayList<Expense>();

    public Budget(){}
    public Budget(double totalAmount){
        this.totalAmount = totalAmount;
    }
    public double getTotalAmount(){
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount){
        String two = String.format("%.2f", totalAmount);
        this.totalAmount = Double.parseDouble(two);
    }
    public ArrayList<Expense> getExpenses(){
        return expenses;
    }
    public void setExpenses(ArrayList<Expense> expenses){
        this.expenses = expenses;
    }
    
    public void addExpense(Expense e){
        expenses.add(e);
    }
    public void deleteExpense(Expense e){
        expenses.remove(e);
    }
    public double getMoneySpent(){
        double moneySpent = 0;
        for(Expense e : expenses){
            moneySpent += e.getAmount();
        }
        String two = String.format("%.2f", moneySpent);
        return Double.parseDouble(two);
    }
    public double getAvailableMoney(){
        double moneySpent = getMoneySpent();
        double availableMoney = totalAmount - moneySpent;
        String two = String.format("%.2f", availableMoney);
        return Double.parseDouble(two);
    } 
}
