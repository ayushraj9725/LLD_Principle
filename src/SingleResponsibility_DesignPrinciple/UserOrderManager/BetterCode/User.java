package SingleResponsibility_DesignPrinciple.UserOrderManager.BetterCode;

public class User {
    private String userId;
    private String name;
    private String email;
    private String address;

    // Constructor
    public User(String userId, String name, String email, String address) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Add more methods if needed (e.g., for user validation, updating information)
}

