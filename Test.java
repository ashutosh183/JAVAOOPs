class Car{
      private int noOfDoors;
      private String wheelSize;
      private String model;
      private String color;
      private String enginePower;

      public void setModel(String model)
      {
            String validModel = model;
            if(validModel.equals("Porsche 911")){
                  this.model = model;
            }
      }

      public void setEnginePower(String enginePower){
            this.enginePower = enginePower;
      }

      public void setColor(String color){
            this.color = color;
      }

      public void setWheelSize(String wheelSize){
            this.wheelSize = wheelSize;
      }

      public void setNoOfDoors(int noOfDoors){
            this.noOfDoors = noOfDoors;
      }

      public String getModel(){
            return this.model;
      }

      public int getNoOfDoors(){
            return this.noOfDoors;
      }

      public String getEnginePower(){
            return this.enginePower;
      }

      public String getColor(){
            return this.color;
      }

      public String getWheelSize(){
            return this.wheelSize;
      }
}
class Test{
      public static void main(String[] args){
            Car porsche = new Car();
            porsche.setModel("Porsche 911");
            porsche.setEnginePower("1200HP");
            porsche.setColor("Cyan");
            porsche.setWheelSize("71.6mm");
            porsche.setNoOfDoors(2);

            System.out.println(porsche.getModel());
            System.out.println(porsche.getNoOfDoors());
            System.out.println(porsche.getWheelSize());
            System.out.println(porsche.getEnginePower());
            System.out.println(porsche.getColor());
      }
}