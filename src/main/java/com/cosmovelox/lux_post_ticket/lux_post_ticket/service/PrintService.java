package com.cosmovelox.lux_post_ticket.lux_post_ticket.service;

import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.OrientationRequested;

public class PrintService {
	private Printable printable;
	
	public PrintService(Printable printable) {
		this.printable = printable;
	}
	
	public void print() {
		print(1, OrientationRequested.PORTRAIT);
	}
	
	public void print(int copies, OrientationRequested orientation) {
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
        aset.add(orientation);
        aset.add(new Copies(copies));
        aset.add(new JobName("Post White Ticket", null));

        /* Create a print job */
        PrinterJob pj = PrinterJob.getPrinterJob();   
        PageFormat pf = pj.defaultPage();
        Paper paper = new Paper();
        double margin = 0;
        paper.setImageableArea(margin, margin, paper.getWidth(), paper.getHeight());
        pf.setPaper(paper);
        pj.setPrintable(printable,pf);
        /* locate a print service that can handle the request */
        javax.print.PrintService[] services = PrinterJob.lookupPrintServices();

        if (services.length > 0) {
                System.out.println("selected printer " + services[0].getName());
                try {
                        pj.setPrintService((javax.print.PrintService) services[0]);
                        pj.pageDialog(aset);
                        if(pj.printDialog(aset)) {
                                pj.print(aset);
                        }
                } catch (PrinterException pe) { 
                        System.err.println(pe);
                }
        }
	}
}
