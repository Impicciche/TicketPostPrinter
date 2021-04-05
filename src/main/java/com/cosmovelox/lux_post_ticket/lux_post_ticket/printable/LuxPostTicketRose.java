package com.cosmovelox.lux_post_ticket.lux_post_ticket.printable;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;

import com.cosmovelox.lux_post_ticket.lux_post_ticket.model.Person;


public class LuxPostTicketRose extends AbstractLuxPostTicket implements Printable {
	private int offsetX = 309;
	private int offsetY = 250;
	
	
	/**
	 * 
	 * @param sender of the post ticket
	 * @param receiver of the post package
	 * @param notification reception notification
	 * @param copies number of copies
	 */
    public LuxPostTicketRose(Person sender, Person receiver) {
    	super(sender, receiver);
    	

    }
    public int print(Graphics g,PageFormat pf,int pageIndex) {

	        if (pageIndex == 0) {
	                Graphics2D g2d= (Graphics2D)g;
	                g2d.setColor(Color.black);
	                g2d.drawString(receiver.getFirstname() + " " +receiver.getLastname(), offsetX, offsetY);
	                g2d.drawString(receiver.getAddress(), offsetX, 14+offsetY);
	                g2d.drawString(receiver.getZipCode() + " " + receiver.getCity(), offsetX, 28+offsetY);
	                g2d.drawString(sender.getFirstname() + " " +sender.getLastname(), 242+offsetX, 83+offsetY);
	                g2d.drawString(sender.getAddress(), 242+offsetX, 97+offsetY);
	                g2d.drawString(sender.getZipCode() + " " + sender.getCity(), 242+offsetX, 111+offsetY);
	                return Printable.PAGE_EXISTS;                                   
	        } else {
	                return Printable.NO_SUCH_PAGE;
	        }
	}


}