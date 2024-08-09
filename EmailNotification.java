import java.util.Observable;
import java.util.Observer;

// Concrete Observer Class for Email Notifications
public class EmailNotification implements Observer, NotificationHandler {
    private String email;

    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Integer) {
            handleNotification((Integer) arg);
        }
    }

    @Override
    public void handleNotification(int stockSize) {
        // Implement email sending logic here
        System.out.println("Sending email to " + email + ": Stock size is " + stockSize);
    }
}
