package com.salatigacode.javasocketmail;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/*
 * Created on Dec 3, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author Hendro Steven
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MailServer extends Thread{
    private Mail receiveMail;
    private Socket serviceSocket = null;   
    private DataInputStream in;
    private FileOutputStream fileMail;
    private ObjectInputStream oin;
    private ObjectOutputStream oout;
    private FileName fn = new FileName();  
    
    
    public MailServer(Socket socket) {	
    	this.serviceSocket = socket;
    }

    public void run() {			 
	     try{	   
	     	in = new DataInputStream(serviceSocket.getInputStream());
	     	oin = new ObjectInputStream(in);
	     	fileMail = new FileOutputStream(fn.getFileName());	
	     	oout = new ObjectOutputStream(fileMail);
	     	try {
				receiveMail = (Mail)oin.readObject();
				oout.writeObject(receiveMail);
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	     	       	       
			fileMail.close();
			in.close();
			oin.close();
			oout.close();    
	        fileMail.close();
	        serviceSocket.close();
	     
	     } catch(IOException e){	  
	     	e.printStackTrace();	     	
	     }catch(NullPointerException e){
	     	System.out.println("Please read that email...");
	     } 	
    }
}
