
package employeeclass;

import employeeclass.subcClass.Manager;


public class EmployeeClass {


    public static void main(String[] args) {
      
   
        Manager m = new Manager();
        
        
          m.setName("XYZ");
          m.setId(1287046);
          m.setSalary(565413218);
          m.setTeamSize(2);
        
          m.allDetails();
    }
    
}
