package com.cosmovelox.lux_post_ticket.lux_post_ticket.printable;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;

import com.cosmovelox.lux_post_ticket.lux_post_ticket.model.Person;
import com.cosmovelox.lux_post_ticket.lux_post_ticket.service.PrintService;


public class LuxPostTicketRose extends AbstractLuxPostTicket implements Printable {
	private int offsetX = 0;
	private int offsetY = 0;
	
	
	/**
	 * 
	 * @param sender of the post ticket
	 * @param receiver of the post package
	 * @param notification reception notification
	 * @param copies number of copies
	 */
    public LuxPostTicketRose(Person sender, Person receiver) {
    	super(sender, receiver);
    	

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
                    g2d.translate(pf.getImageableX(), pf.getImageableY()); 
                    g2d.setColor(Color.black);
                    g2d.drawString(sender.getFirstname() + " " +sender.getLastname(), offsetX, 250+offsetY);
                    g2d.drawString(sender.getAddress(), 250+offsetX, 310+offsetY);
                    g2d.drawString(sender.getZipCode() + " " + sender.getCity(), offsetX, 340+offsetY);
                    g2d.drawString(receiver.getFirstname() + " " +receiver.getLastname(), 250+offsetX, 450+offsetY);
                    g2d.drawString(receiver.getAddress(), 250+offsetX, 480+offsetY);
                    g2d.drawString(receiver.getZipCode() + " " + receiver.getCity(), 250+offsetX, 510+offsetY);
                    return Printable.PAGE_EXISTS;                                   
            } else {
                    return Printable.NO_SUCH_PAGE;
            }
    }

}