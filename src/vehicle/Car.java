package vehicle;

public class Car extends Vehicle{

    //__THE FIELDS__//
    private String tiresType;
    private String bodyStyle;

    //__CONSTRUCTOR__//
    public Car(int year, String color, String model, String tiresType,String bodyStyle){
        super(year,color,model);
        this.bodyStyle=bodyStyle;
        this.tiresType= tiresType;

    }

    //__OTHER METHODS__//
    @Override
    public void vehicleInfo(){
        super.vehicleInfo();
        System.out.printf("The tiresType       ==> %S\n" +
                          "The bodyStyle       ==> %S\n",
                this.tiresType, this.bodyStyle );
    }

    //__GET METHODS__//

    public String getTiresType() {
        return tiresType;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }
}

