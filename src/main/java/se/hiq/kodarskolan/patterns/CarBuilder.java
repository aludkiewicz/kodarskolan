package se.hiq.kodarskolan.patterns;

import se.hiq.kodarskolan.patterns.Tyres.Type;

public class CarBuilder {
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public CarBuilder withSnowTyres() {
        car.setTyres(new Tyres(Type.SNOW));
        return this;
    }
    
    public CarBuilder with180Engine() {
        car.setEngine(new Engine(180));
        return this;
    }
    
    public CarBuilder with270Engine() {
        car.setEngine(new Engine(270));
        return this;
    }
    
    public CarBuilder ofModelV70(){
        car.setType("V70");
        return this;
    }
    
    public CarBuilder ofBrandVolvo() {
        car.setBrand("Volvo");
        return this;
    }
    
    public Car build() {
        return car;
    }

    public CarBuilder withSummerTyres() {
        car.setTyres(new Tyres(Type.SUMMER));
        return this;
    }
}
