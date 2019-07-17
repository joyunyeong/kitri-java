package com.kitri.io;

import java.io.*;

public class BufferedReaderTest {
	public static void main(String[] args) {
		BufferedReader fin = null; // 문자열 단위로 받을 수 있는게 이것밖에 없다.
		FileWriter fw = null; // BufferedWriter쓰면 출력엔 문제가 없지만 입력받을 때가 문제얌
		try {
//			InputStream is = System.in;
//			Reader r = new InputStreamReader(is); // 로꾸꺼로 거슬러 올라가기
//			BufferedReader in = new BufferedReader(r); //readLine() : 한줄단위로 읽어온다.
			
			//위에 내용을 줄여서!!(아래)
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			// system에서 읽어와라
			System.out.println("파일 이름 : ");
			String infile = in.readLine(); // in.readLine의 기준은 ENTER! > 한줄 읽어오기(ENTER전까지 읽어들임)
			System.out.println("infile == "+infile);
			
			System.out.println("복사할 파일이름 : ");
			String outfile = in.readLine();
			fw = new FileWriter(new File(outfile));
			
			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
			//file에서 읽어와라
			
			String str= null;
			while((str = fin.readLine()) != null) {
				System.out.println(str);
				fw.write(str + "\r\n"); // + \r\n안하면 그냥 한줄로 쭈루루룩 나온다.
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
