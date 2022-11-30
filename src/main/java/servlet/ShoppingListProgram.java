package servlet;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingListProgram {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// PAKKO TEHDA OLIO HIRVIO-LUOKASTA, KOSKA MUUTEN EI PYSTY
		// KUTSUMAAN SEN METODEITA ELI FUNKTIOITA
		JDBCShoppingListItemDao dao = new JDBCShoppingListItemDao();
		
		// METODIN KUTSU, TAPAUS, ETT� METODI _PALAUTTAA_ JOTAIN
		// KUN METODI PALAUTTAA JOTAIN ON _OLTAVA_ = MERKKI JA MUUTTUJA
		// JA SEN TIETOTYPPI
		List<ShoppingListItem> listaTuotteista = dao.getAllItems();
		
		for (int i = 0; i < listaTuotteista.size(); i++) {
			System.out.println(listaTuotteista.get(i));
		}
		
		
	}
}
