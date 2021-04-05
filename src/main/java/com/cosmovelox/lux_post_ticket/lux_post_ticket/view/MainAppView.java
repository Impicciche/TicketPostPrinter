package com.cosmovelox.lux_post_ticket.lux_post_ticket.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;


import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class MainAppView extends JFrame {

	private static final long serialVersionUID = 7181667287061990548L;
	private JTextField sender_firstname;
	private JTextField sender_lastname;
	private JTextField sender_address;
	private JTextField sender_city;
	private JTextField sender_zipcode;
	private JTextField receiver_firstname;
	private JTextField receiver_lastname;
	private JTextField receiver_address;
	private JTextField receiver_city;
	private JTextField receiver_zipcode;
	
	private JTextField numberCopies;
	private JCheckBox notification;
	
	private JRadioButton typeDocumentWhite;
	private JRadioButton typeDocumentRose;
	private JRadioButton typeDocumentLetter;
	
	
	private final ButtonGroup documentType = new ButtonGroup();
	private JButton btnPrint = new JButton("Print");

	/**
	 * Create the frame.
	 */
	public MainAppView() {
		setTitle("Print tickets");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 452);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel sender_panel = new JPanel();
		panel_1.add(sender_panel);
		sender_panel.setLayout(new GridLayout(11, 1, 0, 0));
		
		JLabel lblSender = new JLabel("Sender");
		lblSender.setFont(new Font("Dialog", Font.BOLD, 16));
		sender_panel.add(lblSender);
		
		JLabel lblFirstname = new JLabel("Firstname");
		sender_panel.add(lblFirstname);
		
		sender_firstname = new JTextField();
		sender_panel.add(sender_firstname);
		sender_firstname.setColumns(10);
		
		JLabel lblLastname = new JLabel("Lastname");
		sender_panel.add(lblLastname);
		
		sender_lastname = new JTextField();
		sender_panel.add(sender_lastname);
		sender_lastname.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		sender_panel.add(lblAddress);
		
		sender_address = new JTextField();
		sender_panel.add(sender_address);
		sender_address.setColumns(10);
		
		JLabel lblCity = new JLabel("City");
		sender_panel.add(lblCity);
		
		sender_city = new JTextField();
		sender_panel.add(sender_city);
		sender_city.setColumns(10);
		
		JLabel lblZipCode = new JLabel("Zip code");
		sender_panel.add(lblZipCode);
		
		sender_zipcode = new JTextField();
		sender_panel.add(sender_zipcode);
		sender_zipcode.setColumns(10);
		
		JPanel receiver_panel = new JPanel();
		panel_1.add(receiver_panel);
		receiver_panel.setLayout(new GridLayout(11, 1, 0, 0));
		
		JLabel lblReceiver = new JLabel("Receiver");
		lblReceiver.setFont(new Font("Dialog", Font.BOLD, 16));
		receiver_panel.add(lblReceiver);
		
		JLabel lblFirstname_1 = new JLabel("Firstname");
		receiver_panel.add(lblFirstname_1);
		
		receiver_firstname = new JTextField();
		receiver_firstname.setColumns(10);
		receiver_panel.add(receiver_firstname);
		
		JLabel lblLastname_1 = new JLabel("Lastname");
		receiver_panel.add(lblLastname_1);
		
		receiver_lastname = new JTextField();
		receiver_lastname.setColumns(10);
		receiver_panel.add(receiver_lastname);
		
		JLabel lblAddress_1 = new JLabel("Address");
		receiver_panel.add(lblAddress_1);
		
		receiver_address = new JTextField();
		receiver_address.setColumns(10);
		receiver_panel.add(receiver_address);
		
		JLabel lblCity_1 = new JLabel("City");
		receiver_panel.add(lblCity_1);
		
		receiver_city = new JTextField();
		receiver_city.setColumns(10);
		receiver_panel.add(receiver_city);
		
		JLabel lblZipCode_1 = new JLabel("Zip code");
		receiver_panel.add(lblZipCode_1);
		
		receiver_zipcode = new JTextField();
		receiver_zipcode.setColumns(10);
		receiver_panel.add(receiver_zipcode);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel ducument_panel = new JPanel();
		panel_4.add(ducument_panel);
		ducument_panel.setLayout(new GridLayout(6, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Notification");
		ducument_panel.add(lblNewLabel);
		
		notification = new JCheckBox("Notification");
		notification.setSelected(true);
		ducument_panel.add(notification);
		
		JLabel lblTypeDocument = new JLabel("Type document");
		ducument_panel.add(lblTypeDocument);
		
		
		
		typeDocumentWhite = new JRadioButton("White ticket");
		typeDocumentWhite.setSelected(true);
		documentType.add(typeDocumentWhite);
		ducument_panel.add(typeDocumentWhite);
		
		typeDocumentRose = new JRadioButton("Rose Ticket");
		documentType.add(typeDocumentRose);
		ducument_panel.add(typeDocumentRose);
		
		typeDocumentLetter = new JRadioButton("Letter");
		documentType.add(typeDocumentLetter);
		ducument_panel.add(typeDocumentLetter);
		
		
		
		JPanel copies_panel = new JPanel();
		panel_4.add(copies_panel);
		copies_panel.setLayout(new GridLayout(5, 1, 0, 0));
		
		JLabel lblNumberCopies = new JLabel("Number Copies");
		copies_panel.add(lblNumberCopies);
		
		numberCopies = new JTextField();
		numberCopies.setText("1");
		copies_panel.add(numberCopies);
		numberCopies.setColumns(10);
		
		
		copies_panel.add(btnPrint);
		
		JLabel lblNewLabel_1 = new JLabel("Created by Giuseppe Impiccichè <a href=\"mailto:giuseppe.impicciche87@gmail.com&subjet=PrintTicketApp\">giuseppe.impicciche87@gmail.com</a>");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(lblNewLabel_1, BorderLayout.SOUTH);
	}

	public JTextField getSenderFirstname() {
		return sender_firstname;
	}

	public JTextField getSenderLastname() {
		return sender_lastname;
	}

	public JTextField getSenderAddress() {
		return sender_address;
	}

	public JTextField getSenderCity() {
		return sender_city;
	}

	public JTextField getSenderZipcode() {
		return sender_zipcode;
	}

	public JTextField getReceiverFirstname() {
		return receiver_firstname;
	}

	public JTextField getReceiverLastname() {
		return receiver_lastname;
	}

	public JTextField getReceiverAddress() {
		return receiver_address;
	}

	public JTextField getReceiverCity() {
		return receiver_city;
	}

	public JTextField getReceiverZipcode() {
		return receiver_zipcode;
	}

	public JTextField getNumberCopies() {
		return numberCopies;
	}

	public JCheckBox getNotification() {
		return notification;
	}

	public ButtonGroup getDocumentType() {
		return documentType;
	}

	public JRadioButton getTypeDocumentWhite() {
		return typeDocumentWhite;
	}

	public JRadioButton getTypeDocumentRose() {
		return typeDocumentRose;
	}

	public JRadioButton getTypeDocumentLetter() {
		return typeDocumentLetter;
	}


	public JButton getBtnPrint() {
		return btnPrint;
	}


}
