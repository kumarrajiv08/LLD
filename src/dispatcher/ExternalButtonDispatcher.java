package dispatcher;


import constants.DirectionEnum;
import controller.ElevatorController;
import creator.ElevatorCreator;

import java.util.List;

public class ExternalButtonDispatcher {

    List<ElevatorController>  elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitExternalRequest(int floor, DirectionEnum directionEnum){
        for(ElevatorController elevatorController : elevatorControllerList ){
            int elevatorId = elevatorController.elevator.elevatorId;
            if(elevatorId%2 == 0 && floor%2 == 0){
                elevatorController.submitExternalRequest(floor,directionEnum);
            } else if(elevatorId%2 != 0 && floor%2 != 0){
                elevatorController.submitExternalRequest(floor,directionEnum);
            }
        }
    }
}
