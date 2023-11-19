package vehicle;

public class Vehicle {

    ///__THE FIELDS__//
    protected int year;
    protected String color;
    protected String model;


    //__CONSTRUCTOR__//

    public Vehicle(int year, String color, String model){
        this.year= year;
        this.color= color;
        this.model= model;
    }

    //__OTHER METHODS__//

    //public static void vehicleInfo(vehicle.Vehicle vehicle){
    public void vehicleInfo(){
        System.out.printf("Year of manufacture ==> %S\n" +
                          "The vehicle color   ==> %S\n" +
                          "The vehicle model   ==> %S\n",
                          this.year, this.color,this.model );
    }


    //__GET METHODS__//

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

}
