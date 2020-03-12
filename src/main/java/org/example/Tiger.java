
public interface AnimalInterface {

    public abstract String foodEaten(String food);

}


public class DogInheritance extends AnimalInheritance {



    public DogInheritance(){

        super();


        //dh.displayAge();


    }


    public void dogAge(int dogAge){

        DogInheritance dh = new DogInheritance();
        dh.age(dogAge);

    }






}

public class DogInheritance2 {

    AnimalInheritance2 animal;

    public DogInheritance2(){

        //super();


        //dh.displayAge();


    }


    public void dogAge(int dogAge){

        DogInheritance dh = new DogInheritance();
        dh.age(dogAge);

    }


}

public class DogPolymorphism extends AnimalPolymorphism implements AnimalInterface{

    public DogPolymorphism(){}


    @Override
    public String movement(String moveType) {

        return "Running movement";
    }


    @Override
    public String foodEaten(String food) {

        return "Bone";
    }
}

public class FishPolymorphism extends AnimalPolymorphism implements AnimalInterface {

    public FishPolymorphism(){}

    @Override
    public String movement(String moveType) {

        return "Swimming movement";
    }

    @Override
    public String foodEaten(String food) {

        return "Worms";
    }
}

public class RunAnimal {


    public static void main(String [] args){



    }

}

public class TestOOP {

    public static void main(String [] args){

        //inheritance
        DogInheritance inher = new DogInheritance();
        inher.age(1996);

        //Polymorphism


    }

}
