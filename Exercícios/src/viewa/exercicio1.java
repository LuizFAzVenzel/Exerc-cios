package viewa;

import javax.swing.JOptionPane;
import dao.NotasDAO;
import model.Nota;

public class exercicio1 {

	private static NotasDAO nd = new NotasDAO();

	public static void main(String[] args) {

		if (nd.saveSaida(nd.openEntrada())) {
			JOptionPane.showMessageDialog(null, "Sa�da criada com sucesso!");
		}

	}

}
