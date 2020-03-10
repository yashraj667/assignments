package iopack;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class BufferWriteDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("test2.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		dos.writeInt(890);
		dos.writeFloat(33.3f);
		dos.writeBoolean(true);
		dos.writeDouble(22.2);
		dos.close();
		bos.close();
		fos.close();
	}

}
