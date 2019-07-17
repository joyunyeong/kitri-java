package com.kitri.io;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {
		BufferedReader fin = null; // ���ڿ� ������ ���� �� �ִ°� �̰͹ۿ� ����.
		FileWriter fw = null; // BufferedWriter���� ��¿� ������ ������ �Է¹��� ���� ������
		try {
//			InputStream is = System.in;
//			Reader r = new InputStreamReader(is); // �βٲ��� �Ž��� �ö󰡱�
//			BufferedReader in = new BufferedReader(r); //readLine() : ���ٴ����� �о�´�.
			
			//���� ������ �ٿ���!!(�Ʒ�)
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			// system���� �о�Ͷ�
			System.out.println("���� �̸� : ");
			String infile = in.readLine(); // in.readLine�� ������ ENTER! > ���� �о����(ENTER������ �о����)
			System.out.println("infile == "+infile);
			
			System.out.println("������ �����̸� : ");
			String outfile = in.readLine();
			fw = new FileWriter(new File(outfile));
			
			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
			//file���� �о�Ͷ�
			
			String str= null;
			while((str = fin.readLine()) != null) {
				System.out.println(str);
				fw.write(str + "\r\n"); // + \r\n���ϸ� �׳� ���ٷ� �޷��� ���´�.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
