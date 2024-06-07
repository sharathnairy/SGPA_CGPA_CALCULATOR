package tenet;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class frame extends JFrame implements ActionListener {
	JButton jb,jb1;
	frame()
	{
		

	 	JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
        panel.setBackground(Color.cyan);
        
        jb = new JButton();
        jb.setText("CGPA");
        jb.setHorizontalTextPosition(JButton.CENTER);
        jb.setVerticalTextPosition(JButton.BOTTOM);
        jb.setFocusable(false);
        jb.setPreferredSize(new Dimension(250, 100));
        jb.setBackground(Color.ORANGE);
        jb.setBorder(BorderFactory.createEtchedBorder());
        jb.setFont(new Font("Arial", Font.PLAIN, 30));
        jb.addActionListener(this);
        jb1 = new JButton();
        jb1.setText("SGPA");
        jb1.setHorizontalTextPosition(JButton.CENTER);
        jb1.setVerticalTextPosition(JButton.BOTTOM);
        jb1.setFocusable(false);
        jb1.setPreferredSize(new Dimension(250, 100));
        jb1.setBackground(Color.orange);
        jb1.setBorder(BorderFactory.createEtchedBorder());
        jb1.setFont(new Font("Arial", Font.PLAIN, 30));
        jb1.addActionListener(this);
        panel.add(jb);
        panel.add(jb1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.orange);
        this.setTitle("WELCOME TO CGPA AND SGPA CALCULATOR"); 
        this.setResizable(false);
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.add(panel);
        this.setVisible(true);
        this.setLayout(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if (e.getSource() == jb) {
		       cgpa c=new cgpa();
		    } else if (e.getSource() == jb1) {
		       sgpa s=new sgpa();
		    }
	}

	
		
	}


