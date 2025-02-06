package OpenClosed_DesignPrinciple.NotificationHandle.BetterCodee;

public class User {
    private String name ;
    private String userId ;
    private String Address ;
    // another details


    public User(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void sendNotificationToUSer(NotificationSender notificationSender , String message){
        notificationSender.send(this.userId,message);
    }

}
