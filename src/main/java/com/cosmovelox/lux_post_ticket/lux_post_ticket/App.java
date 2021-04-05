package com.cosmovelox.lux_post_ticket.lux_post_ticket;

import com.cosmovelox.lux_post_ticket.controller.MainAppController;
import com.cosmovelox.lux_post_ticket.lux_post_ticket.model.Person;
import com.cosmovelox.lux_post_ticket.lux_post_ticket.model.TicketDocument;
import com.cosmovelox.lux_post_ticket.lux_post_ticket.view.MainAppView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Person sender = new Person();
    	Person receiver = new Person();
    	MainAppView mainView = new MainAppView();
    	TicketDocument ticketDocument = new TicketDocument();
    	
    	new MainAppController(sender, receiver, ticketDocument, mainView);
    	
    	mainView.setVisible(true);
    }
}
