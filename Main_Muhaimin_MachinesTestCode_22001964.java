public class Main {
    public static void main(String[] args) {
        // Create the Machines collection
        Machines machinesCollection = new Machines();

        // Create some Machine instances
        Machine machine1 = new Machine("Washer 1", "OK");
        Machine machine2 = new Machine("Dryer 1", "OK");
        Machine machine3 = new Machine("Washer 2", "Not OK");

        // Add machines to the collection
        machinesCollection.add(machine1);
        machinesCollection.add(machine2);
        machinesCollection.add(machine3);

        // Print all machines
        System.out.println("All Machines:");
        machinesCollection.print();

        // Find a machine
        Machine foundMachine = machinesCollection.find("Washer 1");
        System.out.println("Found Machine: " + (foundMachine != null ? foundMachine.getName() : "None"));

        // Get machines by status
        List<Machine> okMachines = machinesCollection.getMachinesByStatus("OK");
        System.out.println("OK Machines:");
        for (Machine machine : okMachines) {
            System.out.println(machine.getName());
        }

        // Update machine status
        boolean statusUpdated = machinesCollection.updateMachineStatus("Washer 2", "OK");
        System.out.println("Status Updated: " + statusUpdated);

        // Print all machines again to see the updated status
        System.out.println("All Machines After Status Update:");
        machinesCollection.print();

        // Count machines
        int machineCount = machinesCollection.countMachines();
        System.out.println("Total Machines: " + machineCount);
    }
}

class Machine {
    private String name;
    private String status;

    public Machine(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
