public class Main {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.describeCar();
//        fields on classes are assigned default values, intrinsically by Java,
//         if not assigned explicitly
//        boolean - false
//        byte, short, int, long, char, double, float - 0 (0.0)
//        rest - null
//        when we assign default values, they are the ones that will appear instead of the
//        assigned default values.

        Car car2 = new Car();
//        car2.make = "Porsche";
//        car2.model = "Carrera";
//        car2.color = "Red";
//        We can't do this because the attributes are private. So, we have no access to them
//        To do that, we use getters and setters
        //instead, we can do this:
        car2.setMake("Porsche");
        car2.setModel("Carrera");
        car2.setColor("Red");
        car2.setDoors(2);
        car2.setConvertible(true);
        car2.describeCar();

        //With the new conditionals added to the setter method, this happens:
        Car car3 = new Car();
        car3.setMake("Fiat");
        car3.setModel("Palio");
        car3.setColor("White");
        car3.setDoors(4);
        car3.setConvertible(false);
        car3.describeCar();

        Car car4 = new Car();
        car4.setMake(null);
        car4.setModel("Fusca");
        car4.setColor("Black");
        car4.setDoors(2);
        car4.setConvertible(false);
        car4.describeCar();
    }
}
