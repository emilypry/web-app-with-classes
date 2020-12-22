package com.emily.classespractice.models;

public class Budget {
    private double totalAmount;
    private ArrayList<Expense> expenses;

    public Budget()
    public Budget(double totalAmount, ArrayList<Expense> expenses){
        this.totalAmount = totalAmount;
        this.expenses = expenses;
    }
    public double getTotalMoney(){
        return totalMoney;
    }
    public void setTotalMoney(double totalMoney){
        this.totalMoney = totalMoney;
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
            moneySpent += e.price;
        }
        return moneySpent;
    }
    public double getAvailableMoney(){
        double moneySpent = getMoneySpent();
        return totalMoney - moneySpent;
    } 
}
