import java.util.Observable;

// Concrete Observable Class
public class Stock extends Observable {
    private int stockSize;

    // Method to update stock size and notify observers if stock size > 0
    public void updateStockSize(int newSize) {
        this.stockSize = newSize;
        setChanged(); // Mark this object as changed
        if (stockSize > 0) {
            notifyObservers(stockSize); // Notify all registered observers with the stock size
        }
    }

    // Get the current stock size
    public int getStockSize() {
        return stockSize;
    }
}
