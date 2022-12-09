package org.acme;


public class Event {
    
    private String eventName;
	private String subEvent;
    private int responseCode;
	private int txnAmount;

	public String geteventName() {
		return eventName;
	}

    public void seteventName(String eventName) {
		this.eventName = eventName;
	}
	

    public String getsubEvent() {
		return subEvent;
	}

	public void setsubEvent(String subEvent) {
		this.subEvent = subEvent;
	}


	public int getresponseCode() {
		return responseCode;
	}

	public void setresponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public int gettxnAmount() {
		return txnAmount;
	}

	public void settxnAmount(int txnAmount) {
		this.txnAmount = txnAmount;
	}



	@Override
	public String toString() {
		return "Event [eventName=" + eventName + ", subEvent=" + subEvent + ", responseCode=" + responseCode + "]";
	}

}
