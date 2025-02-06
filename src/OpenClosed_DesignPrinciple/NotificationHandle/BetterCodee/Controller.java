package OpenClosed_DesignPrinciple.NotificationHandle.BetterCodee;

// Using the Classes in the Main Method
//Finally, we can instantiate the NotificationSender with different types of NotificationService (Email, SMS, WhatsApp)
// and send messages accordingly. The NotificationSender class doesn't need to be modified when adding new types of notifications.

import java.sql.SQLOutput;

public class Controller {
    // Create instances of the notification services
    public static void main(String[] args) {

        NotificationService emailNotifier = new EMAIL();
        NotificationService smsNotifier = new SMS();
        NotificationService whatsappNotifier = new WHATSAPP();
        NotificationService telegramNotifier = new TELEGRAM();

        // now make instance of user , who have we want to send the sms
        User user1 = new User("@kunalKumar01");
        User user2 = new User("@AyushRaj25");
        User user3 = new User("MurariKumar45");
        User user4 = new User("@AshmitSing06");

        // Inject the respective notification service into NotificationSender
        NotificationSender emailSender = new NotificationSender(emailNotifier);
        NotificationSender smsSender = new NotificationSender(smsNotifier);
        NotificationSender whatsappSender = new NotificationSender(whatsappNotifier);
        NotificationSender telegramSender = new NotificationSender(telegramNotifier);

        // now using this type of sender we can send the message to the user
        user1.sendNotificationToUSer(emailSender,"Hey how are you Kunal !");
        user2.sendNotificationToUSer(smsSender,"What are you doing Ayush !");
        user3.sendNotificationToUSer(whatsappSender,"Murari your daily life how it's going !");
        user4.sendNotificationToUSer(telegramSender,"Hey Ashmit your Father is coming tomorrow !");

    }
}
