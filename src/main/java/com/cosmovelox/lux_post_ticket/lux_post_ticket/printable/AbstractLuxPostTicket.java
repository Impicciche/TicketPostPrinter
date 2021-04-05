package com.cosmovelox.lux_post_ticket.lux_post_ticket.printable;

import com.cosmovelox.lux_post_ticket.lux_post_ticket.model.Person;

public class AbstractLuxPostTicket {
	protected Person sender;
	protected Person receiver;
	
	public AbstractLuxPostTicket(Person sender, Person receiver){
		this.sender = sender;
		this.receiver = receiver;
	}

	public Person getSender() {
		return sender;
	}

	public void setSender(Person sender) {
		this.sender = sender;
	}

	public Person getReceiver() {
		return receiver;
	}

	public void setReceiver(Person receiver) {
		this.receiver = receiver;
	}

	
	
}
