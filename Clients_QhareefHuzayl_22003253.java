public class Clients {
    private Client[] clientsList;
    private int currentSize; // Tracks the number of clients currently in the list

    public Clients(int capacity) {
        this.clientsList = new Client[capacity];
        this.currentSize = 0;
    }

    // Methods
    public void add(String name, String contactInfo, int id) {
        if (currentSize < clientsList.length) {
            clientsList[currentSize] = new Client(name, contactInfo, id);
            currentSize++;
        } else {
            System.out.println("Client list is full!");
        }
    }

    public void delete(int id) {
        boolean found = false;
        for (int i = 0; i < currentSize; i++) {
            if (clientsList[i].getId() == id) {
                found = true;
                // Shift elements to remove the deleted client
                for (int j = i; j < currentSize - 1; j++) {
                    clientsList[j] = clientsList[j + 1];
                }
                currentSize--;
                break;
            }
        }
        if (!found) {
            System.out.println("Client with ID " + id + " not found!");
        }
    }

    public void print() {
        for (int i = 0; i < currentSize; i++) {
            System.out.println("Client " + (i + 1) + ":");
            System.out.println("  Name: " + clientsList[i].getName());
            System.out.println("  Contact Info: " + clientsList[i].getContactInfo());
            System.out.println("  ID: " + clientsList[i].getId());
        }
    }

    public Client find(int id) {
        for (int i = 0; i < currentSize; i++) {
            if (clientsList[i].getId() == id) {
                return clientsList[i];
            }
        }
        return null; // Client with ID not found
    }
}