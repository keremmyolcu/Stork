package com.example.stork.API.RequestWireToIban.Response;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Data  {
    @SerializedName("TransactionCode")
    public String transactionCode;

    @SerializedName("TransactionSavingToken")
    public Object transactionSavingToken;

    @SerializedName("ForceDuplicate")
    public Boolean forceDuplicate;

    @SerializedName("ExpenseAmount")
    public Double expenseAmount;

    @SerializedName("SourceAccount")
    public SourceAccount sourceAccount;

    @SerializedName("TransactionDate")
    public String transactionDate;

    @SerializedName("AccountingReference")
    public String accountingReference;

    @SerializedName("TransactionID")
    public Integer transactionID;

    @SerializedName("State")
    public Integer state;

    @SerializedName("CreditInfoForConfirmations")
    public Object creditInfoForConfirmations;

    @SerializedName("ConfirmationToken")
    public Object confirmationToken;

    @SerializedName("RequiredConfirmationType")
    public Integer requiredConfirmationType;

    @SerializedName("Otp")
    public Object otp;

    @SerializedName("MobilePhoneNumber")
    public Object mobilePhoneNumber;

    @SerializedName("CanUserCommitTransaction")
    public Boolean canUserCommitTransaction;

    @SerializedName("NpsSurveyGuid")
    public Object npsSurveyGuid;

    public String getTransactionCode() {
        return transactionCode;
    }

    public Object getTransactionSavingToken() {
        return transactionSavingToken;
    }

    public Boolean getForceDuplicate() {
        return forceDuplicate;
    }

    public Double getExpenseAmount() {
        return expenseAmount;
    }

    public SourceAccount getSourceAccount() {
        return sourceAccount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getAccountingReference() {
        return accountingReference;
    }

    public Integer getTransactionID() {
        return transactionID;
    }

    public Integer getState() {
        return state;
    }

    public Object getCreditInfoForConfirmations() {
        return creditInfoForConfirmations;
    }

    public Object getConfirmationToken() {
        return confirmationToken;
    }

    public Integer getRequiredConfirmationType() {
        return requiredConfirmationType;
    }

    public Object getOtp() {
        return otp;
    }

    public Object getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public Boolean getCanUserCommitTransaction() {
        return canUserCommitTransaction;
    }

    public Object getNpsSurveyGuid() {
        return npsSurveyGuid;
    }
}
