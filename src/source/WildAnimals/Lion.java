package source.WildAnimals;

import source.Wild;

public class Lion extends Wild {


    public Lion(){
        super();
        this.isPredator=true;
    }

    public Lion(int age, int weight,String color){
        super(age,weight,color,true);
    }

    /*@Override
    public void voice() {
        super.voice();
        System.out.println("Simba, remember who you are!");
    }*/


}
