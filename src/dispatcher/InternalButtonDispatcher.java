package dispatcher;

import controller.ElevatorController;
import creator.ElevatorCreator;
import elevator.Elevator;

import java.util.List;

public class InternalButtonDispatcher {

    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitInternalRequest(int dest, Elevator elevator) {

    }
}
