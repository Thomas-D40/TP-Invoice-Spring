package com.mycompany.invoice.web.controller.web;


import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import com.mycompany.invoice.web.controller.InvoiceControllerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/invoice")
public class InvoiceControllerWeb implements InvoiceControllerInterface {
	
	@Autowired
	InvoiceServiceInterface service;
	
	public void createInvoice() {
		String customerName = "Mike";
		
		Invoice newInvoice = new Invoice();
		newInvoice.setCustomerInvoice(customerName);
		
		service.createInvoice(newInvoice);
		
	}
	

	@RequestMapping("/home")
	public String displayInvoiceHome(Model model) {
		model.addAttribute("invoices", service.getInvoiceList());
		return "invoice-home";
	}
	
	
	
	
	
	@RequestMapping("/{id}")
	public String displayInvoice(@PathVariable("id") String id, Model model) {
		model.addAttribute("invoice", service.getInvoiceById(id));
		return "invoice-details";
	}
	
	
	
	public InvoiceServiceInterface getService() {
		return service;
	}
	
	public void setService(InvoiceServiceInterface service) {
		this.service = service;
	}
}
