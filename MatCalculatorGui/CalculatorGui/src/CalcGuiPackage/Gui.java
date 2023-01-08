package CalcGuiPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Gui {

	private JFrame frame;

	public static void main(String[] args) {

		ImageIcon Calcicon = new ImageIcon(
				"C:\\Users\\201325\\Desktop\\Java\\eclipse_workspace\\CalculatorGui\\src\\Capture.PNG");
		CalcOp calcop = new CalcOp();
		JFrame jf = new JFrame();
		jf.setTitle("Mat's Calculator");
		jf.setIconImage(Calcicon.getImage());
		jf.setSize(347, 459);
		jf.setLocation(100, 200);
		jf.getContentPane().setBackground(new Color(0, 0, 0));
		JTextField text1 = new JTextField(10);
		jf.getContentPane().setLayout(null);
		JLabel label1 = new JLabel();
		label1.setBounds(60, 19, 210, 13);

		label1.setText("Choose an operation...");
		jf.getContentPane().add(label1);
		label1.setForeground(Color.green);
		JLabel label2 = new JLabel();
		label2.setBounds(60, 42, 210, 13);
		label2.setText("Important! Use '.' for enter decimals");
		jf.getContentPane().add(label2);
		label2.setForeground(Color.green);

		JButton button1 = new JButton("Addition");
		button1.setBounds(60, 85, 200, 25);
		jf.getContentPane().add(button1);
		button1.setBackground(Color.black);
		button1.setForeground(Color.green);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1, number2;

				String snumber1 = JOptionPane.showInputDialog("Please enter first number:");
				String snumber2 = JOptionPane.showInputDialog("Please enter second number:");

				try {
					number1 = Double.parseDouble(snumber1);
					number2 = Double.parseDouble(snumber2);
					if ((number1 < 1 || number1 > 0) && (number2 < 1 || number2 > 0)) {
						JOptionPane.showMessageDialog(null, calcop.addition(number1, number2), "Result",
								JOptionPane.INFORMATION_MESSAGE);

					}

				} catch (java.lang.NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "Please enter only numbers!", "Result",
							JOptionPane.WARNING_MESSAGE);

				} catch (java.lang.NullPointerException er) {
					// JOptionPane.showMessageDialog(null, "Please enter only numbers");
				}

			}
		});
		JButton button2 = new JButton("Subtraction");
		button2.setBounds(60, 120, 200, 25);
		jf.getContentPane().add(button2);
		// button1.setFont(new Font("SansSerif",Font.BOLD,12));
		button2.setBackground(Color.black);
		button2.setForeground(Color.green);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1, number2;

				String snumber1 = JOptionPane.showInputDialog("Please enter first number:");
				String snumber2 = JOptionPane.showInputDialog("Please enter second number:");

				try {
					number1 = Double.parseDouble(snumber1);
					number2 = Double.parseDouble(snumber2);
					if ((number1 < 1 || number1 > 0) && (number2 < 1 || number2 > 0)) {
						JOptionPane.showMessageDialog(null, calcop.subtraction(number1, number2), "Result",
								JOptionPane.INFORMATION_MESSAGE);

					}

				} catch (java.lang.NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "Please enter only numbers!", "Result",
							JOptionPane.WARNING_MESSAGE);
				} catch (java.lang.NullPointerException er) {
					// JOptionPane.showMessageDialog(null, "Please enter only numbers");
				}
			}
		});
		JButton button3 = new JButton("Multiplication");
		button3.setBounds(60, 155, 200, 25);
		jf.getContentPane().add(button3);
		button3.setBackground(Color.black);
		button3.setForeground(Color.green);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1, number2;

				String snumber1 = JOptionPane.showInputDialog("Please enter first number:");
				String snumber2 = JOptionPane.showInputDialog("Please enter second number:");

				try {
					number1 = Double.parseDouble(snumber1);
					number2 = Double.parseDouble(snumber2);
					if ((number1 < 1 || number1 > 0) && (number2 < 1 || number2 > 0)) {
						JOptionPane.showMessageDialog(null, calcop.multiplication(number1, number2), "Result",
								JOptionPane.INFORMATION_MESSAGE);

					}

				} catch (java.lang.NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "Please enter only numbers!", "Result",
							JOptionPane.WARNING_MESSAGE);
				} catch (java.lang.NullPointerException er) {
					// JOptionPane.showMessageDialog(null, "Please enter only numbers");
				}
			}
		});
		JButton button4 = new JButton("Division");
		button4.setBounds(60, 190, 200, 25);
		jf.getContentPane().add(button4);
		button4.setBackground(Color.black);
		button4.setForeground(Color.green);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1, number2;

				String snumber1 = JOptionPane.showInputDialog("Please enter first number:");
				String snumber2 = JOptionPane.showInputDialog("Please enter second number:");

				try {
					number1 = Double.parseDouble(snumber1);
					number2 = Double.parseDouble(snumber2);
					if ((number1 < 1 || number1 > 0) && (number2 < 1 || number2 > 0)) {
						JOptionPane.showMessageDialog(null, calcop.division(number1, number2), "Result",
								JOptionPane.INFORMATION_MESSAGE);

					}

				} catch (java.lang.NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "Please enter only numbers!", "Result",
							JOptionPane.WARNING_MESSAGE);
				} catch (java.lang.NullPointerException er) {
					// JOptionPane.showMessageDialog(null, "Please enter only numbers");
				}
			}
		});
		JButton button5 = new JButton("Modulo");
		button5.setBounds(60, 225, 200, 25);
		jf.getContentPane().add(button5);
		button5.setBackground(Color.black);
		button5.setForeground(Color.green);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1, number2;

				String snumber1 = JOptionPane.showInputDialog("Please enter first number:");
				String snumber2 = JOptionPane.showInputDialog("Please enter second number:");

				try {
					number1 = Double.parseDouble(snumber1);
					number2 = Double.parseDouble(snumber2);
					if ((number1 < 1 || number1 > 0) && (number2 < 1 || number2 > 0)) {
						JOptionPane.showMessageDialog(null, calcop.modulo(number1, number2), "Result",
								JOptionPane.INFORMATION_MESSAGE);

					}

				} catch (java.lang.NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "Please enter only numbers!", "Result",
							JOptionPane.WARNING_MESSAGE);
				} catch (java.lang.NullPointerException er) {
					// JOptionPane.showMessageDialog(null, "Please enter only numbers");
				}
			}
		});
		JButton button6 = new JButton("Power");
		button6.setBounds(60, 260, 200, 25);
		jf.getContentPane().add(button6);
		button6.setBackground(Color.black);
		button6.setForeground(Color.green);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1, number2;

				String snumber1 = JOptionPane.showInputDialog("Please enter first number:");
				String snumber2 = JOptionPane.showInputDialog("Please enter second number:");

				try {
					number1 = Double.parseDouble(snumber1);
					number2 = Double.parseDouble(snumber2);
					if ((number1 < 1 || number1 > 0) && (number2 < 1 || number2 > 0)) {
						JOptionPane.showMessageDialog(null, calcop.power(number1, number2), "Result",
								JOptionPane.INFORMATION_MESSAGE);

					}

				} catch (java.lang.NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "Please enter only numbers!", "Result",
							JOptionPane.WARNING_MESSAGE);
				} catch (java.lang.NullPointerException er) {
					// JOptionPane.showMessageDialog(null, "Please enter only numbers");
				}
			}
		});
		JButton button7 = new JButton("Circumference of the circle");
		button7.setBounds(58, 295, 200, 25);
		jf.getContentPane().add(button7);
		button7.setBackground(Color.black);
		button7.setForeground(Color.green);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double number1;

				String snumber1 = JOptionPane.showInputDialog("Please enter radius: (pi value=3,14)");

				try {
					number1 = Double.parseDouble(snumber1);

					if ((number1 < 1 || number1 > 0)) {
						JOptionPane.showMessageDialog(null, calcop.radiuscalc(number1), "Result",
								JOptionPane.INFORMATION_MESSAGE);

					}

				} catch (java.lang.NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "Please enter only numbers!", "Result",
							JOptionPane.WARNING_MESSAGE);
				} catch (java.lang.NullPointerException er) {

				}

			}
		});
		JButton button8 = new JButton("Factorial");
		button8.setBounds(60, 330, 200, 25);
		jf.getContentPane().add(button8);
		button8.setBackground(Color.black);
		button8.setForeground(Color.green);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1;

				String snumber1 = JOptionPane.showInputDialog("Please enter a number:");
				try {
					number1 = Integer.parseInt(snumber1);
					if (number1 < 0) {
						JOptionPane.showMessageDialog(null, "Factorials do not exist for negative numbers");
					} else if (number1 == 0) {
						JOptionPane.showMessageDialog(null, "Result: " + "1");

					} else {
						JOptionPane.showMessageDialog(null, calcop.factorial(number1), "Result",
								JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (java.lang.NullPointerException er) {
					// JOptionPane.showMessageDialog(null, "Please enter only numbers!");
				} catch (java.lang.NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "Please enter only numbers!", "Result",
							JOptionPane.WARNING_MESSAGE);
				}

			}
		});
		JButton button9 = new JButton("Square Root");
		button9.setBounds(62, 365, 200, 25);
		jf.getContentPane().add(button9);
		button9.setBackground(Color.black);
		button9.setForeground(Color.green);
		/* Addition */

		/* Subtraction */
		/* Multiplication */
		/* Division */
		/* Modulo */
		/* Power */
		/* Circumference of the circle */

		/* Factorial */
		/* Square Root */
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1;

				String snumber1 = JOptionPane.showInputDialog("Please enter a number:");

				try {
					number1 = Double.parseDouble(snumber1);

					if ((number1 >= 0)) {
						JOptionPane.showMessageDialog(null, Math.sqrt(number1), "Result",
								JOptionPane.INFORMATION_MESSAGE);

					} else if ((number1 < 1)) {
						JOptionPane.showMessageDialog(null, "Please enter only positive numbers");

					}

				} catch (java.lang.NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "Please enter only numbers!", "Result",
							JOptionPane.WARNING_MESSAGE);
				} catch (java.lang.NullPointerException er) {

				}

			}
		});
		// jf.setResizable(true);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);

	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
