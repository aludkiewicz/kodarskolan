package se.hiq.kodarskolan.patterns;

import se.hiq.kodarskolan.patterns.Tyres.Type;

public class Car {
    
    private String brand;
    private String type;
    private Engine engine;
    private Tyres tyres;
    
    
    /*
     * Getters and setters
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
    
    /*
     * To demonstrate the Builder-pattern
     */
    public Car() {
        /*
         * Some sensible defaults could go here, e.g. giving the Car a default engine & tyres
         */
    }

    /*
     * To demonstrate the factory-pattern
     */
    public Car(String brand, String type, Engine engine, Tyres tyreType) {
        
    }
    
    public static Car aCarWithSnowTyres() {
        return new Car("Volvo", "V70", new Engine(180), new Tyres(Type.SNOW));
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", type=" + type + ", engine=" + engine + ", tyres=" + tyres + "]";
    }
    
    
    
}
