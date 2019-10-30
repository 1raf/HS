class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal{
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee-wee");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: bow-bow");
    }

}
class MyMainClass {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myDog.animalSound();
        myPig.animalSound();
    }

}