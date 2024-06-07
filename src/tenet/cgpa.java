package tenet;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class cgpa extends JFrame implements ActionListener{
	 JButton jb,jb1;
		ArrayList<Double> sgpa = new ArrayList<>();
		ArrayList<Integer> credits = new ArrayList<>();
		 JTextField[] sgpaField = new JTextField[10];
		 JTextField[] creditField = new JTextField[10];
		 JTextField res;
		 DecimalFormat d=new DecimalFormat("0.00");
	cgpa()
	{

	     this.setTitle("WELCOME TO CGPA CALCULATOR");
	     this.setLayout(null);
	     this.setSize(600,600);
	     this.setResizable(false);
	     this.setLocationRelativeTo(null);
	     JPanel panel3 = new JPanel();
	     panel3.setBounds(35,0,520,30);
	     panel3.setBackground(Color.cyan);
	     JLabel label3 = new JLabel("                       SGPA       ");
	     JLabel label4 = new JLabel("                            CREDITS");
	    
	     panel3.add(label3);
	     panel3.add(label4);
	     JPanel panel = new JPanel(new GridLayout(10, 2,10,10));
	     panel.setBackground(Color.cyan);
	     String[] subjects = {"Semester 1:", "Semester 2:", "Semester 3", "Semester 4:", "Semester 5:", "Semester 6:", "Semester 7:", "Semester 8:", "Semester 9:", "Semester 10:"};
	     for (int i=0;i<sgpaField.length;i++) {
	         JLabel label = new JLabel(subjects[i]);
	         sgpaField[i] = new JTextField();
	         sgpaField[i].setToolTipText("sgpa");
	         creditField[i] = new JTextField();
	         creditField[i].setToolTipText("credit");
	         panel.add(label);
	         panel.add(sgpaField[i]);
	         panel.add(creditField[i]);
	     }
	     
	     
	     panel.setBounds(35,30,520,400);
	     JPanel panel1 = new JPanel();
	     panel1.setBackground(Color.cyan);
	     panel1.setBounds(35,430,520,55);
	      jb = new JButton("CALCULATE");
	     jb.setHorizontalAlignment(JButton.CENTER);
	     jb.setVerticalTextPosition(JButton.BOTTOM);
	     jb.setFocusable(false);
	     jb.setBorder(BorderFactory.createEtchedBorder());
	     jb.setPreferredSize(new Dimension(150, 50));
	     jb.addActionListener(this);
	     jb1 = new JButton("CLEAR");
	     jb1.setHorizontalAlignment(JButton.CENTER);
	     jb1.setVerticalTextPosition(JButton.BOTTOM);
	     jb1.setFocusable(false);
	     jb1.setBorder(BorderFactory.createEtchedBorder());
	     jb1.setPreferredSize(new Dimension(150, 50));
	     jb1.addActionListener(this);
	     panel1.add(jb);
	     panel1.add(jb1);
	     JPanel panel2 = new JPanel();
	     panel2.setBackground(Color.cyan);
	     panel2.setBounds(35,485,520,50);
	     JLabel label = new JLabel("CGPA :");
	    res = new JTextField();
	     res.setPreferredSize(new Dimension(200, 40));
	     panel2.add(label);
	     panel2.add(res);
	     this.getContentPane().setBackground(Color.lightGray);
	     this.add(panel3);
	     this.add(panel);
	     this.add(panel1);
	     this.add(panel2);
	     
	     this.setVisible(true);
	 }
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jb)
		{ for (int i=0;i<sgpaField.length;i++) {
			if (!sgpaField[i].getText().equals("")) {
			sgpa.add(Double.parseDouble(sgpaField[i].getText()));
			
			}
			if (!creditField[i].getText().equals("")) {
			credits.add(Integer.parseInt(creditField[i].getText()));	
		}
			}
		
		cgpa_calculator sg=new cgpa_calculator();

		double cgpa1=sg.cgpa(sgpa,credits);
		if(cgpa1!=-1) {
		res.setText((""+d.format(cgpa1)));
		}
		else {
			res.setText("Invalid Input.........!");
		}
	}
		else if(e.getSource()==jb1)
		{
			sgpa.clear();
			credits.clear();
			for (int i=0;i<sgpaField.length;i++)
			{
				creditField[i].setText("");
				sgpaField[i].setText("");
				res.setText("");
				
			}
		}
	}
    }
