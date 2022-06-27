package com.mycompany.invoice.service.digit;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;
import com.mycompany.invoice.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceWithOnlyDigit implements InvoiceServiceInterface {
	
	@Autowired
	private InvoiceRepositoryInterface repository;
	private static long lastId = 0;
	
	
	public Invoice createInvoice(Invoice invoice) {
		// donner une numéro à ma facture (le ++ altère effectivement lastId)
		invoice.setNumber(String.valueOf(++lastId));
		
		// appelle le repository pour l'enregistrer
		repository.createInvoice(invoice);
		return invoice;
	}
	
	@Override
	public List<Invoice> getInvoiceList() {
		return repository.getInvoices();
	}
	
	@Override
	public Invoice getInvoiceById(String id) {
		return null;
	}
	
	
	;
	
	public InvoiceRepositoryInterface getRepository() {
		return repository;
	}
	
	public void setRepository(InvoiceRepositoryInterface repository) {
		this.repository = repository;
	}
}
