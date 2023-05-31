public class Car {
    //public allows other class in any packages to access this class.
    //If we leave it blank, only files in the package can access this class.
    //protected allows classes in the same package, and any subclasses in other packages,
    //to have access to the class.
    //private means that no other class can access this information.

    //class variables need these modifiers (the default is " ")

    //defining default values to the attributes
//    private String make = "Tesla";
//    private String model = "Model X";
//    private String color = "Gray";
//    private int doors = 4;
//    private boolean convertible = true;

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    //getters and setters
    //To generate it automatically
    //we can go to code -> generate -> getter / setter -> select attributes

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    //we can do the same with setters
    //we use this - a special reference name for the object or instance
    //which can be used to describe itself

    public void setMake(String make) {
        //we can add validations
        if (make == null) {
            make = "Unknown";
        }
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "bmw":
            case "porsche":
            case "tesla" :
            case "hyundai":
            case "volkswagen":
            case "nissan":
                this.make = make;
                break;
            default:
                this.make = "Unsupported";
                break;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-door " +
                color + " " +
                make + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
    }
}
