package iopack;

import java.io.FileInputStream;

public class InputStreamDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try (FileInputStream fis=new FileInputStream("test1.txt")) {
			int value=fis.read();
			while(value!=-1) {
				System.out.println(value);
				value=fis.read();
			}
		}catch(Exception e) {
				
			}
		
	}
}
