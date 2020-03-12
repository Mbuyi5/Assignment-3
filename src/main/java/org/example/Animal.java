public class AnimalInheritance {

    private int yearBorn;

    public AnimalInheritance(){

    }


    public int age(int yearBorn){

        return 2020 - yearBorn;

    }

    public void displayAge(){

        System.out.println("The Animal age is: "+yearBorn);

    }

    public void setYearBorn(int yearBorn) {
        this.yearBorn = yearBorn;
    }

    public int getYearBorn() {
        return yearBorn;
    }
}
