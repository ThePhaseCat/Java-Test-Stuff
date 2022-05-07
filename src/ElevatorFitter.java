public class ElevatorFitter {

    public static void main(String[] args) {
        var weightOfAPerson = 150;
        var elevatorWeightLimit = 1400;
        var numberOfPeople = elevatorWeightLimit / weightOfAPerson;

        System.out.print("You can fit ");
        System.out.print(numberOfPeople);
        System.out.println(" people on the elevator.");
    }
}
