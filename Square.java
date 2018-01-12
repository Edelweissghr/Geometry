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

public class Square 
{
	//�߳�
	//double a;
	
	//�ж�
	boolean op = false;
	
	public Square()
	{
		a_square();
	}
	
	public void a_square() {
		JFrame square = new JFrame("SquareGHR");
		square.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		square.setSize(400, 120);
		
		
		Container container = square.getContentPane();
		container.setLayout(new GridLayout(2, 2));
		
		JPanel [] p = new JPanel[2];
		for(int i = 0; i < 2; i++)
		{
			p[i]=new JPanel();
		}
		
		JLabel A = new JLabel("�߳���");
		
		JTextField _a = new JTextField(10);
		
		p[0].add(A);
		p[0].add(_a);
				
		JButton button = new JButton("ȷ��");
		container.add(button);
		p[1].add(button);
		
		container.add(p[0]);
		container.add(p[1]);
		
		square.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(_a.getText());
				
				isSquare(a);
				double area = getArea(a);
				double perimeter = getPerimeter(a);
				
				JOptionPane.showMessageDialog(button, "�����" + area + '��' + "�߳���" + perimeter);
			}
		});
	}
	
	void isSquare(int a)
	{
		if(a > 0)
		{
			op = true;
		}
		if(op == true)
		{
			System.out.println("���������Σ��߳�Ϊ" + a + "��");
		}
		else
		{
			System.out.println("������Ч���޷����������Ρ�");
		}
	}
	
	double getArea(int a)
	{
		if(op == true)
		{
			double s = a * a;
			System.out.println("�����ε������" + s + "��");
			return s;
		}
		else
		{
			System.out.println("������Ч���޷����������");
			return -1;
		}
	}
	
	double getPerimeter(int a)
	{
		if(op == true)
		{
			double l = 4 * a;
			System.out.println("�����ε��ܳ���" + l + "��");
			return l;
		}
		else
		{
			System.out.println("������Ч���޷������ܳ���");
			return -1;
		}
	}
}