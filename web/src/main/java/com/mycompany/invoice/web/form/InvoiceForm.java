package com.mycompany.invoice.web.form;



public class InvoiceForm {
	private String number;
	private String customerInvoice;
	private String orderNumber;
	
	public InvoiceForm() {
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
	
	public String getOrderNumber() {
		return orderNumber;
	}
	
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Invoice{");
		sb.append("number='").append(number).append('\'');
		sb.append(", customerInvoice='").append(customerInvoice).append('\'');
		sb.append(", orderNumber='").append(orderNumber).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
