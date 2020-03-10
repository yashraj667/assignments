package iopack;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class BufferInputDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("test2.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(bis);
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		dis.close();
		bis.close();
		fis.close();
		System.out.println("prog ends");
	}

}
