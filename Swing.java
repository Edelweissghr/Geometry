package Geometry;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Swing extends JFrame{
	
	public Swing()
	{
		a();
//		this.setTitle("GeometryGHR");
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setBounds(100,100,250,100);
//		JPanel contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5,5,5,5));
//        this.setContentPane(contentPane);  
//        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));  
//        JLabel label=new JLabel("��״:");  
//        contentPane.add(label);  
//        @SuppressWarnings("rawtypes")
//		JComboBox comboBox=new JComboBox();  
//        comboBox.addItem("������");  
//        comboBox.addItem("������");  
//        comboBox.addItem("�������");  
//        contentPane.add(comboBox);  
//        this.setVisible(true);
	}
	
	public void a()
	{
		JFrame geometry = new JFrame("GeometryGHR");
		geometry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		geometry.setSize(400, 100);
		
		
		Container c = geometry.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		
		JLabel prompt = new JLabel("��ѡ����״��");
		c.add(prompt);
		
		String [] op = {"������", "������", "�������", "Բ", "Բ��", "Բ׶", "��"};
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox comboBox = new JComboBox(op);
		c.add(comboBox);
		
		geometry.setVisible(true);
		
		JButton button = new JButton("ȷ��");
		c.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = comboBox.getSelectedIndex();
				//JOptionPane.showMessageDialog(button, result);
				switch(result)
				{
				case 0:
					@SuppressWarnings("unused") Triangle _triangle = new Triangle(); break;
				case 1:
					@SuppressWarnings("unused") Square _square = new Square(); break;
				case 2:
					@SuppressWarnings("unused") Pentagon _pentagon = new Pentagon(); break;
				case 3:
					@SuppressWarnings("unused") Circle _circle = new Circle(); break;
				case 4:
					@SuppressWarnings("unused") Cylinder _cylinder = new Cylinder(); break;
				case 5:
					@SuppressWarnings("unused") Cone _cone = new Cone(); break;
				case 6:
					@SuppressWarnings("unused") Sphere _sphere = new Sphere();
				}
			}

		});
	}
	
	
	
	
	
	public static void main(String args[])
	{
//		JFrame geometry = new JFrame("GeometryGHR");
//		geometry.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		geometry.setSize(720, 480);
//		Container c = geometry.getContentPane();
//		c.setLayout(new FlowLayout());
//		JTextField [] t = {
//				new JTextField("�����ı���", 60), 
//				new JTextField("��ʾ", 60)
//		};
//		t[0].setEditable(false);
//		for(int i = 0; i < 2; i++)
//		{
//			geometry.add(t[i]);
//		}
//		geometry.setVisible(true);
		Swing example = new Swing();
	}
}
