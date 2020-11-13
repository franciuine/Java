import java.awt.FlowLayout; 
import javax.swing.JFrame; 
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Janela extends JFrame {
	private JButton botao1, botao2;
	private JCheckBox check1, check2;
	private JComboBox <String> cor;
	private static final String[] cores = {"RED", "BLUE", "GREEN"};
	public Janela() {
		super("Atividade 5 - Exercício 2");
		setLayout(new FlowLayout());
		cor = new JComboBox<>(cores);
		add(cor);
  } 
}
