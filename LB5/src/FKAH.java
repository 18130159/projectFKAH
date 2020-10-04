import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;
import java.io.File; 
import java.io.IOException; 
import javax.imageio.ImageIO;

public class FKAH extends JFrame{ 
	int b=60, c=6; 
	Double v, a=0.8;
	String s;
	Image img = new ImageIcon("src/mnem.jpg").getImage();	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, 600, 300, null);
	}	
	FKAH(){ 
		setContentPane(new logo());
		Container panel = getContentPane(); 
		panel.setLayout(null); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel l1 = new JLabel("ПИ-220"); 
		l1.setSize(75, 15); 
		l1.setLocation(10,10); 
		panel.add(l1); 
		JLabel l2 = new JLabel("Федорова В.С. "); 
		l2.setSize(175, 15); 
		l2.setLocation(10,25); 
		panel.add(l2); 
		JLabel l4 = new JLabel("Купцова П.К. "); 
		l4.setSize(175, 15); 
		l4.setLocation(10,40); 
		panel.add(l4); 
		JLabel l5 = new JLabel("Альмухаметова Г.А.  gulshana2107@mail.ru"); 
		l5.setSize(270, 15); 
		l5.setLocation(10,230); 
		panel.add(l5); 
		JLabel l6 = new JLabel("Хабибуллина Д.М. "); 
		l6.setSize(175, 15); 
		l6.setLocation(10,70); 
		panel.add(l6); 

		JTextField t1 = new JTextField(""); 
		t1.setSize(110,25); 
		t1.setLocation(10,90); 
		panel.add(t1); 
		JLabel l7 = new JLabel(""); 
		l7.setSize(350, 15); 
		l7.setLocation(10,150); 
		panel.add(l7); 
		JButton button = new JButton("Выполнить"); 
		button.setSize(110, 25); 
		button.setLocation(130,90); 
		button.setForeground(new Color(0,0,0)); 
		button.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0){ 
				s = t1.getText(); 
				b = Integer.parseInt(s); 
				v = a*b*c; 
				s = "Объем параллелепипеда: " + v + " м в кубе"; 
				l7.setText(s); 
			} 
		}); 
		panel.add(button);  
		
		JButton button2 = new JButton("Мнемосхема");
		button2.setSize(110, 25); 
		button2.setLocation(130,120); 
		button2.setForeground(new Color(0,0,0)); 
		button2.addActionListener(new ActionListener(){ 
			@Override 
			public void actionPerformed(ActionEvent arg0){ 
				JFrame mnem = new JFrame();
				mnem.setBounds(100,100,1000,820);
				mnem.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        	JLabel mnem1 = new JLabel(new ImageIcon("src/mnem.jpg"));
	        	mnem1.setBounds(0, 0, 500, 380);
	        	mnem.add(mnem1);	
	        	mnem.setVisible(true);
				
			} 
		}); 
		
		JButton Jswitch = new JButton("В см");
		Jswitch.setSize(110, 25); 
		Jswitch.setLocation(10,120); 
		Jswitch.setForeground(new Color(0,0,0));
		Jswitch.setVisible(true);
		Jswitch.addActionListener(new ActionListener() {
	    	@Override
	        public void actionPerformed(ActionEvent e) {
	        	if (l7.getText().contains("Сантиметры")){
	        		s = t1.getText(); 
					b = Integer.parseInt(s); 
					v = a*b*c; 
					s = "Объем параллелепипеда: " + v + " м в кубе"; 
					l7.setText(s); 
					Jswitch.setText("Сантиметры");
	        	} else {
	        		s = t1.getText(); 
					b = Integer.parseInt(s); 
					v = a*b*c; 
					s = "Объем параллелепипеда: " + v*100 + " см в кубе"; 
					l7.setText(s); 
					Jswitch.setText("В метры");
	        	}
	        	l7.setVisible(false);
	        	l7.setVisible(true);
	    }});
	    panel.add(Jswitch);
	    
	    JButton infob = new JButton("Информация");
	    infob.setSize(110, 25); 
	    infob.setLocation(10,150); 
	    infob.setForeground(new Color(0,0,0));
	    infob.setVisible(true);
	    infob.addActionListener(new ActionListener() {
	    	@Override
	        public void actionPerformed(ActionEvent e) {
	        	
	    }});
	    panel.add(infob);
		
		panel.add(button2);
		
		JLabel ASU = new JLabel("<html><p><a href=\"http://asu.ugatu.ac.ru\">АСУ УГАТУ</a></p></html>");
		ASU.setSize(75, 15); 
		ASU.setLocation(75,10); 
		panel.add(ASU);
		
		JLabel FGBOU = new JLabel("ФГБОУ ВО");
		FGBOU.setSize(75, 15); 
		FGBOU.setLocation(150,10); 
		panel.add(FGBOU);
		
		JLabel UGATU = new JLabel("<html>УГАТУ</html>");
		UGATU.setSize(200, 50); 
		UGATU.setLocation(220,7); 
		panel.add(UGATU);
		
		JLabel infot = new JLabel("<html>Кнопка с информацией добавлена</html>");
		infot.setSize(150, 50); 
		infot.setLocation(130,140); 
		panel.add(infot);
		
		JLabel info = new JLabel("<html>Руководитель курсовой работы: Казанцев А.В.</html>");
		info.setSize(200, 50); 
		info.setLocation(220,47); 
		panel.add(info);
		
		setSize(625, 340); 
		setVisible(true); 
	}
		public static void main(String[] args){ 
			new FKAH(); 
			logo m = new logo();
		}
}
class logo extends JPanel { 
	protected void paintComponent(Graphics g) { 
		Image image = null; try { 
			image = ImageIO.read(new File("src\\logotip.JPG")); 
		} 
		catch (IOException e) { 
			e.printStackTrace(); 
		} 
		super.paintComponent(g); 
		g.drawImage(image, 0, 0, null); 
	} 
}