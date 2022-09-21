package app.daisyboutique_onsite.DTO;

public class user {
    // def attributes
    private int id;
    private String userName;
    private String password;
    private String address;
    private String accessLeve;

    // Constructor


    public user() {
    }

    public user(int id, String userName, String password, String address, String accessLeve) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.address = address;
        this.accessLeve = accessLeve;
    }

    // getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAccessLeve() {
        return accessLeve;
    }

    public void setAccessLeve(String accessLeve) {
        this.accessLeve = accessLeve;
    }
}
