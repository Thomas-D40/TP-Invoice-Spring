package com.mycompany.invoice.repository.memory;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiceRepositoryMemory implements InvoiceRepositoryInterface {
	
	public static List<Invoice> invoices = new ArrayList<>();
	
	public Invoice createInvoice(Invoice invoice) {
		invoices.add(invoice);
		System.out.println("Invoice added with number " + invoice.getNumber() + " for customer : " + invoice.getCustomerInvoice());
		return invoice;
	}
	
	@Override
	public List<Invoice> getInvoices() {
		return invoices;
	}
	
	@Override
	public Invoice getInvoiceById(String id) {
		return null;
	}
	
	
	public static void setInvoices(List<Invoice> invoices) {
		InvoiceRepositoryMemory.invoices = invoices;
	}
}
