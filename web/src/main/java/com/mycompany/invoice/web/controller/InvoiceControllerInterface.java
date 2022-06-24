package com.mycompany.invoice.web.controller;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.service.InvoiceServiceInterface;

import java.util.List;

public interface InvoiceControllerInterface {
	public void createInvoice();

	
	public void setService(InvoiceServiceInterface service);
}
