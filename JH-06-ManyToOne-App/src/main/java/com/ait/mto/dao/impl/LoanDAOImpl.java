package com.ait.mto.dao.impl;

import com.ait.mto.dao.LoanDAO;
import com.ait.mto.entities.Customer;
import com.ait.mto.entities.Loan;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class LoanDAOImpl implements LoanDAO {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

    @Override
    public void saveLoan(Loan loan) {
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        try {
            Customer customer = loan.getCustomer();

            // Check if the customer already exists in the database
            Customer existingCustomer = entityManager.find(Customer.class, customer.getCustomerId());
            
            if (existingCustomer == null) {
                // Customer does not exist, so persist it
                entityManager.persist(customer);
            } else {
                // Customer exists, so use the managed instance
                loan.setCustomer(existingCustomer);
            }

            // Now persist the loan
            entityManager.persist(loan);
            tx.commit();
            System.out.println("Customer and Loan added successfully.");
        } catch (Exception e) {
            tx.rollback();
            System.out.println("Cannot add the customer and loan.");
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }



	@Override
	public Loan fetchLoanById(Integer loanId) {
		EntityManager em = factory.createEntityManager();
		Loan loan = em.find(Loan.class,loanId);
		if(loan != null) {
			em.close();
			return loan; 
		}
		else {
			System.out.println("loan not found");
		}
		return loan;
	}

	@Override
	public void removeLoan(Integer loanId) {
		
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Loan loan = em.find(Loan.class,loanId);
		try {
			if(loan != null) {
				em.remove(loan);
				tx.commit();
				em.close();
				System.out.println(loan.getLoanType()+" "+" successfully removed from db");
			}
			else {
				System.out.println("Loan not found");
			}
			
		} catch (Exception e) {
			tx.rollback();
			System.out.println("some error occures can not remove loan");
		}
		
	}
	}

