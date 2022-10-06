package com.valtech.training.corejava.day1;

public class AnimalSounds {
       public void distrurb(Animal a)
       {
    	   a.makeSound();
       }
       public static void main(String[] args) {
		AnimalSounds as=new AnimalSounds();
		as.distrurb(new Dog());
		as.distrurb(new cat());
	}
}
