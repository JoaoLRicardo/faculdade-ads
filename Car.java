public class Car {
    private String engine;
    private String color;
    private String brand;

    public String getEngine() {
        return engine;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public void setEngine(String e) {
        this.engine = e;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public void setBrand(String b) {
        this.brand = b;
    }

    public String toString() {
        return "Car {" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        c1.setEngine("2.0");
        c1.setColor("Blue");
        c1.setBrand("Tesla");

        c2.setEngine("4.0");
        c2.setColor("Red");
        c2.setBrand("Volvo");

        System.out.println("-------------------------");

        System.out.println(c1.getEngine());
        System.out.println(c1.getColor());
        System.out.println(c1.getBrand());

        System.out.println("-------------------------");
        
        System.out.println(c2.getEngine());
        System.out.println(c2.getColor());
        System.out.println(c2.getBrand());
        
        System.out.println("-------------------------");

    }

}
