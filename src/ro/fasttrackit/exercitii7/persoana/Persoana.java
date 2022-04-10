package ro.fasttrackit.exercitii7.persoana;

public class Persoana {
    String name;
    int age;
    boolean isMarried;

    Persoana(String name, int age, boolean isMarried){
        this.name=name;
        this.age=age;
        this.isMarried=isMarried;
    }

    public String getName(){
       return name;
    }

    public int getAge(){
        return age;
    }
    public String getIsMarried(){
        if (isMarried==false){
            return "necasatorit";
        } else {
            return  "casatorit";
        }
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name =name;
    }

    public void printDetails(){
        System.out.println("The name is " + getName() + " the age is " + getAge()+ " the status is " + getIsMarried());
    }

}
