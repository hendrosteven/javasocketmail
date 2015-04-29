package com.salatigacode.javasocketmail;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
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
public class MailClient {
	public Socket sendMailSocket; 
	public String toAddr;
	public DataOutputStream mail;
	public ObjectOutputStream out;

	public MailClient(String toAddr)throws java.net.UnknownHostException, IOException{
		this.toAddr = toAddr;
		this.sendMailSocket = new Socket(toAddr,777);		
	}
	public int sendMail(Mail email){
		try {			
			mail = new DataOutputStream(sendMailSocket.getOutputStream());
			out = new ObjectOutputStream(mail);
			out.writeObject(email);
			closeConnection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}
	public void closeConnection(){
		try {
			mail.close();
			out.close();
			sendMailSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
