package co.grandcircus;

public class Mesa implements Formation {
   // member variables
    private int height;
    private String name;
    private int area;

    // getters 
    @Override 
    public int getHeight() {
        return height;
    }
    public String getName() {
        return name;
    }
    public int getArea() {
        return area;
    }

    // setters
    public void setHeight(int height) {
        this.height = height;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setArea(int area) {
        this.area = area;
    }

    // constructor 
    public Mesa(int height, String name, int are){
        this.height = height;
        this.name = name;
        this.area = area;
    }

   // overriding getInfo from Formation
   @Override
   public String getInfo(){
       return String.format("%s is a mesa with an elevation of %s feet above sea level and has the surface area of %s square feet.", this.name, this.height, this.area);
   }

    
    
   
  




}
