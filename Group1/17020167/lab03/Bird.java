package ex3;
//doi tuong con chim
public class Bird {
    private String name;
    private String breed;
    private int age;
    private String others;
    
    //getter va setter
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
    
    public void setBreed(String n) {
        breed = n;
    }
    
    public String getBreed() {
        return breed;
    }
    
    public void setAge(int n) {
        age = n;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setOthers(String n) {
        others = n;
    }
    
    public String getOthers() {
        return others;
    }
    
    //ham lay thong tin
    public void getInfor() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(breed);
        System.out.println(others);
    }
    
    //ham tieng chim keu
    public void peek() {
        System.out.println("cheep cheep");
    }
}
