package com.mycompany.invoice.web.controller.web;


import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;

import com.mycompany.invoice.web.form.InvoiceForm;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/invoice")
public class InvoiceControllerWeb {
	
	@Autowired
	InvoiceServiceInterface service;
	
	@PostMapping
	public String createInvoice(@ModelAttribute @Valid InvoiceForm invoiceForm, BindingResult results, Model model) {
		if (results.hasErrors()) {
			return "invoice-create-form";
		}
		Invoice newInvoice = new Invoice();
		newInvoice.setCustomerInvoice(invoiceForm.getCustomerInvoice());
		newInvoice.setOrderNumber(invoiceForm.getOrderNumber());
		service.createInvoice(newInvoice);
		
		return "invoice-created";
		
	}
	

	@GetMapping("/home")
	public String displayInvoiceHome(Model model) {
		model.addAttribute("invoices", service.getInvoiceList());
		return "invoice-home";
	}
	
	@GetMapping("/create-form")
	public String displayCreateForm(@ModelAttribute InvoiceForm invoiceForm) {
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
