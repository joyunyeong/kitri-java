package com.kitri.io;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		
		try { // file�� ���� ���� �����ϱ� try catch�϶�� ������ ����
			File infile = new File("f:\\iotest\\hello.txt");
			fr = new FileReader(infile);
			long length = infile.length();
			char c[] = new char[(int) length];
			int x = fr.read(c);
			System.out.println(x + "characters read!!!");
			String str = new String(c);
			System.out.println(str);
			
			File outFile = new File("f:\\iotest\\hello.txt");
			fw = new FileWriter(outFile);
			fw.write(str); // �̻��·θ� ������ �翬�� ���ο� ���Ͽ� ���� �Ƚ����� finallyó�� �ؾ���
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(fw != null)
					fw.close();
					if(fr != null)
						fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
