package com.salatigacode.javasocketmail;
import java.io.Serializable;

/*
 * Created on Dec 4, 2004
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
public class Mail implements Serializable {	
	private String tgl="";
	private String pengirim="";
	private String senderIP="";
	private String subject="";
	private String tujuan="";
	private String msg="";
	
	public Mail(){}
	
		
	/**
	 * @param pengirim
	 * @param subject
	 * @param tujuan
	 * @param msg
	 */
	public Mail(String tgl,String senderIP,String pengirim, String subject, String tujuan, String msg) {	
		this.tgl = tgl;
		this.pengirim = pengirim;
		this.senderIP = senderIP;
		this.subject = subject;
		this.tujuan = tujuan;
		this.msg = msg;		
	}
	
	/**
	 * @return Returns the msg.
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg The msg to set.
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return Returns the pengirim.
	 */
	public String getPengirim() {
		return pengirim;
	}
	/**
	 * @param pengirim The pengirim to set.
	 */
	public void setPengirim(String pengirim) {
		this.pengirim = pengirim;
	}
	/**
	 * @return Returns the senderIP.
	 */
	public String getSenderIP() {
		return senderIP;
	}
	/**
	 * @param senderIP The senderIP to set.
	 */
	public void setSenderIP(String senderIP) {
		this.senderIP = senderIP;
	}
	/**
	 * @return Returns the subject.
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject The subject to set.
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	/**
	 * @return Returns the tgl.
	 */
	public String getTgl() {
		return tgl;
	}
	/**
	 * @param tgl The tgl to set.
	 */
	public void setTgl(String tgl) {
		this.tgl = tgl;
	}
}
