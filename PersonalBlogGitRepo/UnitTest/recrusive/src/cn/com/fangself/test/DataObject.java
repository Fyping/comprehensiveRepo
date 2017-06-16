package cn.com.fangself.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DataObject implements Serializable {

	private static int i=0;
	private String word = "   ";
	public void setWord(String word){
		this.word = word;
	}
	public void setI(int i){
		this.i  = i;
	}
	
	@Override
	public String toString() {
		return "DataObject [word=" + word + "]"+"i=["+String.valueOf(i)+"]";
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		DataObject object = new DataObject();
		object.setWord("123");
		object.setI(2);
		ObjectOutputStream dot =
				new ObjectOutputStream(new FileOutputStream(new File("txt.txt")));
		dot.writeObject(object);
		dot.close();
		ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream(new File("txt.txt")));
		DataObject doi = (DataObject) ois.readObject();
		System.out.println(doi);
	}
}