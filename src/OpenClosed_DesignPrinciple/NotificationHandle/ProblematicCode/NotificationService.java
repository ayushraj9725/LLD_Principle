package OpenClosed_DesignPrinciple.NotificationHandle.ProblematicCode;

import java.util.List;

public class NotificationService {
    public void sendNotification(List<Notifications> notificationType){
        for(Notifications types : notificationType){
            if(types == Notifications.SMS){
                types.sendSmsNotification();
            }
            else if(types == Notifications.WHATSAPP){
                types.sendWhatsappNotification();
            }
            else if (types == Notifications.EMAIL) {
                types.sensEmailNotification();
            }
            // if we want to add some notification we have to modify this NotificationService class which is not a good way
            // so we want to apply yhe Closed for Modification in this class , see in the better code package

        }
    }
}
