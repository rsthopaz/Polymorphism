import java.util.ArrayList;
public class Database {
    private ArrayList<Item> items;

    public Database()
    {
        items = new ArrayList<>();
    }

    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    public void list()
    {
        for(Item item : items)
        {
            item.print();
        }
    }
}
