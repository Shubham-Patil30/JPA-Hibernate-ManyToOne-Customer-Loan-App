package com.ait.mto.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_loans")
public class Loan {
	@Id
	@Column(name="loan_id")
	private Integer loanId; 
	
	@Column(name="loan_type")
	private String loanType; 
	
	@Column(name="loan_amount")
	private Double loanAmount; 
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_id", referencedColumnName = "customer_id")
	private Customer customer ;

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanType=" + loanType + ", loanAmount=" + loanAmount + "]";
	} 
	
	
	
	
}
