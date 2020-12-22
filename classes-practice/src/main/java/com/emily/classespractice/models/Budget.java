package com.emily.classespractice.models;
import java.util.ArrayList;

public class Budget {
    private double totalAmount;
    private ArrayList<Expense> expenses;

    public Budget(){}
    public Budget(double totalAmount){
        this.totalAmount = totalAmount;
        this.expenses = new ArrayList<Expense>();
    }
    public double getTotalMoney(){
        return totalAmount;
    }
    public void setTotalMoney(double totalAmount){
        this.totalAmount = totalAmount;
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
        return moneySpent;
    }
    public double getAvailableMoney(){
        double moneySpent = getMoneySpent();
        return totalAmount - moneySpent;
    } 
}
