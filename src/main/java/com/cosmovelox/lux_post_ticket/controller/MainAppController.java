package com.cosmovelox.lux_post_ticket.controller;

import java.awt.print.Printable;

import javax.print.attribute.standard.OrientationRequested;

import com.cosmovelox.lux_post_ticket.lux_post_ticket.model.Person;
import com.cosmovelox.lux_post_ticket.lux_post_ticket.model.TicketDocument;
import com.cosmovelox.lux_post_ticket.lux_post_ticket.printable.LuxPostTicketLetter;
import com.cosmovelox.lux_post_ticket.lux_post_ticket.printable.LuxPostTicketRose;
import com.cosmovelox.lux_post_ticket.lux_post_ticket.printable.LuxPostTicketWhite;
import com.cosmovelox.lux_post_ticket.lux_post_ticket.service.PrintService;
import com.cosmovelox.lux_post_ticket.lux_post_ticket.view.MainAppView;

public class MainAppController {
	private Person sender;
	private Person receiver;
	private TicketDocument document;
	private MainAppView view;
	
	public MainAppController(Person sender, Person receiver,
			TicketDocument document, MainAppView view) {
		this.sender = sender;
		this.receiver = receiver;
		this.document = document;
		this.view = view;
		
		view.setVisible(true);
		
		view.getBtnPrint().addActionListener(e->this.print());
	}

	public void print() {
		getInputs();
		
		Printable ticket = null;
		OrientationRequested orientation=null;
		
		
		if(view.getTypeDocumentWhite().isSelected()) {
			ticket = new LuxPostTicketWhite(sender, receiver, document.isNotification());
			orientation = OrientationRequested.PORTRAIT;
		}
		
		if(view.getTypeDocumentRose().isSelected()) {
			ticket = new LuxPostTicketRose(sender, receiver);
			orientation = OrientationRequested.LANDSCAPE;
		}
		if(view.getTypeDocumentLetter().isSelected()) {
			ticket = new LuxPostTicketLetter(sender, receiver);
			orientation = OrientationRequested.LANDSCAPE;
		}
		
		
		PrintService printService = new PrintService(ticket);
		
		printService.print(document.getNumberCopies(), orientation);
		
	}
	
	private void getInputs() {
		sender.setFirstname(view.getSenderFirstname().getText());
		sender.setLastname(view.getSenderLastname().getText());
		sender.setAddress(view.getSenderAddress().getText());
		sender.setCity(view.getSenderCity().getText());
		sender.setZipCode(view.getSenderZipcode().getText());
		
		receiver.setFirstname(view.getReceiverFirstname().getText());
		receiver.setLastname(view.getReceiverLastname().getText());
		receiver.setAddress(view.getReceiverAddress().getText());
		receiver.setCity(view.getReceiverCity().getText());
		receiver.setZipCode(view.getReceiverZipcode().getText());
		
		document.setNotification(view.getNotification().isSelected());
		document.setTypeDocument(view.getDocumentType().getSelection());
		document.setNumberCopies(Integer.parseInt(view.getNumberCopies().getText()));
		
	}

}
