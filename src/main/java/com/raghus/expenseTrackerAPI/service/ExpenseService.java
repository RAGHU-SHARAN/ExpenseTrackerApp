package com.raghus.expenseTrackerAPI.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.raghus.expenseTrackerAPI.entities.Expense;

public interface ExpenseService {
//	List<Expense> getAllExpenses();
	Page<Expense> getAllExpenses(Pageable page);

	Expense getExpenseById(Long id); // return expense object

	void deleteExpenseById(Long id);

	Expense saveExpenseDetails(Expense expense);

	Expense updateExpenseDetails(Long id,Expense expense);

}
