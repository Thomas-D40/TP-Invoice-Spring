package com.mycompany.invoice.web.api;


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

@RestController
@RequestMapping("/invoice")
public class InvoiceResource {
	
	@Autowired
	InvoiceServiceInterface service;
	
	@PostMapping
	public Invoice createInvoice(@RequestBody Invoice invoice) {
		return service.createInvoice(invoice);
	}
	

	@GetMapping()
	public List<Invoice> list() {
		return service.getInvoiceList();
	}
	
	
	@GetMapping("/{id}")
	public Invoice displayInvoice(@PathVariable("id") String id) {
		return service.getInvoiceById(id);
	}
	
	
	
	public InvoiceServiceInterface getService() {
		return service;
	}
	
	public void setService(InvoiceServiceInterface service) {
		this.service = service;
	}
}
