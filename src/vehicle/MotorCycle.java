package vehicle;

public class MotorCycle  extends Vehicle{

    //__THE FIELDS__//
    private double tankSize;
    private int maxSpeed;

    //__CONSTRUCTOR__//
    public MotorCycle(int year, String color, String model, double tankSize, int maxSpeed){
        super(year,color,model);
        this.maxSpeed=maxSpeed;
        this.tankSize=tankSize;
    }

    //__OTHER METHODS__//
    @Override
    public void vehicleInfo(){
        super.vehicleInfo();
        System.out.printf("The tankSize       ==> %S\n" +
                          "The maxSpeed       ==> %S\n",
                this.tankSize, this.maxSpeed );
    }


    //__GET METHODS__//

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getTankSize() {
        return tankSize;
    }
}
