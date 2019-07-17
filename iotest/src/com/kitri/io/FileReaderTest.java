package com.kitri.io;

import java.io.*;

public class FileReaderTest {
	public static void main(String[] args) {

		FileReader fr = null;
		FileWriter fw = null;
		
		try { // file이 없을 수가 있으니까 try catch하라고 나오는 것임
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
			fw.write(str); // 이상태로만 끝내면 당연히 새로운 파일에 내용 안써있음 finally처리 해야함
			
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
