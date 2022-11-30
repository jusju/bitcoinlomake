package servlet;

import java.sql.SQLException;
import java.util.List;


public interface ShoppingListItemDao {

    public List<ShoppingListItem> getAllItems() throws ClassNotFoundException, SQLException;

    public ShoppingListItem getItem(long id) throws ClassNotFoundException, SQLException;

    public boolean addItem(ShoppingListItem newItem) throws ClassNotFoundException, SQLException;

    public boolean removeItem(ShoppingListItem item) throws ClassNotFoundException, SQLException;
}