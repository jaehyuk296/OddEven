import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OddEvenCheck extends JFrame{
	//필드
	
	//생성자
	public OddEvenCheck() {
		super("홀짝 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setSize(300,330);
		setContentPane(new MyPanel());//패널 부착
		setVisible(true);
	}
	//메소드
	
	//패널 클래스 정의
	class MyPanel extends JPanel{
		//필드
		private JLabel label = new JLabel("?");
		private JLabel message = new JLabel("무엇일까???");
		
		private JButton [] btns = {
				new JButton("홀"),
				new JButton("짝"),
				new JButton("확인"),
				new JButton("다시")
				
		};
		//생성자
		private MyPanel() {
			setLayout(null);
			
			label.setSize(70,70);
			label.setBackground(Color.magenta);
			label.setOpaque(true);
			label.setFont(new Font("고딕",Font.PLAIN,30));
			label.setHorizontalAlignment(JLabel.CENTER);
			label.setLocation(100,30);
			add(label);
			
			message.setSize(120,30);
			message.setLocation(100,120);
			add(message);
			
			for(int i=0;i<btns.length;i++) {
				JButton b = btns[i];
				b.setSize(50,30);
				b.setLocation(10+i*70,160);
				//이벤트 부착
				b.addActionListener(new MyAction());
				add(b);
			}
		}
		
		//메소드
		
	}
	
	//이벤트 리스너
	class MyAction implements ActionListener{
		private String user;
		
		public void actionPerformed(ActionEvent e) {
			JButton b =(JButton) e.getSource();
			switch(b.getText()) {
			case"홀":
				user = "홀";
				break;
				
			case"짝":
				user = "확인";
				break;
				
			case"확인":
				user = "";
				check();
				break;
				
			case"다시":
				user = "";
				restart();
				break;
			}
		}
	}
	
	void check() {
		
	}
	
	void restart() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OddEvenCheck();
	}

}
