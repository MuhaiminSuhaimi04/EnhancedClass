public class Client {
    // Attributes
    private int clientId;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private float accountAmount;
    private LaundrySession laundrySession;

    // Constructors
    // 1) Default constructor - to ensure initialisation
    public Client() {
        this.clientId = 0;
        this.name = "";
        this.email = "";
        this.phoneNumber = "";
        this.password = "";
        this.accountAmount = 0.0f;
        this.laundrySession = null;
    }

    // 2) Constructor with basic details including password
    public Client(int clientId, String name, String email, String password) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = "";
        this.accountAmount = 0.0f;
        this.laundrySession = null;
    }

    // 3) Constructor with all details except laundrySession
    public Client(int clientId, String name, String email, String phoneNumber, String password, float accountAmount) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.accountAmount = accountAmount;
        this.laundrySession = null;
    }

    // 4) Full constructor
    public Client(int clientId, String name, String email, String phoneNumber, String password, float accountAmount, LaundrySession laundrySession) {
        this.clientId = clientId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.accountAmount = accountAmount;
        this.laundrySession = laundrySession;
    }

    // Getters and Setters
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public float getAccountAmount() {
        return accountAmount;
    }

    public void setAccountAmount(float accountAmount) {
        this.accountAmount = accountAmount;
    }

    public LaundrySession getLaundrySession() {
        return laundrySession;
    }

    public void setLaundrySession(LaundrySession laundrySession) {
        this.laundrySession = laundrySession;
    }

    // Methods
    public void checkMachineAvailability() {

    }

    public void selectService(String service) {
        System.out.println("Service selected: " + service);
    }

    public void chooseSetting(String setting) {
        System.out.println("Setting chosen: " + setting);
    }

    public void checkAccountBalance() {
        System.out.println("Account balance: $" + accountAmount);
    }

    public float addMoney(float amount) {
      return 0;
    }

    // test code
    public static void main(String[] args){
        Client client1 = new Client();

        client1.setName("John");
        System.out.println("Client 1: "+ client1.getName());
    }
}



