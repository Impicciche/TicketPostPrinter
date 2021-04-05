package com.cosmovelox.lux_post_ticket.lux_post_ticket.model;

import javax.swing.ButtonModel;

public class TicketDocument {
	private ButtonModel typeDocument;
	private int numberCopies;
	private boolean notification;
	
	public TicketDocument(ButtonModel typeDocument, int numberCopies, boolean notification) {
		super();
		this.typeDocument = typeDocument;
		this.numberCopies = numberCopies;
		this.notification = notification;
	}
	
	public TicketDocument() {
		this.typeDocument = null;
		this.numberCopies = 1;
		this.notification = false;
	}
	public ButtonModel getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(ButtonModel typeDocument) {
		this.typeDocument = typeDocument;
	}
	public int getNumberCopies() {
		return numberCopies;
	}
	public void setNumberCopies(int numberCopies) {
		this.numberCopies = numberCopies;
	}
	public boolean isNotification() {
		return notification;
	}
	public void setNotification(boolean notification) {
		this.notification = notification;
	}

	@Override
	public String toString() {
		return "TicketDocument [typeDocument=" + typeDocument + ", numberCopies=" + numberCopies + ", notification="
				+ notification + "]";
	}
	
	
	
}
