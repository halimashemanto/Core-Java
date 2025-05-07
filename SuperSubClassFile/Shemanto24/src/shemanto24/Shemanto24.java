
package shemanto24;

import shemanto24.sub.Student;


public class Shemanto24 {

  
    public static void main(String[] args) {
       
        Student s = new Student();
        
        s.setAge(24);
        s.setName("Shemanto");
        s.setStudentId(1287046);
        
        System.out.println(s.details());
        
        
    }
    
}
