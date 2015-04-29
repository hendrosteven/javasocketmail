package com.salatigacode.javasocketmail;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

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
public class MultiMailServer {
	static final int PORT = 777;
	public ServerSocket mms;
	
	public MultiMailServer(){
		try {
			mms = new ServerSocket(PORT);
			System.out.println("Mail Server Started...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void startMultiMailServer() throws IOException {
		try{
			while(true){
				Socket socket = mms.accept();
				MailServer ms=new MailServer(socket);
				ms.start();
				System.out.println("You have a New Message...");
			}
		}finally{
			mms.close();
		}
			
	}
	public static void main(String args[]) throws IOException{
		MultiMailServer ms = new MultiMailServer();
		try {
			ms.startMultiMailServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
