package mypackage;
/****************************************************************/ 
 /*                      guiDesign                             */ 
 /*                                                              */ 
 /****************************************************************/ 
 import java.awt.*; 
 import java.awt.event.*; 
 import javax.swing.*;


import java.util.ArrayList;
 import java.util.Timer;
import java.util.TimerTask;
 /** 
  * Summary description for guiDesign 
  * 
  */ 
 @SuppressWarnings("serial")
public class ScrollingNewsHeadlines extends JFrame 
 { 
  // Variables declaration 
  private JPanel contentPane; 
  //----- 
  public JLabel jLabel2; 
  public JLabel jLabel3; 
  public JLabel jLabel4; 
  public JLabel jLabel5; 
  public JLabel jLabel6; 
  public JLabel jLabel7;
  private JPanel jPanel1; 
  //----- 
  private JLabel jLabel1; 
  private JTextField jTextField1; 
  private JPanel jPanel2; 
  //-----
  String textEntered = "";
  Timer timer;
  public static ArrayList<String> listOfTextEntered = new ArrayList<String>();
  static int lengthOfTextEntered = 0;
  static int lengthOfText = 0;
  //----- 
  // End of variables declaration 
  
  
  public ScrollingNewsHeadlines() 
  { 
   super(); 
   initializeComponent(); 
  
  
   this.setVisible(true); 
  } 
  
  /** 
   * This method is called from within the constructor to
initialize the form. 
   * WARNING: Do NOT modify this code. The content of this
method is always regenerated 
   * by the Windows Form Designer. Otherwise, retrieving
design might not work properly. 
   * Tip: If you must revise this method, please backup this GUI
file for JFrameBuilder 
   * to retrieve your design properly in future, before revising
this method. 
   */ 
  private void initializeComponent() 
  { 
   contentPane = (JPanel)this.getContentPane(); 
   //----- 
   jLabel2 = new JLabel(); 
   jLabel3 = new JLabel(); 
   jLabel4 = new JLabel();
   jLabel5 = new JLabel(); 
   jLabel6 = new JLabel(); 
   jLabel7 = new JLabel();
   jPanel1 = new JPanel(); 
   //----- 
   jLabel1 = new JLabel(); 
   jTextField1 = new JTextField(); 
   jPanel2 = new JPanel(); 
   //----- 
  
   // 
   // contentPane 
   // 
   contentPane.setLayout(null); 
   addComponent(contentPane, jPanel1, 15,8,446,46); 
   addComponent(contentPane, jPanel2,
15,64,446,55); 
   // 
   // jLabel2 
   // 
   jLabel2.setText("   "); 
   jLabel2.setBorder(BorderFactory.createLineBorder(Color.black));
   // 
   // jLabel3 
   // 
   jLabel3.setText("   "); 
   jLabel3.setBorder(BorderFactory.createLineBorder(Color.black));
   // 
   // jLabel4 
   // 
   jLabel4.setText("   ");
   
   jLabel4.setIconTextGap(20);
   jLabel4.setBorder(BorderFactory.createLineBorder(Color.black));
   jLabel5.setText("   "); 
   jLabel5.setBorder(BorderFactory.createLineBorder(Color.black));
   jLabel6.setText("   "); 
   jLabel6.setBorder(BorderFactory.createLineBorder(Color.black));
   jLabel7.setText("   ");
   jLabel7.setBorder(BorderFactory.createLineBorder(Color.black));
   // 
   // jPanel1 
   // 
   jPanel1.setLayout(new FlowLayout
(FlowLayout.CENTER, 15, 5)); 
   jPanel1.setBorder(BorderFactory.createLineBorder(Color.black));
   jPanel1.add(jLabel2, 0); 
   jPanel1.add(jLabel3, 1); 
   jPanel1.add(jLabel4, 2); 
   
   jPanel1.add(jLabel5, 3); 
   jPanel1.add(jLabel6, 4); 
   jPanel1.add(jLabel7, 5); 
   // 
   // jLabel1 
   // 
   jLabel1.setText("Enter Text and press Return"); 
   // 
   // jTextField1 
   // 
   jTextField1.setText("Text"); 
   jTextField1.setColumns(7);
   jTextField1.addActionListener(new ActionListener
() { 
    public void actionPerformed
(ActionEvent e) 
    { 
     jTextField1_actionPerformed
(e); 
    } 
  
   }); 
   // 
   // jPanel2 
   // 
   jPanel2.setLayout(new FlowLayout
(FlowLayout.CENTER, 5, 5)); 
   jPanel2.setBorder(BorderFactory.createLineBorder(Color.black));
   jPanel2.add(jLabel1, 0); 
   jPanel2.add(jTextField1, 1); 
   // 
   // guiDesign 
   // 
   this.setTitle("Scrolling News Headlines"); 
   this.setLocation(new Point(0, 0)); 
   this.setSize(new Dimension(483, 173)); 
  } 
  
  /** Add Component Without a Layout Manager (Absolute
Positioning) */ 
  private void addComponent(Container container,Component
c,int x,int y,int width,int height) 
  { 
   c.setBounds(x,y,width,height); 
   container.add(c); 
  } 

  private void jTextField1_actionPerformed(ActionEvent e) 
  { 
   //System.out.println
//("\njTextField1_actionPerformed(ActionEvent e) called."); 
   // TODO: Add any handling code here 
   textEntered = jTextField1.getText();
   if(textEntered != "")
   {
	   jTextField1.setEnabled(false);
	   this.startScrolling();
   }
  
  } 
  
 private void startScrolling()
 {
 	 this.EmptyAllLabels();
 	 this.shiftStringsFromRightToLeft();
 }
 private void EmptyAllLabels()
 {
	 jLabel2.setText("   "); 

	 jLabel3.setText("   "); 
	 jLabel4.setText("   "); 
	   
	 jLabel5.setText("   "); 
	 jLabel6.setText("   "); 
	 jLabel7.setText("   ");
 }
 private void shiftStringsFromRightToLeft()
 {
	 this.getAllTextEntered();
	 //lengthOfTextEntered = listOfTextEntered.size();
	 this.setlengthOfTextEntered(listOfTextEntered.size());
	 lengthOfText = getlengthOfTextEntered();
	 timer = new Timer();
	 Shifter shifter = new Shifter();

	 timer.schedule(shifter, 0, 2000);
 }
 
private void getAllTextEntered()
{
	for (int i = 0; i < textEntered.length(); i++){
	    String letter = textEntered.substring(i,i+1);
	    listOfTextEntered.add(letter);
	    //Process char
	}
}
public int getlengthOfTextEntered() {
    return this.lengthOfTextEntered;
}

public void setlengthOfTextEntered(int length) {
    this.lengthOfTextEntered = length;
}
  static int position = 0;
public class Shifter extends TimerTask {
    //times member represent calling times.
//guiDesign gdesign = new guiDesign();
    public void run()
    {
   	
   	if(lengthOfText <= 0)
   	{
   		if(jLabel2.getText() == "")
   		{
   			//continue pushing till jlabel2 is not null
   			jLabel7.setText(" ");
   			this.moveTextToLeft();
   		}
   		else
   		{
   			timer.cancel();
   			jTextField1.setEnabled(true);
   			listOfTextEntered.clear();
   			position = 0;
   	   		return;
   		}
   	}
   	//for each letter put it in the label7 and get the text in the other labels and move them the the
   	//label before them. If the first label is empty, continue pushing the letters
   	
   	if(position >= listOfTextEntered.size())
   	{
   		//jLabel7.setText(
   	}
   	else
   	{
   		jLabel7.setText(listOfTextEntered.get(position));
   	}
   	this.moveTextToLeft();
   	setlengthOfTextEntered(lengthOfText);
   	position++;
   	lengthOfText--;
    }
    public void moveTextToLeft()
    {
    	jLabel2.setText(jLabel3.getText());
       	jLabel3.setText(jLabel4.getText());
       	jLabel4.setText(jLabel5.getText());
       	jLabel5.setText(jLabel6.getText());
       	jLabel6.setText(jLabel7.getText());
       	jLabel7.setText(" ");
    }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

  public static void main(String[] args) 
  { 
   JFrame.setDefaultLookAndFeelDecorated(true); 
   JDialog.setDefaultLookAndFeelDecorated(true); 
   try 
   { 
    UIManager.setLookAndFeel
("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
   } 
   catch (Exception ex) 
   { 
    System.out.println("Failed loading L&F:"); 
    System.out.println(ex); 
   } 
   new ScrollingNewsHeadlines(); 
  } 
 //= End of Testing = 
  
  
 }  
 