public class Person {

    private String name = "No name";
    private int age = 0;
    private String gender = "M";

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }    

    public String getName() {
        return this.name;
    } 

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString() {
        return String.format("%-20s %-10d %s", name, age, gender);
    }
    
}
