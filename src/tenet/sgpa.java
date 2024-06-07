package tenet;

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

public class sgpa extends JFrame implements ActionListener {
	 JButton jb,jb1;
	ArrayList<Integer> marks = new ArrayList<>();
	ArrayList<Integer> credits = new ArrayList<>();
	 JTextField[] markField = new JTextField[10];
	 JTextField[] creditField = new JTextField[10];
	 JTextField res;
	 DecimalFormat d=new DecimalFormat("0.00");
sgpa()
{
     this.setTitle("WELCOME TO SGPA CALCULATOR");
     this.setLayout(null);
     this.setSize(600,600);
     this.setResizable(false);
     this.setLocationRelativeTo(null);
     JPanel panel3 = new JPanel();
     panel3.setBounds(35,0,520,30);
     panel3.setBackground(Color.cyan);
     JLabel label3 = new JLabel("                       MARKS       ");
     JLabel label4 = new JLabel("                            CREDITS");
    
     panel3.add(label3);
     panel3.add(label4);
     JPanel panel = new JPanel(new GridLayout(10, 2,10,10));
     panel.setBackground(Color.cyan);
     String[] subjects = {"Subject 1:", "Subject 2:", "Subject 3", "Subject 4:", "Subject 5:", "Subject 6:", "Subject 7:", "Subject 8:", "Subject 9:", "Subject 10:"};
     for (int i=0;i<markField.length;i++) {
         JLabel label = new JLabel(subjects[i]);
         markField[i] = new JTextField();
         markField[i].setToolTipText("mark");
         creditField[i] = new JTextField();
         creditField[i].setToolTipText("credit");
         panel.add(label);
         panel.add(markField[i]);
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
     JLabel label = new JLabel("SGPA :");
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
	{ for (int i=0;i<markField.length;i++) {
		if (!markField[i].getText().equals("")) {
		marks.add(Integer.parseInt(markField[i].getText()));
		
		}
		if (!creditField[i].getText().equals("")) {
		credits.add(Integer.parseInt(creditField[i].getText()));	
	}
		}
	
	sgpa_calculator sg=new sgpa_calculator();

	double sgpa1=sg.sgpa(marks,credits);
	if(sgpa1!=-1) {
	res.setText((""+d.format(sgpa1)));
	}
	else {
		res.setText("Invalid Input.........!");
	}
}
	else if(e.getSource()==jb1)
	{
		marks.clear();
		credits.clear();
		for (int i=0;i<markField.length;i++)
		{
			creditField[i].setText("");
			markField[i].setText("");
			res.setText("");
			
		}
	}
}
}
