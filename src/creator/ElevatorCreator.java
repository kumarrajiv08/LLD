package creator;

import controller.ElevatorController;
import elevator.Elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCreator {

    public static List<ElevatorController> elevatorControllerList = new ArrayList<>();
    static {

        Elevator elevatorCar1 = new Elevator();
        elevatorCar1.elevatorId=1;
        ElevatorController controller1 = new ElevatorController(elevatorCar1);

        Elevator elevatorCar2 = new Elevator();
        elevatorCar1.elevatorId =2;
        ElevatorController controller2 = new ElevatorController(elevatorCar2);

        elevatorControllerList.add(controller1);
        elevatorControllerList.add(controller2);
    }

}
