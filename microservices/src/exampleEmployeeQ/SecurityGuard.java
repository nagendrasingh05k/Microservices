package exampleEmployeeQ;

class SecurityGuard extends Employee implements Securable {
    public SecurityGuard(String name, int id) {
        super(name, id);
    }

    public void secureArea() {
        System.out.println(name + " is securing the premises.");
    }

    public void showDetails() {
        System.out.println("Security Guard: " + name + " (ID: " + id + ")");
    }
}

