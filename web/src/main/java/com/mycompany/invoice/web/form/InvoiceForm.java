package com.mycompany.invoice.web.form;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class InvoiceForm {
	private String number;
	@NotBlank(message = "Attention, customerInvoice ne doit pas être vide")
	private String customerInvoice;
	@Size(min = 10, max = 20, message = "OrderNumber doit faire entre 10 et 20 caractères")
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
