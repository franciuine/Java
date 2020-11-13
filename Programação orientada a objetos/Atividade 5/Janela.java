import java.awt.FlowLayout; 
import javax.swing.JFrame; 
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Janela extends JFrame {
	private JButton botao1, botao2, botao3;
	private JCheckBox check1, check2;
	private JTextField x, y;
	private JLabel a, b;
	public Janela() {
		super("Atividade 5 - Exercício 1");
		setLayout(new FlowLayout()); 
		botao1 = new JButton("Ok");
		add(botao1);
		botao2 = new JButton("Cancel");
		add(botao2);
		botao3 = new JButton("Help");
		add(botao3);
		check1 = new JCheckBox("Snap to Grid");
		add(check1);
		check2 = new JCheckBox("Show Grid");
		add(check2);
		a = new JLabel("X: ");
		add(a);
		x = new JTextField("     ");
		add(x);
		b = new JLabel("Y: ");
		add(b);
		y = new JTextField("     ");
		add(y);
  } 

}
