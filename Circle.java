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

public class Circle 
{
	//Բ�����꼰�뾶
	//double x, y, r;
	
	//�ж�
	boolean op = false;
	
	public Circle()
	{
		a_circle();
	}
	
	public void a_circle() {
		JFrame circle = new JFrame("CircleGHR");
		circle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		circle.setSize(400, 120);
		
		
		Container container = circle.getContentPane();
		container.setLayout(new GridLayout(2, 2));
		
		JPanel [] p = new JPanel[2];
		for(int i = 0; i < 2; i++)
		{
			p[i]=new JPanel();
		}
		
		JLabel R = new JLabel("�뾶��");
		
		JTextField _r = new JTextField(10);
		
		p[0].add(R);
		p[0].add(_r);
				
		JButton button = new JButton("ȷ��");
		container.add(button);
		p[1].add(button);
		
		container.add(p[0]);
		container.add(p[1]);
		
		circle.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r = Integer.parseInt(_r.getText());
				
				isCircle(r);
				double area = getArea(r);
				double perimeter = getPerimeter(r);
				
				JOptionPane.showMessageDialog(button, "�����" + area + '��' + "�߳���" + perimeter);
			}
		});
	}
	
	void isCircle(int r)
	{
		if(r > 0)
		{
			op = true;
		}
		if(op == true)
		{
			//System.out.println("����Բ��Բ������(" + x + "," + y + ")," + "�뾶" + r + "��");
		}
		else
		{
			System.out.println("������Ч���޷�����Բ��");
		}
	}
	
	double getArea(int r)
	{
		if(op == true)
		{
			double s = Math.PI * r * r;
			System.out.println("Բ�������" + s + "��");
			return s;
		}
		else
		{
			System.out.println("������Ч���޷����������");
			return -1;
		}
	}
	
	double getPerimeter(int r)
	{
		if(op == true)
		{
			double l = 2 * Math.PI * r;
			System.out.println("Բ���ܳ���" + l + "��");
			return l;
		}
		else
		{
			System.out.println("������Ч���޷������ܳ���");
			return -1;
		}
	}
}