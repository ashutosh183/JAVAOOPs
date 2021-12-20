class Dog{
      private static String dogName;
      Dog(String dogName){
            Dog.dogName = dogName; //cannot use this with static 
      }

      public void display(){
            System.out.println(dogName);
      }
}


class StaticClass{
      public static void main(String[] args){
            Dog rex = new Dog("rex");
            rex.display();
            Dog fluffy = new Dog("fluffy");
            fluffy.display();


            System.out.println("After changing");
            rex.display();
            fluffy.display();
      }
}