package threadabc.she;

public class Shemanto implements Runnable {

    private String name;
    private int age;

    public Shemanto() {
    }

    public Shemanto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void run() {
        for (int i = 0; i < age; i++) {
            System.out.println("kuch bhi print karlo pls");
        }

    }

}
