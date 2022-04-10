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

    String getName(){
       return name;
    }

    int getAge(){
        return age;
    }
    String isMarried(){
        if (!this.isMarried){
            return "necasatorit";
        } else {
            return  "casatorit";
        }
    }

    void setAge(int age){
        this.age = age;
    }

    void setName(String name){
        this.name =name;
    }

    void printDetails(){
        System.out.println("The name is " + getName() + " the age is " + getAge()+ " the status is " + isMarried());
    }

}
