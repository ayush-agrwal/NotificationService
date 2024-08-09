public class StockNotificationDemo {
    public static void main(String[] args) {
        // Create Stock (Observable)
        Stock stock = new Stock();

        // Create and add observers
        NotificationHandler emailObserver = new EmailNotification("user@example.com");
        NotificationHandler smsObserver = new SMSNotification("+1234567890");

        stock.addObserver((Observer) emailObserver);
        stock.addObserver((Observer) smsObserver);

        // Update stock size and notify observers
        stock.updateStockSize(10); // This should trigger notifications
        stock.updateStockSize(0);  // This should not trigger notifications
        stock.updateStockSize(25); // This should trigger notifications
    }
}
