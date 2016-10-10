package se.hiq.kodarskolan.patterns;

import se.hiq.kodarskolan.patterns.Tyres.Type;

public class CarMain {
    /*
     * Just a main-method to show how using the patterns would look like code-wise
     */
    public static void main(String[] args) {
        Car car = new Car("Volvo", "V70", new Engine(180), new Tyres(Type.SNOW));
        Car carWithSnowTyres = new Car("Volvo", "V70", new Engine(180), new Tyres(Type.SNOW));
        
        CarBuilder buildCar = new CarBuilder();
        
        Car carWithSummerTyres = buildCar
                        .ofBrandVolvo()
                        .ofModelV70()
                        .with180Engine()
                        .withSummerTyres()
                        .build();
        
        System.out.println(car);
        System.out.println(carWithSnowTyres);
        System.out.println(carWithSummerTyres);
    }
}