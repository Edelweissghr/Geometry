package Geometry;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Triangle 
{
	//三角形顶点坐标
	//public double x1, y1, x2, y2, x3, y3;
	
	//三角形三边长
	//double a, b, c;
	
	//判断是否可以构成图形
	boolean op = false;
	
	public Triangle()
	{
		a_triangle();
		/*
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		
		//两点距离公式
		this.a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		this.b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		this.c = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
		*/
	}
	
	public void a_triangle() {
		JFrame triangle = new JFrame("TriangleGHR");
		triangle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		triangle.setSize(400, 180);
		
		
		Container container = triangle.getContentPane();
		container.setLayout(new GridLayout(4, 4));
		
		JPanel [] p = new JPanel[4];
		for(int i = 0; i < 4; i++)
			p[i]=new JPanel();
		
		JLabel X1 = new JLabel("X1：");
		JLabel Y1 = new JLabel("Y1：");
		JLabel X2 = new JLabel("X2：");
		JLabel Y2 = new JLabel("Y2：");
		JLabel X3 = new JLabel("X3：");
		JLabel Y3 = new JLabel("Y3：");
		
		JTextField _x1 = new JTextField(10);
		JTextField _y1 = new JTextField(10);
		JTextField _x2 = new JTextField(10);
		JTextField _y2 = new JTextField(10);
		JTextField _x3 = new JTextField(10);
		JTextField _y3 = new JTextField(10);
		
		p[0].add(X1);
		p[0].add(_x1);
		p[0].add(Y1);
		p[0].add(_y1);
		p[1].add(X2);
		p[1].add(_x2);
		p[1].add(Y2);
		p[1].add(_y2);
		p[2].add(X3);
		p[2].add(_x3);
		p[2].add(Y3);
		p[2].add(_y3);
				
		JButton button = new JButton("确定");
		container.add(button);
		p[3].add(button);
		
		container.add(p[0]);
		container.add(p[1]);
		container.add(p[2]);
		container.add(p[3]);
		
		triangle.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x1 = Integer.parseInt(_x1.getText());
				int x2 = Integer.parseInt(_x2.getText());
				int x3 = Integer.parseInt(_x3.getText());
				int y1 = Integer.parseInt(_y1.getText());
				int y2 = Integer.parseInt(_y2.getText());
				int y3 = Integer.parseInt(_y3.getText());
				
				double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
				double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
				double c = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
				
				isTriangle(a, b, c);
				double area = getArea(a, b, c);
				double perimeter = getPerimeter(a, b, c);
				
				JOptionPane.showMessageDialog(button, "面积是" + area + '，' + "边长是" + perimeter);
			}
		});
	}
	
	
	void isTriangle(double a, double b, double c)
	{
		if(a > 0 && b > 0 && c > 0)
		{
			if((a + b) > c && (a + c) > b && (b + c) > a)
			{
				//三遍均为正，且两边之和大于第三边同时成立
				op = true;
			}
		}
		if(op == true)
		{
			
			//System.out.println("构造△ABC，A(" + x1 + "," + y1 + ")," + "B(" + x2 + "," + y2 + ")," + "C(" + x3 + "," + y3 + ")。");
			System.out.println("则三边长分别为a=" + a + ",b=" + b + ",c=" + c + "。");
		}
		else
		{
			System.out.println("传参无效，无法构成△。");
		}
	}
	
	
	double getArea(double a, double b, double c)
	{
		if(op == true)
		{
			//海伦公式计算面积
			double p = (a + b + c) / 2.0;
			double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			System.out.println("△ABC的面积是" + s + "。");
			return s;
		}
		else
		{
			System.out.println("传参无效，无法计算面积。");
			return -1;
		}
	}
	
	double getPerimeter(double a, double b, double c)
	{
		if(op == true)
		{
			double l = a + b + c;
			System.out.println("△ABC的周长是" + l + "。");
			return l;
		}
		else
		{
			System.out.println("传参无效，无法计算周长。");
			return -1;
		}
	}
}
