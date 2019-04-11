package com.munifec.munifmsaccount.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Repository;

import com.munifec.munifmsaccount.model.Account;


@Repository
public class StubAccountRepository implements AccountRepository {
	
	private Map<String, Account> accountsByNumber = new HashMap<String, Account>();
	
	public StubAccountRepository() {
		Account account = new Account(1000l, "Azaz Patel" , "1111");
		accountsByNumber.put("1111", account);
		account = new Account(2000l, "Hasnen Qureshi" , "4444");
		accountsByNumber.put("4444", account);
		account = new Account(3000l, "Atif Aslam" , "6666");
		accountsByNumber.put("6666", account);
		Logger.getLogger(StubAccountRepository.class).info("Created StubAccountRepository");
	}
	
	@Override
	public List<Account> getAllAccounts() {
		return new ArrayList<Account>(accountsByNumber.values());
	}

	@Override
	public Account getAccount(String number) {
		return accountsByNumber.get(number);
	}

}
