package org.acme;

import java.util.List;

public class Event {
    
    private int mti;
	private String networkType;;
	private String messageId;
	private String messageType;
	private String accountId;
	private String cardId;
	private List <String> balanceTypelist;
    private String responseCode;
	private long transactionBillamount;
	private String debit;
	private List<String> limitList;
    private String billingCurrencycode;
    private String merchantName;
    private Long availableLimit;
    private Integer org;
    private Integer product;
    private String primaryCin;
    private String secondaryCin;
    private String maskedInstrument;
    private String merchantCity;
    private String merchantCountry;
    private String merchantPostalCode;
    private Long txnAmount;
    private String txnCurrencycode;


	public int getmti() {
		return mti;
	}

	public void setmti(int mti) {
		this.mti = mti;
	}


	public String getnetworkTypeString() {
		return networkType;
	}

    public void setnetworkType(String networkType) {
		this.networkType = networkType;
	}
	

    public String getmessageId() {
		return messageId;
	}

	public void setmessageId(String messageId) {
		this.messageId = messageId;
	}

    public String getmessageType() {
		return messageType;
	}

	public void setmessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getaccountId() {
		return accountId;
	}

	public void setaccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getcardId() {
		return cardId;
	}

	public void setcardId(String cardId) {
		this.cardId = cardId;
	}
	public String getresponseCode() {
		return responseCode;
	}

	public List<String> getbalanceTypelist() {       
        return balanceTypelist;  
    }   

    public void setbalanceTypelist(List<String> BalanceTypelist) {
        balanceTypelist = BalanceTypelist;
    }

	public List<String> getlimitList() {       
        return limitList;  
    }   

    public void setlimitList(List<String> LimitList) {
        limitList = LimitList;
    }


	public void setresponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public long gettransactionBillamount() {
		return transactionBillamount;
	}

	public void settransactionBillamount(int transactionBillamount) {
		this.transactionBillamount = transactionBillamount;
	}

	public String getdebit() {
		return debit;
	}

	public void setdebit(String debit) {
		this.debit = debit;
	}

	public String getbillingCurrencyCode() {
		return billingCurrencycode;
	}

	public void setbillingCurrencycode(String billingCurrencycode) {
		this.billingCurrencycode = billingCurrencycode;
	}

	public String getmerchantName () {
		return merchantName;
	}

	public void setmerchantName (String merchantName) {
		this.merchantName = merchantName;
	}

	public Long getavailableLimit() {
		return availableLimit;
	}

	public void setavailableLimit(Long availableLimit) {
		this.availableLimit = availableLimit; 
	}

	public int getorg() {
		return org;
	}

	public void setorg(int org) {
		this.org = org; 
	}


	public int getproduct() {
		return product;
	}

	public void setproduct(int product) {
		this.product = product; 
	}

	public String getprimaryCin () {
		return primaryCin;
	}

	public void setprimaryCin (String primaryCin) {
		this.primaryCin = primaryCin;
	}

	public String getsecondaryCin () {
		return secondaryCin;
	}

	public void setsecondaryCin (String secondaryCin ) {
		this.secondaryCin = secondaryCin;
	}

	public String getmaskedInstrument () {
		return maskedInstrument;
	}

	public void setmaskedInstrument (String maskedInstrument ) {
		this.maskedInstrument = maskedInstrument;
	}

	public String getmerchantCity () {
		return merchantCity;
	}

	public void setmerchantcity (String merchantCity ) {
		this.merchantCity = merchantCity;
	}

	public String getmerchantCountry () {
		return merchantCountry;
	}

	public void setmerchantCountry (String merchantCountry ) {
		this.merchantCountry = merchantCountry;
	}

	public String getmerchantPostalcode () {
		return merchantPostalCode;
	}

	public void setmerchantPostalcode (String merchantPostalcode ) {
		this.merchantPostalCode = merchantPostalcode;
	}

	public Long gettxnAmount() {
		return txnAmount;
	}

	public void settxnAmount (Long txnAmount) {
		this.txnAmount = txnAmount; 
	}

	public String gettxnCurrencycode () {
		return txnCurrencycode;
	}

	public void settxnCurrencycode (String txnCurrencycode ) {
		this.txnCurrencycode = txnCurrencycode;
	}


	@Override
	public String toString() {
		return "Event [eventName=" + messageId + ", subEvent=" + mti + ", responseCode=" + responseCode + "]";
	}

}
