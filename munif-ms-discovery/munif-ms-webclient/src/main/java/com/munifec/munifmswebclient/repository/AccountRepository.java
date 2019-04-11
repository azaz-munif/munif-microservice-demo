/**
 * 
 */
package com.munifec.munifmswebclient.repository;

import java.util.List;

import com.munifec.munifmswebclient.model.Account;

public interface AccountRepository {
	
	
	  List<Account> getAllAccounts();
	  
	  Account getAccount(String number);
	 
}
