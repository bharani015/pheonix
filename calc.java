import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 
/* 
<applet code="calc" width=300 height=300>
</applet>
*/
 
public class calc extends Applet implements ActionListener
{
	String msg=" ";
	int v1,v2,result,choice;
	TextField t1;
	Button b[]=new Button[10];
	Button add,sub,mul,div,clear,mod,EQ,del;
	char OP;
	public void init()
	{
		Color k=new Color(120,89,90);
		setBackground(k);
		t1=new TextField(10);
		GridLayout gl=new GridLayout(4,5);
		setLayout(gl);
		for(int i=0;i<10;i++)
		{
			b[i]=new Button(""+i);
		}
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		mod=new Button("%");
		clear=new Button("clear");
		EQ=new Button("=");
		del=new Button("Del");
		t1.addActionListener(this);
		add(t1);
		for(int i=0;i<10;i++)
		{
			add(b[i]);
		}
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		add(del);
		for(int i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
		del.addActionListener(this);
	}
 
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b[0])
		t1.setText(t1.getText()+"0");
		if(ae.getSource()==b[1])
		t1.setText(t1.getText()+"1");
		if(ae.getSource()==b[2])
		t1.setText(t1.getText()+"2");
		if(ae.getSource()==b[3])
		t1.setText(t1.getText()+"3");
		if(ae.getSource()==b[4])
		t1.setText(t1.getText()+"4");
		if(ae.getSource()==b[5])
		t1.setText(t1.getText()+"5");
		if(ae.getSource()==b[6])
		t1.setText(t1.getText()+"6");
		if(ae.getSource()==b[7])
		t1.setText(t1.getText()+"7");
		if(ae.getSource()==b[8])
		t1.setText(t1.getText()+"8");
		if(ae.getSource()==b[9])
		t1.setText(t1.getText()+"9");	
		if(ae.getSource()==add)
		{
			v1=Integer.parseInt(t1.getText());
			choice=1;
			t1.setText("");
		}
		if(ae.getSource()==sub)
		{
			v1=Integer.parseInt(t1.getText());
			choice=2;
			t1.setText("");
		}
		if(ae.getSource()==mul)
		{
			v1=Integer.parseInt(t1.getText());
			choice=3;
			t1.setText("");
		}
		if(ae.getSource()==div)
		{
			v1=Integer.parseInt(t1.getText());
			choice=4;
			t1.setText("");
		}
		if(ae.getSource()==mod)
		{
			v1=Integer.parseInt(t1.getText());
			choice=5;
			t1.setText("");
		}	
		if(ae.getSource()==EQ)
		{
			v2=Integer.parseInt(t1.getText());
			switch(choice)
			{
				case 1:result=v1+v2;break;
				case 2:result=v1-v2;break;
				case 3:result=v1*v2;break;
				case 4:result=v1/v2;break;
				case 5:result=v1%v2;break;
			}
			int i=result;
			t1.setText( ""+i);
		}
		if(ae.getSource()==clear)
		{
			t1.setText("");
		}
		if(ae.getSource()==del)
		{
			String s=t1.getText();
			t1.setText("");
			for(int i=0;i<s.length()-1;i++)
			t1.setText(t1.getText()+s.charAt(i));
		}				
	}
}		
		