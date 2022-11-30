package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO: Complete the implementation of this DAO-class 
 * by implementing database operations for each of the 
 * CRUD methods.
 */
public class JDBCShoppingListItemDao implements ShoppingListItemDao {

	// METODIN M��RITYS
    @Override
    public List<ShoppingListItem> getAllItems() throws ClassNotFoundException, SQLException {
    	System.out.println("OLLAAN GETALLITEMS METODISSA");
    	// CONNECTION STRINGIN MAARITYS
    	String URL = "jdbc:sqlite:./shoppingList.sqlite";
    	// AVATAAN TIETOKANTAYHTEYS    	
    	Class.forName("org.sqlite.JDBC");
    	Connection yhteys = DriverManager.getConnection(URL);
    	// LUODAAN SQL KYSELY, JOKA HAKEE KAIKKI TUOTTEET TIETOKANNASTA
    	PreparedStatement kysely = yhteys.prepareStatement("SELECT * FROM ShoppingListItem");
    	// SUORITETAAN SQL-KYSELY, JOKA EI OLE TIETOKANTAA P�IVITT�V�
    	// ELI EXECUTEQUERY, JOKA PALAUTTAA TIETOKANNASTA TULOSRIVIT
    	ResultSet tulokset = kysely.executeQuery();
    	// LUODAAN LISTA, JOHON LAITETAAN KYSELYN TULOKSET 
    	ArrayList<ShoppingListItem> tuotteet = new ArrayList<ShoppingListItem>();
    	// LOOPATAAN L�PI TULOKSET
    	while(tulokset.next()) {
    		String title = tulokset.getString("title");
    		long id = tulokset.getLong("id");
    		// TUOTE VOIDAAN LUODA PARAMETRILLISELL� KONSTRUKTORILLA
    		ShoppingListItem tuote = new ShoppingListItem(id, title);
    		// LIS�T��N LISTAAN YKSITELLEN TUOTTEITA
    		tuotteet.add(tuote);
    	}
    	tulokset.close();
    	kysely.close();
    	// SULJETAAN TIETOKANTAYHTEYS
        yhteys.close();
        return tuotteet;
    }

    @Override
    public ShoppingListItem getItem(long id) {
    	
        return null;
    }

    @Override
    public boolean addItem(ShoppingListItem newItem) {
    	
        return false;
    }

    @Override
    public boolean removeItem(ShoppingListItem item) {
    	
        return false;
    }

}