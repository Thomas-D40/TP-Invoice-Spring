package com.mycompany.invoice.web.controller.keyboard;


import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;
@Controller
public class InvoiceControllerWithKeyboard {
	@Autowired
	InvoiceServiceInterface service;
	
	public String createInvoice( Invoice invoice) {
		Scanner input = new Scanner(System.in);
		System.out.println("Customer name:");
		String customerName = input.nextLine();
		
		// Générer la facture
		Invoice newInvoice = new Invoice();
		newInvoice.setCustomerInvoice(customerName);
		
		
		service.createInvoice(newInvoice);
		return "";
	}
	

	
	public InvoiceServiceInterface getService() {
		return service;
	}
	
	public void setService(InvoiceServiceInterface service) {
		this.service = service;
	}
}
