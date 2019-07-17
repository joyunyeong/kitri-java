package com.kitri.io;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Notepad extends JFrame implements ActionListener {

	JPanel contentPane;
	
	JMenuBar mb = new JMenuBar();

	JMenu file = new JMenu("\uD30C\uC77C"); //파일
	JMenu help = new JMenu("\uB3C4\uC6C0\uB9D0");

	JMenuItem open = new JMenuItem("\uC5F4\uAE30");
	JMenuItem save = new JMenuItem("\uC800\uC7A5");
	JMenuItem exit = new JMenuItem("\uC885\uB8CC");
	JMenuItem mntmNewMenuItem = new JMenuItem("(\uBE44\uC5B4\uC788\uC74C)");

	JScrollPane scrollPane = new JScrollPane();
	JTextArea editor = new JTextArea();

	public Notepad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

//		내가 만든 부분		
//		Frame f = new Frame();
//		Window w = new Window(f); // frame의 오너는 f
//		FileDialog fd = new FileDialog(f, "이건 뭐지");
//		JWindow jw = new JWindow(new Window(f));
		
		
		mb.setBounds(0, 0, 434, 21);
		mb.add(file);
		mb.add(help);
		
		contentPane.add(mb);
			
		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		
		help.add(mntmNewMenuItem);
		
		contentPane.add(scrollPane);
		scrollPane.setBounds(0, 20, 434, 242);
		scrollPane.setViewportView(editor);
		
		// event 달기
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Frame f = new Frame();
//		Window w = new Window(f); // frame의 오너는 f
//		JWindow jw = new JWindow(new Window(f));
		
		Object ob = e.getSource();
		if(ob == exit) {
			System.exit(0);
		} else if (ob == open) {
//			FileDialog fd = new FileDialog(this, "이건 뭐지");
			JFileChooser jfc = new JFileChooser();
			jfc.setCurrentDirectory(new File(""));
			jfc.showOpenDialog(this);
			
			BufferedReader fin = null;  
			File file = jfc.getSelectedFile(); // 윈도우 : 슬래시, 맥/윈도우 : 역슬래시
			if(file != null) {
				String infile = file.getPath();
			}
//			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
			String infile = file.getName();
			System.out.println(infile);
			String str =null;
			
		} else if (ob == save ) {
			JFileChooser jfc = new JFileChooser();
			jfc.setCurrentDirectory(new File(""));
			jfc.showSaveDialog(this);
			
			String data = editor.getText();
			System.out.println(data);
		}
	}
	
	//main!!!!!!!!!!!!!!!
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notepad frame = new Notepad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
