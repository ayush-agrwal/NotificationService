import java.util.Observable;
import java.util.Observer;

// Concrete Observer Class for SMS Notifications
public class SMSNotification implements Observer, NotificationHandler {
    private String phoneNumber;

    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Integer) {
            handleNotification((Integer) arg);
        }
    }

    @Override
    public void handleNotification(int stockSize) {
        // Implement SMS sending logic here
        System.out.println("Sending SMS to " + phoneNumber + ": Stock size is " + stockSize);
    }
}
