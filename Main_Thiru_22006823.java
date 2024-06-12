/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{public class Machine {
  private String id;
  private String status;

  public Machine(String id) {
    this.id = id;
    this.status = "idle";
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String processRequest(String request) {
    // Implement logic to process request based on your specific needs
    setStatus("busy");
    String response = "Processing request: " + request;
    setStatus("idle");
    return response;
  }

  public static void main(String[] args) {
    // Create a Machine object
    Machine machine = new Machine("M1");

    // Test setter and getter methods
    System.out.println("Machine ID (before setting): " + machine.getId());
    machine.setId("M2");
    System.out.println("Machine ID (after setting): " + machine.getId());

    System.out.println("Machine status (before setting): " + machine.getStatus());
    machine.setStatus("processing");
    System.out.println("Machine status (after setting): " + machine.getStatus());
  }
}

	
