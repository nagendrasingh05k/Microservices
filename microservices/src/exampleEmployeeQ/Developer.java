package exampleEmployeeQ;

class Developer extends Employee implements Workable {
    public Developer(String name, int id) {
        super(name, id);
    }


    public void work() {
        System.out.println(name + " is coding.");
    }


    public void showDetails() {
        System.out.println("Developer: " + name + " (ID: " + id + ")");
    }
}

