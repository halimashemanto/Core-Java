
package shemanto24.sup;

public class Suprova {
    
    
    private String name;
    private int age;

    public Suprova() {
    }

    public Suprova(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Suprova{" + "name=" + name + ", age=" + age + '}';
    }
    
    
    public String details(){
        return  name +"\n" + age ;
              
       
    }

 
}
