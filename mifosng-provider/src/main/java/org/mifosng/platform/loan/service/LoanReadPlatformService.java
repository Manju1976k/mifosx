package org.mifosng.platform.loan.service;

import java.util.Collection;

import org.mifosng.platform.api.data.CurrencyData;
import org.mifosng.platform.api.data.LoanBasicDetailsData;
import org.mifosng.platform.api.data.LoanPermissionData;
import org.mifosng.platform.api.data.LoanRepaymentTransactionData;
import org.mifosng.platform.api.data.LoanScheduleData;
import org.mifosng.platform.api.data.LoanTransactionData;

public interface LoanReadPlatformService {

	LoanBasicDetailsData retrieveLoanAccountDetails(Long loanId);

	LoanScheduleData retrieveRepaymentSchedule(Long loanId, CurrencyData currencyData, Collection<LoanRepaymentTransactionData> loanRepayments);

	Collection<LoanRepaymentTransactionData> retrieveLoanPayments(Long loanId);

	LoanPermissionData retrieveLoanPermissions(
			LoanBasicDetailsData loanBasicDetails, boolean isWaiverAllowed,
			int repaymentAndWaiveCount);

	LoanBasicDetailsData retrieveClientAndProductDetails(Long clientId, Long productId);

	LoanTransactionData retrieveNewLoanRepaymentDetails(Long loanId);

	LoanTransactionData retrieveNewLoanWaiverDetails(Long loanId);

	LoanTransactionData retrieveLoanTransactionDetails(Long loanId, Long transactionId);
}