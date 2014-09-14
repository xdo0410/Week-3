import java.awt.FlowLayout;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator_ui implements ActionListener {

	JFrame frame = new JFrame("Calculator");
	JPanel panel = new JPanel(new FlowLayout());
	
	JTextArea text = new JTextArea(1,20);
	JButton but1 = new JButton("1");
	JButton but2 = new JButton("2");
	JButton but3 = new JButton("3");
	JButton but4 = new JButton("4");
	JButton but5 = new JButton("5");
	JButton but6 = new JButton("6");
	JButton but7 = new JButton("7");
	JButton but8 = new JButton("8");
	JButton but9 = new JButton("9");
	JButton but0 = new JButton("0");
	
	JButton but_add = new JButton("+");
	JButton but_sub = new JButton("-");
	JButton but_multi = new JButton("*");
	JButton but_div = new JButton("/");
	JButton but_equ = new JButton("=");
	
	JButton but_clear = new JButton("C");
	
	Double number1,number2,result;
	int addc=0,subc=0,multic=0,divc=0;
	
	public void ui()
	{
		
		frame.setVisible(true);
		frame.setSize(240,185);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(panel);
		panel.add(text);
		
		panel.add(but1);
		panel.add(but2);
		panel.add(but3);
		panel.add(but4);
		panel.add(but5);
		panel.add(but6);
		panel.add(but7);
		panel.add(but8);
		panel.add(but9);
		panel.add(but0);
		
		panel.add(but_add);
		panel.add(but_sub);
		panel.add(but_multi);
		panel.add(but_div);
		panel.add(but_equ);
		panel.add(but_clear);
		
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		but6.addActionListener(this);
		but7.addActionListener(this);
		but8.addActionListener(this);
		but9.addActionListener(this);
		but0.addActionListener(this);
		but_add.addActionListener(this);
		but_sub.addActionListener(this);
		but_multi.addActionListener(this);
		but_div.addActionListener(this);
		but_equ.addActionListener(this);
		but_clear.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object source = e.getSource();
		
		if(source==but_clear)
		{
			number1=0.0;
			number2=0.0;
			text.setText("");
		}
		
		
		if(source==but1)
		{
			text.append("1");
		}
		
		if(source==but2)
		{
			text.append("2");
		}
		
		if(source==but3)
		{
			text.append("3");
		}
		
		if(source==but4)
		{
			text.append("4");
		}
		
		if(source==but5)
		{
			text.append("5");
		}
		
		if(source==but6)
		{
			text.append("6");
		}
		
		if(source==but7)
		{
			text.append("7");
		}
		
		if(source==but8)
		{
			text.append("8");
		}
		
		if(source==but9)
		{
			text.append("9");
		}
		
		if(source==but0)
		{
			text.append("0");
		}
		
		if(source==but_add)
		{
			number1=number_reader();
			text.setText("");
			addc=1;
			subc=0;
			multic=0;
			divc=0;
		}
		
		if(source==but_sub)
		{
			number1=number_reader();
			text.setText("");
			addc=0;
			subc=1;
			multic=0;
			divc=0;
		}
		
		if(source==but_multi)
		{
			number1=number_reader();
			text.setText("");
			addc=0;
			subc=0;
			multic=1;
			divc=0;
		}
		
		if(source==but_div)
		{
			number1=number_reader();
			text.setText("");
			addc=0;
			subc=0;
			multic=0;
			divc=1;
		}
		
		if(source==but_equ)
		{
			number2=number_reader();
			if(addc>0)
			{
				result=number1+number2;
				text.setText(Double.toString(result));
			}
		
			if(subc>0)
			{
				result=number1-number2;
				text.setText(Double.toString(result));
			}
	
			if(multic>0)
			{
				result=number1*number2;
				text.setText(Double.toString(result));
			}
	
			if(divc>0)
			{
				result=number1/number2;
				text.setText(Double.toString(result));
			}
		}
	}
	
	public double number_reader()
	{
		
		Double num1;
		String s;
		s=text.getText();
		num1=Double.valueOf(s);
		
		return num1;
		
	}
	
}
