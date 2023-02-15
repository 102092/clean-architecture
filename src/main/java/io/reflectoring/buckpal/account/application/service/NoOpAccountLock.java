package io.reflectoring.buckpal.account.application.service;

import io.reflectoring.buckpal.account.application.port.out.AccountLock;
import io.reflectoring.buckpal.account.domain.Account.AccountId;
import org.springframework.stereotype.Component;

@Component
class NoOpAccountLock implements AccountLock {

	@Override
	public void lockAccount(AccountId accountId) {
		// redis
	}

	@Override
	public void releaseAccount(AccountId accountId) {
		// redis or something else..
	}

}
