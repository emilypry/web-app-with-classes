package com.emily.classespractice.controllers;

import com.emily.classespractice.models.Budget;
import com.emily.classespractice.models.Expense;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClassesController{
    private Budget myBudget;

    @GetMapping("")
    public String index(){
        return "index";
    }

    @PostMapping("")
    public String makeNewBudget(@ModelAttribute Budget budget){
        myBudget = budget;
        return "redirect:mybudget";
    }

    @GetMapping("mybudget")
    public String showBudget(Model model){
        model.addAttribute("amount", myBudget.getTotalAmount());
        return "viewbudget";
    }

    @PostMapping("mybudget")
    @ResponseBody
    public String makeNewExpense(@ModelAttribute Expense expense){
        myBudget.addExpense(expense);
        return "Added expense: "+expense.getAmount()+expense.getDescription()+expense.getCategory()+myBudget.getMoneySpent();
    }
}