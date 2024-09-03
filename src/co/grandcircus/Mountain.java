package co.grandcircus;

public class Mountain implements Formation {
    private int height;
    private String name;

    // getters 
    @Override
    public int getHeight() {
        return height;
    }
    public String getName() {
        return name;
    }

    // setters
    public void setHeight(int height) {
        this.height = height;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    // constructor 
    public Mountain(int height, String name){
        this.height = height;
        this.name = name; 
    }

    // overriding getInfo from Formation
    @Override
    public String getInfo(){
        return String.format("%s is a mountain with an elevation of %s feet above sea level.", this.name, this.height);
    }
   





}
