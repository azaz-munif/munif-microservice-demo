/**
 * 
 */
package com.munifec.munifmsaccount.repository;

import java.util.List;

import com.munifec.munifmsaccount.model.Account;


public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
