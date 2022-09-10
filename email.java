import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
 
/* 
<applet code="email" Width=1400 Height=700>
</applet>
*/
          
		 
	/*	 class framemain extends Frame
			{
				framemain(String title)
				{
					super(title);
					this.setVisible(true);
					this.setSize(1000,1000);
					
					MyWindowAdapter adaptobj=new MyWindowAdapter(this);
							addWindowListener(adaptobj);   
				}
				public void paint(Graphics g)
				{
					g.drawString("This is my frame",500,100);
				}
			}

			class MyWindowAdapter extends WindowAdapter
			{
				framemain fm;
				public MyWindowAdapter(framemain fm)
				{
					this.fm=fm;
				}
				public void WindowClosing(WindowEvent we)
				{
					fm.setVisible(false);
				}
	        }
*/			
    public class email extends Applet implements ActionListener
		{
		  Image img,mg;Button b1,b2,b3,b4;TextField t1,t2; framemain f; int a;String msg="",ms="",s="",y="",r=""; Checkbox c2;
          int w1,w2,h1,h2,w3,h3,w4,h4,w5,h5,w6,h6,c3=0; Color c5;
		  private ImageIcon logo1 = new ImageIcon("instalogo.jpg"); 
		  private ImageIcon m = new ImageIcon("gif.jpg"); 
		  private ImageIcon fb = new ImageIcon("fb.jpg"); 
		  private ImageIcon goo = new ImageIcon("goo.png"); 
		  private ImageIcon ph = new ImageIcon("ph.jpg"); 
		  private ImageIcon pho = new ImageIcon("pho.jpg"); 
		  public void init()
			{
				 w1 = logo1.getIconWidth(); 
                 h1 = logo1.getIconHeight(); 
				 w1=(w1*40)/w1;h1=(h1*40)/h1;
				 
				 w5 = ph.getIconWidth(); 
                 h5 = ph.getIconHeight(); 
				 w5=(w5*120)/w5;h5=(h5*80)/h5;
				 
				 w6 = pho.getIconWidth(); 
                 h6 = pho.getIconHeight(); 
				 w6=(w6*120)/w6;h6=(h6*80)/h6;
				 
				 w3 = fb.getIconWidth(); 
                 h3 = fb.getIconHeight(); 
				 w3=(w3*40)/w3;h3=(h3*40)/h3;
				 
				  w4 = goo.getIconWidth(); 
                 h4 = goo.getIconHeight(); 
				 w4=(w4*40)/w4;h4=(h4*40)/h4;
				
				 w2 = m.getIconWidth(); 
                 h2 = m.getIconHeight(); 
				w2=(w2*1400)/w2;h2=(h2*730)/h2;
				
			    Color c1 = new Color(115, 7, 108); 	
			    c5 = new Color(82, 209, 92); 	
				/*f=new framemain("e-mail login");
				f.setSize(200,200);*/
				Font f=new Font("Times New Roman",Font.BOLD,16);
		    	setFont(f);
		 	    //img=getImage(getDocumentBase(),"bulboff.jpg");
				t1=new TextField(16);  
				t1.setBounds(540,250,200,30);  
				t2=new TextField(8);  
				t2.setBounds(540,300,200,30); 
				b1=new Button("Reset");
				b1.setBounds(560,400,70,30); 
				b2=new Button("Login");
				b2.setBounds(660,400,80,30); 
			    b3=new Button("Light on");
				b3.setBounds(1020,510,80,30); 
				b4=new Button("Lightoff");
				b4.setBounds(1110,510,70,30);
				c2=new Checkbox("");
				c2.setBounds(1010,180,20,20);
				b1.setForeground(c1);
				b2.setForeground(c1);
				b3.setForeground(c1);
				b4.setForeground(c1);
				add(t1); add(t2); add(b1);add(b2);add(c2); add(b3); add(b4);  
				b1.addActionListener(this);
				b2.addActionListener(this);
				b3.addActionListener(this);
				b4.addActionListener(this);
				setLayout(null); 
				b3.setVisible(false);
				b4.setVisible(false);
				c2.setVisible(false);
			}
       /* public void start()
			{
				f.setVisible(true);
			}
	   public void stop()
			{
				f.setVisible(false);
			}*/
		public void actionPerformed(ActionEvent a)
		  {
		        	if (a.getSource()==b3)
					{
						ms="";
						img=getImage(getDocumentBase(),"bulbon.jpg"); 
					}
					if (a.getSource()==b4)
					{
						
						  ms="*Turn-on the Light*";	
						img=getImage(getDocumentBase(),"bulboff.jpg"); 
					}
	    	if(a.getSource()==b2)
			{    
			   int c=0;String s="",y="";
			      y=t1.getText();
			       for(int i=0;i<y.length()-1;i++)
					  {
					   if( y.charAt(i)=='@')
						  {
							 c++;
							 break;
						  } 
					  }
					  
				  if(t1.getText().equals(s))
				  {
					  msg="*Enter Username*";
				  }
				   else if(c==0)
				  {
					  msg="*Enter the valid Username*";
				  }
				 
				  else if(t2.getText().equals(s))
				  {
				   	  msg="*Enter Password*";
				  }
			     else if(a.getSource()==b2 && t2.getText()!=s&&c3==0)
				    {
						b3.setVisible(true);
				        b4.setVisible(true);
				        c2.setVisible(true);
						img=getImage(getDocumentBase(),"bulboff.jpg");
						msg="*Verify I'm not robot*";
					    ms="*Turn-on the Light*";	
						r="I am not a robot";
						c3++;
					}
				 else if(img==getImage(getDocumentBase(),"bulbon.jpg") && c2.getState()==true)
				 {
					 b3.setVisible(false);
				     b4.setVisible(false);
				     c2.setVisible(false); img=null;r="";
					 ms="";
					 msg="*Your Sign-in was successful*";
				 }
				  else
					{
						
					}
				
			}
			 if(a.getSource()==b1)
				{
					c3=0;
					t1.setText("");
					t2.setText("");
					c2.setState(false);
					msg="";
					ms="";
				    b3.setVisible(false);
				    b4.setVisible(false);
				    c2.setVisible(false); img=null;r="";
				} 
			
             repaint();
		}
		public void paint(Graphics g)
		{
			int x=540,y=360;
			g.drawImage(m.getImage(),0,0,w2,h2,this);
			g.setColor(c5);
			g.drawRect(2,170,210,280);
			g.drawRect(4,172,206,276);
			g.setColor(Color.white);
			g.drawString("Features",60,244);
			g.drawLine(40,250,140,250);
			g.setColor(Color.white);
			g.drawString("1) Number System Conversion",5,316);
			g.drawLine(2,320,210,320);
			g.drawString("2) Calculator",5,374);
			g.drawLine(2,380,210,380);
			
			//g.fillRect(970,150,280,420);
			g.setColor(Color.white);	
			g.drawString("Username:",460,270);
			g.drawString("Password:",460,320);
			g.drawString("Not a member?",530,470);
			g.setColor(Color.blue);	
			g.drawString("Forget passowrd?",x,y);
			g.drawString("Sign up using",640,470);
			g.drawLine(x , y+2 , x+getFontMetrics(getFont()).stringWidth("Forget passowrd?") , y+2 );
			g.drawLine(640 , 470+2 , 640+getFontMetrics(getFont()).stringWidth("Sign up using") , 470+2 );
			g.setColor(Color.white);
			g.drawString(r,1040,195);	
            g.drawImage(img,1040,230,this);
			g.setColor(Color.red);
			g.drawString(msg,590,240);
			g.setColor(Color.yellow);	
			g.drawString(ms,1040,490);
			g.drawImage(logo1.getImage(),620,490,w1,h1,this);
			g.drawImage(fb.getImage(),560,490,w3,h3,this);
			g.drawImage(goo.getImage(),680,490,w3,h3,this);
			g.drawImage(ph.getImage(),120,0,w5,h5,this);
			g.drawImage(pho.getImage(),0,0,w6,h6,this);
		}
	}
