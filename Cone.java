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

public class Cone 
{
	//高和半径
	//double h, r;
	
	//判断
	boolean op = false;
	
	public Cone()
	{
		a_cone();
	}
	
	public void a_cone() {
		JFrame cone = new JFrame("ConeGHR");
		cone.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cone.setSize(400, 180);
		
		
		Container container = cone.getContentPane();
		container.setLayout(new GridLayout(3, 2));
		
		JPanel [] p = new JPanel[3];
		for(int i = 0; i < 3; i++)
			p[i]=new JPanel();
		
		JLabel H = new JLabel("高度：");
		JLabel R = new JLabel("半径：");
		
		JTextField _h = new JTextField(10);
		JTextField _r = new JTextField(10);
		
		p[0].add(H);
		p[0].add(_h);
		p[1].add(R);
		p[1].add(_r);
				
		JButton button = new JButton("确定");
		container.add(button);
		p[2].add(button);
		
		container.add(p[0]);
		container.add(p[1]);
		container.add(p[2]);
		
		cone.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int h = Integer.parseInt(_h.getText());
				int r = Integer.parseInt(_r.getText());
				
				isCone(h, r);
				double surfaceArea = getSurfaceArea(h, r);
				double volume = getVolume(h, r);
				
				JOptionPane.showMessageDialog(button, "表面积是" + surfaceArea + '，' + "体积是" + volume);
			}
		});
	}
	
	void isCone(int h, int r)
	{
		if(r > 0 && h > 0)
		{
			op = true;
		}
		if(op == true)
		{
			System.out.println("构造圆锥，高" + h + "," + "半径" + r + "。");
		}
		else
		{
			System.out.println("传参无效，无法构成圆锥。");
		}
	}
	
	double getSurfaceArea(int h, int r)
	{
		if(op == true)
		{
			double s = Math.PI * r * r + Math.PI * r * Math.sqrt(h * h + r * r);
			System.out.println("圆锥的表面积是" + s + "。");
			return s;
		}
		else
		{
			System.out.println("传参无效，无法计算表面积。");
			return -1;
		}
	}
	
	double getVolume(int h, int r)
	{
		if(op == true)
		{
			double v = 1 / 3.0 * Math.PI * r * r * h;
			System.out.println("圆锥的体积是" + v + "。");
			return v;
		}
		else
		{
			System.out.println("传参无效，无法计算体积。");
			return -1;
		}
	}
}