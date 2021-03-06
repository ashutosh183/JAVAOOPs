class Animal{
      private String name;
      private int age;
      private int weight;
      private int size;

      Animal(String name, int age, int weight, int size){
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.size = size;
      }
      public String getName(){
            return name;
      }
      public int getAge(){
            return age;
      }
      public int getWeight(){
            return weight;
      }
      public int getSize(){
            return size;
      }
      public void eat(){
            System.out.println("Animal eat is called");
      }
      public void move(int speed){
            System.out.println("Animal is moving at a speed of "+speed);
      }
}

class Dog extends Animal{
      private String breed;
      private boolean isHealthy;
      Dog(String name, int age, int weight, int size, String breed, boolean isHealthy){
            super(name, age, weight, size);
            this.breed = breed;
            this.isHealthy = isHealthy;
      }
      public String getBreed(){
            return this.breed;
      }
      public boolean isHealthy(){
            return this.isHealthy;
      }
      @Override
      public void eat(){
            System.out.println("Dog class eat is called");
            super.eat();
      }
      public void walk(){
            System.out.println("Dog walks");
            move(5); /// can also call using super.move(value);
      }
      public void run(){
            System.out.println("Dog runs");
            move(10);
      }
      private void moveWithLegs(){
            System.out.println("Legs");
      }
      @Override
      public void move(int speed){
            System.out.print("Dogs move with their ");
            moveWithLegs();
            super.move(5);
      }
}

class InheritanceTest{
      public static void main(String[] args){
            Animal anim = new Animal("Tom", 12, 23, 24);
            Dog dog1 = new Dog("Cruise", 13, 8, 12, "Pug", true);
            System.out.println(dog1.isHealthy());
            System.out.println(dog1.getAge());
            dog1.eat();
            System.out.println(dog1.getName());
            dog1.walk();
            dog1.run();
      }
}