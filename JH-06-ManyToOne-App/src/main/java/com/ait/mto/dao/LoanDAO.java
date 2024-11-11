package com.ait.mto.dao;

import com.ait.mto.entities.Loan;

public interface LoanDAO {
    
	public void saveLoan(Loan loan); 
	
	public Loan fetchLoanById(Integer loanId); 
	
	public void removeLoan(Integer loanId);
	
}
