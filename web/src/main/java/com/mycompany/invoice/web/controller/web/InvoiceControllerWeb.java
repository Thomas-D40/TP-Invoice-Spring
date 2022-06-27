package com.mycompany.invoice.web.controller.web;


import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import com.mycompany.invoice.web.controller.InvoiceControllerInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/invoice")
public class InvoiceControllerWeb implements InvoiceControllerInterface {
	
	@Autowired
	InvoiceServiceInterface service;
	
	@PostMapping
	public String createInvoice(@ModelAttribute Invoice invoice) {
		
		Invoice newInvoice = new Invoice();
		newInvoice.setCustomerInvoice(invoice.getCustomerInvoice());
		newInvoice.setOrderNumber(invoice.getOrderNumber());
		service.createInvoice(newInvoice);
		
		return "invoice-created";
		
	}
	

	@GetMapping("/home")
	public String displayInvoiceHome(Model model) {
		model.addAttribute("invoices", service.getInvoiceList());
		return "invoice-home";
	}
	
	@GetMapping("/create-form")
	public String displayCreateForm(@ModelAttribute Invoice invoice) {
		return "invoice-create-form";
	}
	
	
	
	
	
	@GetMapping("/{id}")
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
