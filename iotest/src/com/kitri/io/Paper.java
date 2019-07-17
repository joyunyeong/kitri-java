package com.kitri.io;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Paper extends JFrame {
	private JTextField from;
	private JTextField to;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paper frame = new Paper();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Paper() {
		getContentPane().setBackground(new Color(255, 215, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 301);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 215, 0));
		panel.setBorder(new LineBorder(SystemColor.activeCaption));
		panel.setBounds(12, 10, 313, 243);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Iblfrom = new JLabel("From :");
		Iblfrom.setBounds(12, 20, 57, 15);
		panel.add(Iblfrom);
		
		from = new JTextField();
		from.setSelectionColor(new Color(255, 165, 0));
		from.setBackground(new Color(255, 165, 0));
		from.setBounds(58, 17, 82, 21);
		panel.add(from);
		from.setColumns(10);
		
		JLabel lblTo = new JLabel("To :");
		lblTo.setBounds(185, 20, 57, 15);
		panel.add(lblTo);
		
		to = new JTextField();
		to.setBackground(new Color(255, 165, 0));
		to.setColumns(10);
		to.setBounds(219, 17, 82, 21);
		panel.add(to);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("");
		textArea.setBounds(12, 45, 289, 160);
		panel.add(textArea);
		
		JButton send = new JButton("\uBCF4\uB0B4\uAE30");
		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		send.setBounds(58, 215, 97, 23);
		panel.add(send);
		
		JButton cancle = new JButton("\uCDE8\uC18C");
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cancle.setBounds(168, 215, 97, 23);
		panel.add(cancle);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 313, 243);
		getContentPane().add(panel_1);
	}

}
