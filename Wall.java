class WallArea{
      private double height;
      private double width;
      WallArea(double width, double height){
            setWidth(width);
            setHeight(height);
            width = getWidth();
            height = getHeight();
      }
      public void setWidth(double width){
            if(width < 0){
                  width = 0.0d;
            }
            else{
                  this.width = width;
            }
      }
      public void setHeight(double height){
            if(height < 0){
                  height = 0.0d;
            }
            else{
                  this.height = height;
            }
      }
      public double getHeight(){
            return this.height;
      }
      public double getWidth(){
            return this.width;
      }
      public double calculateArea(){
            return this.width * this.height;
      }
}

class Wall{
      public static void main(String[] args){
            WallArea wall1 = new WallArea(-1.9, -2.3);
            System.out.println(wall1.calculateArea());
      };
}