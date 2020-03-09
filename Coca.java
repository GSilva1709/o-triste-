import javax.swing.JOptionPane;

public class Coca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JOptionPane.showMessageDialog(null, "Maquina de Coca");
		
		Integer[] cents = { 10, 25 };
		
		int valor = 0;
		
		while (valor < 45) {
			
		int moeda = JOptionPane.showOptionDialog(null, "Só coloque moedas de R$0,10 e R$0,25 " ,
		null, JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, cents, cents[0]);

			if (moeda == 0) {
				
				valor += 10;
			} 
			
			else if  (moeda == 1){
				
				valor += 25;
			}
			
		}

		JOptionPane.showMessageDialog(null, "Retire sua Coca");

	}
}