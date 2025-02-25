package exampleEmployeeQ;

class EmployeeManagementSystem {
    public static void main(String[] args) {
        Developer dev = new Developer("Nagendra", 101);
        Manager mgr = new Manager("rahul", 102);
        SecurityGuard guard = new SecurityGuard("avinash", 103);


        dev.showDetails();
        mgr.showDetails();
        guard.showDetails();

    
        dev.work();
        mgr.manage();
        guard.secureArea();
    }
}
