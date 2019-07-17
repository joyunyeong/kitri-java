package com.kitri.io;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ReName extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	JPanel panel = new JPanel();
	JLabel lblNewLabel = new JLabel("Old Name : ");
	JLabel lblNewName = new JLabel("New Name :");
	JButton ok = new JButton("\uBCC0 \uACBD");
	JButton cancle = new JButton("\uCDE8 \uC18C");

	public ReName() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 162);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel.setBackground(new Color(230, 230, 250));
		panel.setBorder(new LineBorder(new Color(169, 169, 169)));
		panel.setBounds(0, 0, 296, 124);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel.setBounds(40, 25, 77, 15);
		panel.add(lblNewLabel);
		
		lblNewName.setBounds(40, 53, 77, 15);
		panel.add(lblNewName);
		
		textField = new JTextField();
		textField.setBounds(124, 50, 142, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		ok.setBounds(87, 91, 66, 23);
		panel.add(ok);
		
		cancle.setBounds(166, 91, 66, 23);
		panel.add(cancle);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReName frame = new ReName();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
