package com.mycompany.invoice.repository;

import com.mycompany.invoice.entity.Invoice;

import java.util.List;

public interface InvoiceRepositoryInterface {
	public void createInvoice(Invoice invoice);
	
	public List<Invoice> getInvoices();
	
	public Invoice getInvoiceById(String id);
}
