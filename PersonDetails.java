class Person{
      private String firstName;
      private String lastName;
      private int age;

      public void setFirstName(String firstName){
            this.firstName = firstName;
      }
      public void setLastName(String lastName){
            this.lastName = lastName;
      }
      public String getFirstName(){
            return this.firstName;
      }
      public String getLastName(){
            return this.lastName;
      }
      public void setAge(int age){
            this.age = age;
      }

      public int getAge(){
            return this.age;
      }
}
class PersonDetails{
      public static void main(String[] args){
            Person ashutosh = new Person();
            ashutosh.setFirstName("Ashutosh");
            ashutosh.setLastName("Pandey");
            ashutosh.setAge(23);

            System.out.println(ashutosh.getFirstName());
            System.out.println(ashutosh.getLastName());
            System.out.println(ashutosh.getAge());
      }
}