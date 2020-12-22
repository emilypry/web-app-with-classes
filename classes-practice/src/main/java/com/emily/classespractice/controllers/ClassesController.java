package com.emily.classespractice.controllers;

import com.emily.classespractice.models.Budget;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClassesController{
    @GetMapping("")
    public String index(){
        return "index";
    }

    @PostMapping("")
    @ResponseBody
    public String makeNewBudget(@RequestParam double totalAmount){
        Budget budget = new Budget(totalAmount);
        return "Added budget with "+budget.getTotalMoney();
    }
}