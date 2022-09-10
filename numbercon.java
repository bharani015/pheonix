import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*; 
/*<applet code="numbercon.class" Width="400" Height="700">
</applet>*/
public class numbercon extends Applet implements ItemListener,ActionListener  
{
	String s="",s1,s2;
	TextField t ,t2;int i1,i2;
	CheckboxGroup c1,c9;Checkbox c,c2,c3,c4,c5,c6,c7,c8;
	Button b1,del,can;
	public void init()
	{
		Font f=new Font("TimeNewRoman",Font.BOLD,20);
		setFont(f);
		setBackground(Color.blue);
		setLayout(new GridLayout(7,2)); 
		add(new Label("ENTER NUMBER"));
		t=new TextField (15);
		c=new Checkbox("DECIMAL",false);
		c2=new Checkbox("BINARY" ,false);
		c3=new Checkbox("OCTAL" ,false);
		c4=new Checkbox("HEXADECIMAL" ,false);
		 
		c5=new Checkbox("DECIMAL" ,false);
		c6=new Checkbox("BINARY" ,false);
		c7=new Checkbox("OCTAL",false);
		c8=new Checkbox("HEXADECIMAL" ,false);
		b1=new Button("PRE");
		
		del=new Button("DEL");
		can=new Button("CLEAR");
		t2=new TextField (15);
		add(t);
		add(c);
		add(c5);
		add(c2);
		add(c6);
		add(c3);
		add(c7);
		add(c4);
		add(c8);
		add(can);
		add(del);
		add(b1);
		add(t2);
		t.addActionListener(this);
		c.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		c5.addItemListener(this);
		c6.addItemListener(this);
		c7.addItemListener(this);
		c8.addItemListener(this);
		b1.addActionListener(this);
		del.addActionListener(this);
		can.addActionListener(this);
	}
	public void actionPerformed(ActionEvent a)
	{ 
	if (a.getSource()==b1)
	{
		t2.setText(s1);
	}
	
	
	if(a.getSource()==del)
		{
			s=t.getText();
			t.setText("");
			for(int i=0;i<s.length()-1;i++)
			t.setText(t.getText()+s.charAt(i));
		}	
		
	 if(a.getSource()==can)
		{
			t.setText("");
			t2.setText("");
			c.setState(false);
			c2.setState(false);
			c3.setState(false);
			c4.setState(false);
			c5.setState(false);
			c6.setState(false);
			c7.setState(false);
			c8.setState(false);
		}
		repaint();
	}
    public void itemStateChanged(ItemEvent e) 
     {
		 s1=t.getText();
		 c2.repaint(); 
	     if( c.getState()==true&&c6.getState()==true)
		{
			 i1=Integer.parseInt(t.getText());
			 t.setText(" "+Integer.toBinaryString(i1));
			 setBackground(Color.red);
		}
		 if( c.getState()==true&&c7.getState()==true)
		{
			 i1=Integer.parseInt(t.getText());
			  t.setText(" "+Integer.toOctalString(i1));
		}
		 if( c.getState()==true&&c8.getState()==true)
		{
			 i1=Integer.parseInt(t.getText());
			t.setText(" "+Integer.toHexString(i1));
		}
		 if( c2.getState()==true&&c5.getState()==true)
		{
			String binaryString=t.getText();  

			 t.setText(" "+ Integer.parseInt(binaryString,2));
		}
		 if( c2.getState()==true&&c7.getState()==true)
		{
			i1=Integer.parseInt(t.getText());
			
			 t.setText(" "+ Integer.toOctalString(i1));
		}
		if( c2.getState()==true&&c8.getState()==true)
		{
			i1=Integer.parseInt(t.getText());
			
			 t.setText(" "+ Integer.toHexString(i1));
		}
		if( c3.getState()==true&&c5.getState()==true)
		{
			String binaryString=t.getText();
			
			 t.setText(" "+ Integer.parseInt( binaryString,8));
		}
		if( c3.getState()==true&&c6.getState()==true)
		{
			 i1=Integer.parseInt(t.getText());
			
			 t.setText(" "+  Integer.toBinaryString(i1));
		}
		if( c3.getState()==true&&c8.getState()==true)
		{
			String binaryString=t.getText();
			
			  i2= Integer.parseInt(binaryString, 8);
			  t.setText(" "+ Integer.toHexString(i2));
		}
		if( c4.getState()==true&&c5.getState()==true)
		{
			String binaryString=t.getText();
			  t.setText(" "+ Integer.parseInt( binaryString,16));
		}
		if( c4.getState()==true&&c6.getState()==true)
		{
			String binaryString=t.getText();
			 i1=Integer.parseInt(binaryString,16);
			  t.setText(" "+ Integer.toBinaryString(i1));
		}
		if( c4.getState()==true&&c7.getState()==true)
		{
			String binaryString=t.getText();
			 i1=Integer.parseInt(binaryString,16);
			  t.setText(" "+ Integer.toOctalString(i1));
		}
     }
	 
}