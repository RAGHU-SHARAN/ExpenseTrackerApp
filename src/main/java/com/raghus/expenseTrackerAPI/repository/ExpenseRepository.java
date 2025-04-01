package com.raghus.expenseTrackerAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raghus.expenseTrackerAPI.entities.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
