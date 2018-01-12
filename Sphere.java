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

public class Sphere 
{
	//�뾶
	//double r;
	
	//�ж�
	boolean op = false;
	
	public Sphere()
	{
		a_sphere();
	}
	
	public void a_sphere() {
		JFrame sphere = new JFrame("SphereGHR");
		sphere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sphere.setSize(400, 120);
		
		
		Container container = sphere.getContentPane();
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
		
		sphere.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r = Integer.parseInt(_r.getText());
				
				isSphere(r);
				double surfaceArea = getSurfaceArea(r);
				double volume = getVolume(r);
				
				JOptionPane.showMessageDialog(button, "�������" + surfaceArea + '��' + "�����" + volume);
			}
		});
	}
	
	void isSphere(int r)
	{
		if(r > 0)
		{
			op = true;
		}
		if(op == true)
		{
			System.out.println("�������壬�뾶" + r + "��");
		}
		else
		{
			System.out.println("������Ч���޷��������塣");
		}
	}
	
	double getSurfaceArea(int r)
	{
		if(op == true)
		{
			double s = 4 * Math.PI * r * r;
			System.out.println("����ı������" + s + "��");
			return s;
		}
		else
		{
			System.out.println("������Ч���޷�����������");
			return -1;
		}
	}
	
	double getVolume(int r)
	{
		if(op == true)
		{
			double v = 4 / 3.0 * Math.PI * r * r * r;
			System.out.println("����������" + v + "��");
			return v;
		}
		else
		{
			System.out.println("������Ч���޷����������");
			return -1;
		}
	}
}