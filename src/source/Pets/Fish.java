package source.Pets;

import source.Pet;

public class Fish extends Pet {

    public Fish(){
        super();
        this.isVaccinated=false;
    }
    public Fish(int age, int weight,String color,String name,boolean vax){
        super(age,weight,color,name,vax);

    }

  @Override
   public void voice() {
        super.voice();
        System.out.println("........");
    }
}
