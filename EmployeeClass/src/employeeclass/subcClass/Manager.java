
package employeeclass.subcClass;


public class Manager extends employeeclass.supper.Employee{
    
    private int teamSize;

    public Manager() {
    }

    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }

    public Manager(int teamSize, String name, int id, double salary) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager{" + "teamSize=" + teamSize + '}';
    }

    @Override
    public void allDetails() {
        super.allDetails(); 
        System.out.println("TeamSize = " + teamSize +"\n");
    }
    
    
       
    
}
