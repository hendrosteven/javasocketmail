package com.salatigacode.javasocketmail;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

/**
* This code was generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a
* for-profit company or business) then you should purchase
* a license - please visit www.cloudgarden.com for details.
*/
public class PostMail extends javax.swing.JFrame {

	private JButton jButton3;
	private JList jList1;
	private JLabel jLabel6;
	private JLabel jLabel5;
	private JButton jButton2;
	private JTextArea jTextArea2;
	private JScrollPane jScrollPane3;
	private JScrollPane jScrollPane2;
	private JTextArea jTextArea1;
	private JButton jButton1;
	private JScrollPane jScrollPane1;
	private JTextField jTextField3;
	private JTextField jTextField2;
	private JTextField jTextField1;
	private JLabel jLabel4;
	private JLabel jLabel3;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JPanel jPanel3;
	private JPanel jPanel2;
	private JTabbedPane jTabbedPane1;
	private JPanel jPanel1;
	
	private String pengirimIP="";	
	private String pengirim="";
	private String subject="";
	private String tujuan="";
	private String pesan="";
	
	public PostMail() {
		initGUI();
	}

	/**
	* Initializes the GUI.
	* Auto-generated code - any changes you make will disappear.
	*/
	public void initGUI(){
		try {
			preInitGUI();
	
			jPanel1 = new JPanel();
			jTabbedPane1 = new JTabbedPane();
			jPanel2 = new JPanel();
			jLabel1 = new JLabel();
			jLabel2 = new JLabel();
			jLabel3 = new JLabel();
			jLabel4 = new JLabel();
			jTextField1 = new JTextField();
			jTextField2 = new JTextField();
			jTextField3 = new JTextField();
			jScrollPane1 = new JScrollPane();
			jTextArea1 = new JTextArea();
			jButton1 = new JButton();
			jPanel3 = new JPanel();
			jScrollPane2 = new JScrollPane();
			jList1 = new JList();
			jScrollPane3 = new JScrollPane();
			jTextArea2 = new JTextArea();
			jButton2 = new JButton();
			jLabel5 = new JLabel();
			jLabel6 = new JLabel();
			jButton3 = new JButton();
	
			this.getContentPane().setLayout(null);
			this.setSize(new java.awt.Dimension(539,446));
			this.getContentPane().setBackground(new java.awt.Color(224,252,235));
			this.addWindowListener( new WindowAdapter() {
				public void windowClosing(WindowEvent evt) {
					PostMailWindowClosing(evt);
				}
			});
	
			jPanel1.setLayout(null);
			jPanel1.setBackground(new java.awt.Color(224,252,235));
			jPanel1.setPreferredSize(new java.awt.Dimension(513,366));
			jPanel1.setBounds(new java.awt.Rectangle(10,12,513,366));
			this.getContentPane().add(jPanel1);
	
			jTabbedPane1.setBackground(new java.awt.Color(224,252,235));
			jTabbedPane1.setPreferredSize(new java.awt.Dimension(507,351));
			jTabbedPane1.setBounds(new java.awt.Rectangle(2,8,507,351));
			jPanel1.add(jTabbedPane1);
	
			jPanel2.setLayout(null);
			jPanel2.setBackground(new java.awt.Color(224,252,235));
			jPanel2.setFont(new java.awt.Font("Comic Sans MS",0,14));
			jPanel2.setForeground(new java.awt.Color(0,0,255));
			jPanel2.setPreferredSize(new java.awt.Dimension(502,323));
			jPanel2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			jTabbedPane1.add(jPanel2);
			jTabbedPane1.setTitleAt(0, "Send Message");
	
			jLabel1.setText("Sender");
			jLabel1.setFont(new java.awt.Font("Comic Sans MS",0,14));
			jLabel1.setForeground(new java.awt.Color(0,0,255));
			jLabel1.setPreferredSize(new java.awt.Dimension(60,20));
			jLabel1.setBounds(new java.awt.Rectangle(14,11,60,20));
			jPanel2.add(jLabel1);
	
			jLabel2.setText("Subject");
			jLabel2.setFont(new java.awt.Font("Comic Sans MS",0,14));
			jLabel2.setForeground(new java.awt.Color(0,0,255));
			jLabel2.setPreferredSize(new java.awt.Dimension(60,20));
			jLabel2.setBounds(new java.awt.Rectangle(11,32,60,20));
			jPanel2.add(jLabel2);
	
			jLabel3.setText("To");
			jLabel3.setFont(new java.awt.Font("Comic Sans MS",0,14));
			jLabel3.setForeground(new java.awt.Color(0,0,255));
			jLabel3.setPreferredSize(new java.awt.Dimension(60,20));
			jLabel3.setBounds(new java.awt.Rectangle(12,55,60,20));
			jPanel2.add(jLabel3);
	
			jLabel4.setText("Message");
			jLabel4.setFont(new java.awt.Font("Comic Sans MS",0,14));
			jLabel4.setForeground(new java.awt.Color(0,0,255));
			jLabel4.setPreferredSize(new java.awt.Dimension(60,20));
			jLabel4.setBounds(new java.awt.Rectangle(15,78,60,20));
			jPanel2.add(jLabel4);
	
			jTextField1.setFont(new java.awt.Font("Comic Sans MS",0,12));
			jTextField1.setPreferredSize(new java.awt.Dimension(275,20));
			jTextField1.setBounds(new java.awt.Rectangle(81,9,275,20));
			jPanel2.add(jTextField1);
	
			jTextField2.setFont(new java.awt.Font("Comic Sans MS",0,12));
			jTextField2.setPreferredSize(new java.awt.Dimension(275,20));
			jTextField2.setBounds(new java.awt.Rectangle(81,32,275,20));
			jPanel2.add(jTextField2);
	
			jTextField3.setFont(new java.awt.Font("Comic Sans MS",0,12));
			jTextField3.setPreferredSize(new java.awt.Dimension(184,20));
			jTextField3.setBounds(new java.awt.Rectangle(81,55,184,20));
			jPanel2.add(jTextField3);
	
			jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			jScrollPane1.setPreferredSize(new java.awt.Dimension(409,196));
			jScrollPane1.setBounds(new java.awt.Rectangle(81,79,409,196));
			jPanel2.add(jScrollPane1);
	
			jTextArea1.setFont(new java.awt.Font("Comic Sans MS",0,12));
			jScrollPane1.add(jTextArea1);
			jScrollPane1.setViewportView(jTextArea1);
	
			jButton1.setText("Send");
			jButton1.setPreferredSize(new java.awt.Dimension(71,28));
			jButton1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			jButton1.setBounds(new java.awt.Rectangle(418,282,71,28));
			jPanel2.add(jButton1);
			jButton1.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					jButton1ActionPerformed(evt);
				}
			});
	
			jPanel3.setLayout(null);
			jPanel3.setBackground(new java.awt.Color(224,252,235));
			jPanel3.setPreferredSize(new java.awt.Dimension(502,323));
			jPanel3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			jTabbedPane1.add(jPanel3);
			jTabbedPane1.setTitleAt(1, "Inbox");
	
			jScrollPane2.setPreferredSize(new java.awt.Dimension(138,236));
			jScrollPane2.setBounds(new java.awt.Rectangle(10,41,138,236));
			jPanel3.add(jScrollPane2);
	
			jScrollPane2.add(jList1);
			jScrollPane2.setViewportView(jList1);
			jList1.addMouseListener( new MouseAdapter() {
				public void mouseClicked(MouseEvent evt) {
					jList1MouseClicked(evt);
				}
			});
	
			jScrollPane3.setPreferredSize(new java.awt.Dimension(337,235));
			jScrollPane3.setBounds(new java.awt.Rectangle(155,42,337,235));
			jPanel3.add(jScrollPane3);
	
			jTextArea2.setPreferredSize(new java.awt.Dimension(334,228));
			jScrollPane3.add(jTextArea2);
			jScrollPane3.setViewportView(jTextArea2);
	
			jButton2.setText("Refresh Inbox");
			jButton2.setPreferredSize(new java.awt.Dimension(113,29));
			jButton2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			jButton2.setBounds(new java.awt.Rectangle(10,283,113,29));
			jPanel3.add(jButton2);
			jButton2.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					jButton2ActionPerformed(evt);
				}
			});
	
			jLabel5.setText("Sender");
			jLabel5.setFont(new java.awt.Font("Comic Sans MS",0,14));
			jLabel5.setForeground(new java.awt.Color(0,0,255));
			jLabel5.setPreferredSize(new java.awt.Dimension(60,20));
			jLabel5.setBounds(new java.awt.Rectangle(13,15,60,20));
			jPanel3.add(jLabel5);
	
			jLabel6.setText("Message");
			jLabel6.setFont(new java.awt.Font("Comic Sans MS",0,14));
			jLabel6.setForeground(new java.awt.Color(0,0,255));
			jLabel6.setPreferredSize(new java.awt.Dimension(60,20));
			jLabel6.setBounds(new java.awt.Rectangle(158,16,60,20));
			jPanel3.add(jLabel6);
	
			jButton3.setText("Delete");
			jButton3.setPreferredSize(new java.awt.Dimension(86,29));
			jButton3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
			jButton3.setBounds(new java.awt.Rectangle(129,283,86,29));
			jPanel3.add(jButton3);
			jButton3.addActionListener( new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					jButton3ActionPerformed(evt);
				}
			});
	
			postInitGUI();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/** Add your pre-init code in here 	*/
	public void preInitGUI(){
	}

	/** Add your post-init code in here 	*/
	public void postInitGUI(){
		try {
			pengirimIP=InetAddress.getLocalHost().toString();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"Error pada IP Pengirim...");
		}	
		this.setTitle("PostMail");
		String pengirim="";
		String subject="";
		String tujuan="";
		String pesan="";
		updateInbox();
	}

	/** Auto-generated main method */
	public static void main(String[] args){
		showGUI();
	}

	/**
	* This static method creates a new instance of this class and shows
	* it inside a new JFrame, (unless it is already a JFrame).
	*
	* It is a convenience method for showing the GUI, but it can be
	* copied and used as a basis for your own code.	*
	* It is auto-generated code - the body of this method will be
	* re-generated after any changes are made to the GUI.
	* However, if you delete this method it will not be re-created.	*/
	public static void showGUI(){
		try {
			PostMail inst = new PostMail();
			inst.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/** Auto-generated event handler method */
	protected void jButton1ActionPerformed(ActionEvent evt){
		//TODO add your handler code here
		FileName fn = new FileName();
		pengirim = jTextField1.getText();
		subject = jTextField2.getText();
		tujuan = jTextField3.getText();
		pesan = jTextArea1.getText();
		Mail email = new Mail(fn.getCurrDate(),pengirimIP,pengirim,subject,tujuan,pesan);
		MailClient mc;
		try {
			mc = new MailClient(tujuan);
			mc.sendMail(email);
			JOptionPane.showMessageDialog(null,"Message Send...");
			jTextField1.setText("");
			jTextField2.setText("");
			jTextField3.setText("");
			jTextArea1.setText("");	
		}catch(ConnectException e){
			JOptionPane.showMessageDialog(null,"Destination Server is Offline...");
		}catch (java.net.UnknownHostException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,"Unknown Destination Server...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}					
	}
	
	private Vector inbox = new Vector();
	private Vector inboxView = new Vector();	
	private String[] s;
	protected void updateInbox(){
		File f = new File("MailBank");
		s = f.list();			
		Mail receiveMail = new Mail();
		inbox.clear();
		inboxView.clear();		
		for(int i=0;i<s.length;i++){			
			try {				
				FileInputStream fin = new FileInputStream("MailBank/"+s[i]);
				ObjectInputStream in = new ObjectInputStream(fin);
				receiveMail = (Mail)in.readObject();
				inboxView.addElement(receiveMail.getPengirim()+" "+ receiveMail.getTgl());
				inbox.addElement(receiveMail);				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch(ClassNotFoundException e){
				e.printStackTrace();
			} catch(ArrayIndexOutOfBoundsException e){
				JOptionPane.showMessageDialog(null,"Lopping Erro...\n"+e.getMessage());				
			}
		}		
		jList1.setListData(inboxView);		
	}

	/** Auto-generated event handler method */
	protected void jButton2ActionPerformed(ActionEvent evt){
		//TODO add your handler code here
		updateInbox();
	}

	/** Auto-generated event handler method */
	protected void rootWindowClosed(WindowEvent evt){
		//TODO add your handler code here
	}

	/** Auto-generated event handler method */
	protected void PostMailWindowClosing(WindowEvent evt){
		//TODO add your handler code here
		System.exit(0);
	}

	/** Auto-generated event handler method */
	protected void jButton3ActionPerformed(ActionEvent evt){
		//TODO add your handler code here
		String file="";
		try{	
			file = "MailBank/"+s[jList1.getSelectedIndex()];		
			File f = new File(file);		
			boolean hapus = f.delete();
			if(!hapus){
				JOptionPane.showMessageDialog(null,"Mail can't be deleted...\n"+
							"You must deleted manualy...");
			}else{
				updateInbox();
			}
		}catch (IndexOutOfBoundsException e){
			JOptionPane.showMessageDialog(null,"Please Select one Mail...");
		}			
		
	}

	/** Auto-generated event handler method */
	protected void jList1MouseClicked(MouseEvent evt){
		//TODO add your handler code here
		int indexData = jList1.getSelectedIndex();
		Mail readMail = new Mail();
		readMail = (Mail)inbox.get(indexData);
		String tgl = "Send Date   : "+readMail.getTgl()+"\n";
		String pengirim = "Sender : "+readMail.getPengirim()+ " on " + readMail.getSenderIP()+"\n";
		String subject = "Subject    : "+readMail.getSubject()+"\n";
		String pesan = "Messages      :\n"+readMail.getMsg()+"\n";
		
		jTextArea2.setText(tgl+pengirim+subject+pesan);
	}

	
}
