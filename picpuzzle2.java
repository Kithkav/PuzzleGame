import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class picpuzzle2 extends JFrame implements ActionListener{
	JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,samplePic;
	Icon star;
	Icon ic0=new ImageIcon("images/starB0.jpg");
	Icon ic10=new ImageIcon("images/starB10.jpg");
	Icon ic20=new ImageIcon("images/starB20.jpg");
	Icon samicon1=new ImageIcon("images/m1.jpg");
	Icon samicon2=new ImageIcon("images/m2.jpg");
	Icon samicon3=new ImageIcon("images/m3.jpg");
	
	Icon ic1=new ImageIcon("images/1.jpg");
	Icon ic2=new ImageIcon("images/5.jpg");
	Icon ic3=new ImageIcon("images/2.jpg");
	Icon ic4=new ImageIcon("images/7.jpg");
	Icon ic5=new ImageIcon("images/4.jpg");
	Icon ic6=new ImageIcon("images/6.jpg");
	Icon ic7=new ImageIcon("images/8.jpg");
	Icon ic8=new ImageIcon("images/9.jpg");
	Icon ic9=new ImageIcon("images/3.jpg");
	
	Icon ic11=new ImageIcon("images/12.jpg");
	Icon ic12=new ImageIcon("images/13.jpg");
	Icon ic13=new ImageIcon("images/16.jpg");
	Icon ic14=new ImageIcon("images/11.jpg");
	Icon ic15=new ImageIcon("images/14.jpg");
	Icon ic16=new ImageIcon("images/19.jpg");
	Icon ic17=new ImageIcon("images/17.jpg");
	Icon ic18=new ImageIcon("images/15.jpg");
	Icon ic19=new ImageIcon("images/18.jpg");
	
	Icon ic21=new ImageIcon("images/24.jpg");
	Icon ic22=new ImageIcon("images/25.jpg");
	Icon ic23=new ImageIcon("images/21.jpg");
	Icon ic24=new ImageIcon("images/27.jpg");
	Icon ic25=new ImageIcon("images/23.jpg");
	Icon ic26=new ImageIcon("images/29.jpg");
	Icon ic27=new ImageIcon("images/28.jpg");
	Icon ic28=new ImageIcon("images/22.jpg");
	Icon ic29=new ImageIcon("images/26.jpg");

picpuzzle2(){

	super("picture puzzle");
	
	bt1=new JButton(ic1);
	bt1.setBounds(10,80,100,100);
	bt2=new JButton(ic2);
	bt2.setBounds(110,80,100,100);
	bt3=new JButton(ic3);
	bt3.setBounds(210,80,100,100);
	bt4=new JButton(ic4);
	bt4.setBounds(10,180,100,100);
	bt5=new JButton(ic5);
	bt5.setBounds(110,180,100,100);
	bt6=new JButton(ic6);
	bt6.setBounds(210,180,100,100);
	bt7=new JButton(ic7);
	bt7.setBounds(10,280,100,100);
	bt8=new JButton(ic8);
	bt8.setBounds(110,280,100,100);
	bt9=new JButton(ic9);
	bt9.setBounds(210,280,100,100);
	samplePic=new JButton(samicon1);
	samplePic.setBounds(380,100,200,200);
	
	JLabel l1=new JLabel("Sample:");
	l1.setBounds(330,200,70,20);
	JLabel l2=new JLabel(" ");
	l2.setBounds(5,15,500,20);
	JLabel l3=new JLabel("click sample picture to next puzzle");
	l3.setBounds(380,320,200,20);
	l3.setForeground(Color.blue);
	
	setBounds(330,5,50,50);
	star=bt9.getIcon();
	
	add(bt1);add(bt2);
	add(bt3);add(bt4);
	add(bt5);add(bt6);
	add(bt7);add(bt8);
	add(bt9);add(samplePic);
	add(l1);add(l2);
	add(l3);
	
	bt1.addActionListener(this); 
	bt2.addActionListener(this);
	bt3.addActionListener(this);
	bt4.addActionListener(this);
	bt5.addActionListener(this);
	bt6.addActionListener(this);
	bt7.addActionListener(this);
	bt8.addActionListener(this);
	bt9.addActionListener(this); 
	samplePic.addActionListener(this);
	
	setLayout(null);
	setSize(650,550);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e){
if(e.getSource()==bt1){
    Icon s1=bt1.getIcon();
      if(bt2.getIcon()==star){
        bt2.setIcon(s1);
        bt1.setIcon(star);
      } else if(bt4.getIcon()==star){
                    bt4.setIcon(s1);
                    bt1.setIcon(star);
                   }
  }

if(e.getSource()==bt2){
    Icon s1=bt2.getIcon();
      if(bt1.getIcon()==star){
        bt1.setIcon(s1);
        bt2.setIcon(star);
      } else if(bt5.getIcon()==star){
                    bt5.setIcon(s1);
                    bt2.setIcon(star);
                   }
         else if(bt3.getIcon()==star){
                    bt3.setIcon(s1);
                    bt2.setIcon(star);
                   }
  }

if(e.getSource()==bt3){
    Icon s1=bt3.getIcon();
      if(bt2.getIcon()==star){
        bt2.setIcon(s1);
        bt3.setIcon(star);
      } else if(bt6.getIcon()==star){
                    bt6.setIcon(s1);
                    bt3.setIcon(star);
                   }
  }

if(e.getSource()==bt4){
    Icon s1=bt4.getIcon();
      if(bt1.getIcon()==star){
        bt1.setIcon(s1);
        bt4.setIcon(star);
      } else if(bt5.getIcon()==star){
                    bt5.setIcon(s1);
                    bt4.setIcon(star);
                   }
         else if(bt7.getIcon()==star){
                    bt7.setIcon(s1);
                    bt4.setIcon(star);
                   }
  }

if(e.getSource()==bt5){
    Icon s1=bt5.getIcon();
      if(bt2.getIcon()==star){
        bt2.setIcon(s1);
        bt5.setIcon(star);
      } else if(bt4.getIcon()==star){
                    bt4.setIcon(s1);
                    bt5.setIcon(star);
                   }
         else if(bt6.getIcon()==star){
                    bt6.setIcon(s1);
                    bt5.setIcon(star);
                   }
          else if(bt8.getIcon()==star){
                    bt8.setIcon(s1);
                    bt5.setIcon(star);
                   }
  }

if(e.getSource()==bt6){
    Icon s1=bt6.getIcon();
      if(bt3.getIcon()==star){
        bt3.setIcon(s1);
        bt6.setIcon(star);
      } else if(bt5.getIcon()==star){
                    bt5.setIcon(s1);
                    bt6.setIcon(star);
                   }
         else if(bt9.getIcon()==star){
                    bt9.setIcon(s1);
                    bt6.setIcon(star);
                   }
}

if(e.getSource()==bt7){
    Icon s1=bt7.getIcon();
      if(bt4.getIcon()==star){
        bt4.setIcon(s1);
        bt7.setIcon(star);
      } else if(bt8.getIcon()==star){
                    bt8.setIcon(s1);
                    bt7.setIcon(star);
                   }
 }

   if(e.getSource()==bt8){
    Icon s1=bt8.getIcon();
      if(bt7.getIcon()==star){
        bt7.setIcon(s1);
        bt8.setIcon(star);
      } else if(bt5.getIcon()==star){
                    bt5.setIcon(s1);
                    bt8.setIcon(star);
                   }
         else if(bt9.getIcon()==star){
                    bt9.setIcon(s1);
                    bt8.setIcon(star);
                   }

  }

 if(e.getSource()==bt9){
    Icon s1=bt9.getIcon();
      if(bt8.getIcon()==star){
        bt8.setIcon(s1);
        bt9.setIcon(star);
      } else if(bt6.getIcon()==star){
                    bt6.setIcon(s1);
                    bt9.setIcon(star);
                   }
  }

if(e.getSource()==samplePic){
	Icon s1=samplePic.getIcon();
	if(s1==samicon3){
		samplePic.setIcon(samicon1);
		bt1.setIcon(ic1);
		bt2.setIcon(ic2);
		bt3.setIcon(ic3);
		bt4.setIcon(ic4);
		bt5.setIcon(ic5);
		bt6.setIcon(ic6);
		bt7.setIcon(ic7);
		bt8.setIcon(ic8);
		bt9.setIcon(ic9);
		star=bt9.getIcon();
	}
	else if(s1==samicon1){
		samplePic.setIcon(samicon2);
		bt1.setIcon(ic11);
		bt2.setIcon(ic12);
		bt3.setIcon(ic13);
		bt4.setIcon(ic14);
		bt5.setIcon(ic15);
		bt6.setIcon(ic16);
		bt7.setIcon(ic17);
		bt8.setIcon(ic18);
		bt9.setIcon(ic19);
		star=bt6.getIcon();
	}
	else{
		samplePic.setIcon(samicon3);
		bt1.setIcon(ic21);
		bt2.setIcon(ic22);
		bt3.setIcon(ic23);
		bt4.setIcon(ic24);
		bt5.setIcon(ic25);
		bt6.setIcon(ic26);
		bt7.setIcon(ic27);
		bt8.setIcon(ic28);
		bt9.setIcon(ic29);
		star=bt6.getIcon();
	}

}
}

public static void main(String args[]){
	new picpuzzle2();
}
}
