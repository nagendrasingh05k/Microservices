package exampleEmployeeQ;

class Manager extends Employee implements Manageable {
    public Manager(String name, int id) {
        super(name, id);
    }

    public void manage() {
        System.out.println(name + " is managing the team.");
    }

    public void showDetails() {
        System.out.println("Manager: " + name + " (ID: " + id + ")");
    }
}
