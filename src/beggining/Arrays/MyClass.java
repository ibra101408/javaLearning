package beggining.Arrays;

public class MyClass {

    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public MyClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public boolean equals (Object obj){
        System.out.println("Equals is called - " + this + ":" + obj);
        MyClass other = (MyClass) obj;
        return id.equals(other.id) && name.equals(other.name);
    }
    public int hashCode(){
        System.out.println("Hascode is called " + this);
        return id.intValue();
    }
    public String toString(){
        return "MyClass{" +
                "id" + id +
                ", name = " + name + '\'' +
                "}";
    }
}
