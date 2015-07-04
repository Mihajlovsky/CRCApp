import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

/**
 *  Java Swing App
 *
 * @author Mihajlovsky
 *
 */

public class frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel label_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public Boolean isValid=true;
	private JLabel lblByMihajlovsky;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public frame() {
		setBackground(Color.WHITE);
		setResizable(false);
		setTitle("Cyclic Redundancy Check ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 206, 209));
		contentPane.add(panel, BorderLayout.WEST);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		
		label_1 = new JLabel("\u0411\u0438\u043D\u0430\u0440\u0435\u043D \u0431\u0440\u043E\u0458");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel label = new JLabel("\u0413\u0435\u043D\u0435\u0440\u0430\u0442\u043E\u0440");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		
		JButton button = new JButton("\u041F\u0440\u0435\u0441\u043C\u0435\u0442\u0430\u0458");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (textField.getText().length()>0 && textField_1.getText().length()>0){
				isValid=true;
				
				for (int i=0;i<textField.getText().length();i++)
				{
				
					if (textField.getText().charAt(i)!='0' && textField.getText().charAt(i)!='1')
					{
						isValid=false; 
						textField_3.setText("Невалидна бинарна секвенца!");
						break;
					}
				}
				
				for (int i=0;i<textField_1.getText().length();i++)
				{
					if (textField_1.getText().charAt(i)!='0' && textField_1.getText().charAt(i)!='1')
					{
						isValid=false;						
						textField_3.setText("Невалиден генераторен полином!");
						break;
					}
				}
				
				if (isValid){
				textField_3.setText(CRC.CyclicRedundancyCheck(textField_1.getText(), textField.getText()));
				textField_2.setText(CRC.Greska);
				}
				}
				else{
					textField_3.setText("Внесете генератор и бинарна секвенца!");
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel label_2 = new JLabel("\u0413\u0440\u0435\u0448\u043A\u0430");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("\u0411\u0438\u043D\u0430\u0440\u0435\u043D \u0411\u0440\u043E\u0458+\u0413\u0440\u0435\u0448\u043A\u0430");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		
		lblByMihajlovsky = new JLabel("by Mihajlovsky");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap(363, Short.MAX_VALUE)
							.addComponent(lblByMihajlovsky))
						.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED))
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_panel.createSequentialGroup()
												.addGap(8)
												.addComponent(label, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
											.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED))
									.addGroup(gl_panel.createSequentialGroup()
										.addContainerGap()
										.addComponent(label_2)
										.addGap(48))))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_panel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(textField, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
											.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addComponent(button, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED))
									.addComponent(label_3))
								.addComponent(textField_3, 305, 305, 305))))
					.addGap(24))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(20)
							.addComponent(button, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addComponent(lblByMihajlovsky)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
	}
}
