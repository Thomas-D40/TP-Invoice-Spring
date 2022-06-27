package com.mycompany.invoice.web.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;

import java.util.List;

public interface InvoiceControllerInterface {
	public String createInvoice( Invoice invoice);

	
	public void setService(InvoiceServiceInterface service);
}
