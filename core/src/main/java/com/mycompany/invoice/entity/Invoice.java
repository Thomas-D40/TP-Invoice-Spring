package com.mycompany.invoice.entity;

import java.io.Serializable;

public class Invoice implements Serializable {
	private String number;
	private String customerInvoice;
	
	public Invoice() {
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getCustomerInvoice() {
		return customerInvoice;
	}
	
	public void setCustomerInvoice(String customerInvoice) {
		this.customerInvoice = customerInvoice;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Invoice{");
		sb.append("number='").append(number).append('\'');
		sb.append(", customerInvoice='").append(customerInvoice).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
