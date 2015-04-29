package com.salatigacode.javasocketmail;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * Created on Dec 3, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author hendro
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ReadMail {
	public ReadMail(){		
	}
	
	public static void main(String args[]) throws IOException, ClassNotFoundException{
		Mail receiveMail = new Mail();
		FileInputStream fin = new FileInputStream("MailBank/"+args[0]);
		ObjectInputStream in = new ObjectInputStream(fin);
		
		System.out.println();
		receiveMail = (Mail)in.readObject();
		System.out.println("Pengirim : "+receiveMail.getPengirim()+" on "+receiveMail.getSenderIP());
		System.out.println("Subject  : "+receiveMail.getSubject());
		System.out.println("Message :");
		System.out.print(receiveMail.getMsg());
		fin.close();
		in.close();		
	}
	
}
