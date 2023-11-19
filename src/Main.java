import vehicle.Car;
import vehicle.Factory;
import vehicle.Vehicle;

import java.util.Scanner;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        Factory factory= new Factory();
        Scanner scanner=new Scanner(System.in);
        String enteredKay;
        int year, maxSpeed;
        String color,model,tiresType, bodyStyle;
        double tankSize;


        do {
            System.out.println("Enter vehicle type (C for Car, M for MotorCycle, X to exit): ");
            enteredKay = scanner.next().toUpperCase();
            switch (enteredKay) {
                case "C":
                    System.out.println("Enter Car details:");
                    System.out.print("Color: ");
                    color = scanner.next();
                    System.out.print("Model: ");
                    model = scanner.next();
                    System.out.print("Year: ");
                    year = scanner.nextInt();
                    System.out.print("Body Style: ");
                    bodyStyle = scanner.next();
                    System.out.print("Tyres Type: ");
                    tiresType = scanner.next();
                    factory.addCar(year,color,model,tiresType,bodyStyle);

                    break;
                case "M":
                    System.out.println("Enter MotorCycle details:");
                    System.out.print("Color: ");
                    color = scanner.next();
                    System.out.print("Model: ");
                    model = scanner.next();
                    System.out.print("Year: ");
                    year = scanner.nextInt();
                    System.out.print("Max Speed: ");
                    maxSpeed = scanner.nextInt();
                    System.out.print("Tank Size: ");
                    tankSize = scanner.nextDouble();
                    factory.addMotorCycle(year,color,model,tankSize,maxSpeed);

                    break;
                case "X":
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.print("Invalid enteredKay... ");
                    break;
            }
        } while (!enteredKay.equals("X"));

          factory.addCar(2010,"red","odi","pro","santafi");
    }

}