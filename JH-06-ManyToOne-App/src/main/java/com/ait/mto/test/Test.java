package com.ait.mto.test;

import com.ait.mto.dao.LoanDAO;
import com.ait.mto.dao.impl.LoanDAOImpl;
import com.ait.mto.entities.Customer;
import com.ait.mto.entities.Loan;

public class Test {

	public static void main(String[] args) {
		
		LoanDAO dao = new LoanDAOImpl(); 
//		Customer customer = new Customer(); 
//		Customer customer2 = new Customer();
//		
		
//		//======  Customer Details =========
//		customer.setCustomerId(1);
//		customer.setCustomerName("Shubham");
		
//		customer2.setCustomerId(2);
//		customer2.setCustomerName("Raj");
		
//		// ======= Set Home Loan Details ===== 
//		Loan hl = new Loan(); 
//		hl.setLoanId(101);
//		hl.setLoanType("Home Loan");
//		hl.setLoanAmount(500000.00);
//		hl.setCustomer(customer);
//		
//		//========== Set Vehicle Loan Details=======
//		
//		Loan vl = new Loan(); 
//		vl.setLoanId(102);
//		vl.setLoanType("Vehicle Loan");
//		vl.setLoanAmount(600000.00);
//		vl.setCustomer(customer);
//		
		//========== Set Vehicle Loan Details=======
		
//				Loan ml = new Loan(); 
//				ml.setLoanId(104);
//				ml.setLoanType("Medical Loan");
//				ml.setLoanAmount(800000.00);
//				
//				ml.setCustomer(customer2);
				
		// =========== Saving the Loan Objects into Db =========
//				dao.saveLoan(ml);
//				dao.saveLoan(vl);
//				dao.saveLoan(hl);
		// ========= FetchingLoan By Id ================
//		Loan l1 = dao.fetchLoanById(101); 
//	    System.out.println(l1);
//	    Customer c1 = l1.getCustomer();
//	    System.out.println(c1);
		
		// ===== Removing Loan by id =============
//		dao.removeLoan(104);
	}

}
