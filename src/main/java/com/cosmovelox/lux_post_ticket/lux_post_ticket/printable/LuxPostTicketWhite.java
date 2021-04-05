package com.cosmovelox.lux_post_ticket.lux_post_ticket.printable;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;

import com.cosmovelox.lux_post_ticket.lux_post_ticket.model.Person;
import com.cosmovelox.lux_post_ticket.lux_post_ticket.service.PrintService;


public class LuxPostTicketWhite extends AbstractLuxPostTicket implements Printable {
	private final int offsetX = 204;
	private final int offsetY = 108;
	private final int offsetTextX=10;
	private final int offsetTextY=58;
	private boolean notification;
	
	
	/**
	 * 
	 * @param sender of the post ticket
	 * @param receiver of the post package
	 * @param notification reception notification
	 * @param copies number of copies
	 */
    public LuxPostTicketWhite(Person sender, Person receiver, boolean notification) {
    	super(sender, receiver);
    	
    	this.notification = notification;

        /* Construct the print request specification.
        * The print data is a Printable object.
        * the request additonally specifies a job name, 2 copies, and
        * landscape orientation of the media.
        */
        PrintService printer = new PrintService(this);
        
        printer.print();
    }

    public int print(Graphics g,PageFormat pf,int pageIndex) {

            if (pageIndex == 0) {
                    Graphics2D g2d= (Graphics2D)g;
                    g2d.setColor(Color.black);
                    
                    if(notification) {
                    	g2d.fillRect(offsetX, offsetY, 8, 8);
                    }
                    g2d.setFont(new Font("TimesRoman", Font.PLAIN, 14)); 
                    g2d.drawString(sender.getFirstname() + " " +sender.getLastname(), offsetTextX+offsetX, offsetTextY+offsetY);
                    g2d.drawString(receiver.getFirstname() + " " +receiver.getLastname(), offsetTextX+offsetX, offsetTextY+23+offsetY);
                    g2d.drawString(receiver.getAddress(), offsetTextX+offsetX, offsetTextY+43+offsetY);
                    g2d.drawString(receiver.getZipCode() + " " + receiver.getCity(), offsetTextX+offsetX, offsetTextY+63+offsetY);
                    return Printable.PAGE_EXISTS;                                   
            } else {
                    return Printable.NO_SUCH_PAGE;
            }
    }

}