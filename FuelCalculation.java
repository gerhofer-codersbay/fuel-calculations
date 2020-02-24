/**
 * Version 1:
 * Ein Raumschiff mit Masse X braucht floor(X/3)-2 Liter Sprit um zu fliegen
 * 12 -> 2
 * 14 -> 2
 * 1969 -> 654
 * 100756 -> 33583
 *
 * Da sich durch Zugabe von Sprit unsere Masse ändert müssen wir auch den Sprit für den hinzugegeben Sprit miteinrechnen!
 * 12 -> 2
 * 14 -> 2
 * 1969 -> 966
 * 100756 -> 50346
 */
public class FuelCalculation {
    public static void main(String[] args) {
        System.out.println(calculateFuelRec(12));
        System.out.println(calculateFuelRec(14));
        System.out.println(calculateFuelRec(1969));
        System.out.println(calculateFuelRec(100756));
    }

    private static Integer calculateFuel(Integer mass) {
        return (int) Math.floor(mass / 3.0) - 2;
    }

    private static Integer calculateFuelRec(Integer mass) {
        Integer requiredFuel = calculateFuel(mass);
        if (requiredFuel < 0) {
            return 0;
        }
        System.out.println("requiredFuel: " + requiredFuel);
        Integer requiredFuelForFuel = calculateFuelRec(requiredFuel);
        System.out.println("requiredFuelForFuel: " + requiredFuelForFuel);
        return requiredFuel + requiredFuelForFuel;
    }

}
