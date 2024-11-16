public class Main {
    public static void main(String[] args) {
        // Create a new database to hold items
        Database db = new Database();

        // Create some items
        Item item1 = new CD("The Dark Side of the Moon", "Pink Floyd", 10, 42);
        Item item2 = new DVD("Inception", "Christopher Nolan", 148);
        
        // Set comments and ownership
        item1.setComemnt("Great classic album!");
        item1.setOwn(true);
        
        item2.setComemnt("Mind-bending film");
        item2.setOwn(false);
        
        // Add items to the database
        db.addItem(item1);
        db.addItem(item2);
       
        
        // List all items in the database
        db.list();
    }
}
