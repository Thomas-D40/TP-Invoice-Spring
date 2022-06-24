package com.mycompany.invoice.repository.database;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class InvoiceRepositoryDatabase implements InvoiceRepositoryInterface {
	@Override
	public void createInvoice(Invoice invoice) {
	
	}
	
	@Override
	public List<Invoice> getInvoices() {
		Invoice invoice1 = new Invoice();
		invoice1.setNumber("1");
		invoice1.setCustomerInvoice("Apple");
		
		Invoice invoice2 = new Invoice();
		invoice2.setNumber("2");
		invoice2.setCustomerInvoice("Epson");
		
		return List.of(invoice1, invoice2);
		
	}
	
	@Override
	public Invoice getInvoiceById(String id) {
		Invoice invoice1 = new Invoice();
		invoice1.setNumber("1");
		invoice1.setCustomerInvoice("Apple");
		
		return invoice1;
	}
}
