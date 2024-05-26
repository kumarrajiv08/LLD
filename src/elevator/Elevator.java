package elevator;

import buttons.InternalButton;
import constants.DirectionEnum;
import constants.StateEnum;
import display.Display;

public class Elevator {

    public  int elevatorId;
    public  Display display;
    public  int currentFloor;
    public  DirectionEnum directionEnum;
    public  StateEnum stateEnum;
    public  InternalButton internalButton;

    public Elevator(int elevatorId, Display display, int currentFloor, DirectionEnum directionEnum, StateEnum stateEnum, InternalButton internalButton) {
        this.elevatorId = elevatorId;
        this.display = display;
        this.currentFloor = currentFloor;
        this.directionEnum = directionEnum;
        this.stateEnum = stateEnum;
        this.internalButton = internalButton;
    }

    public Elevator(){
        elevatorId = 1;
        display = new Display();
        internalButton = new InternalButton();
        stateEnum = StateEnum.IDLE;
        currentFloor = 0;
        directionEnum = DirectionEnum.UP;
    }

    public void moveUp(int destinationFloor) {
        stateEnum = StateEnum.MOVING;
        directionEnum = DirectionEnum.UP;
        while (currentFloor < destinationFloor) {
            currentFloor++;
            display.showFloor(currentFloor);
            // Check if there are any pending requests to process
           // controller.processRequests();
        }
        stateEnum = StateEnum.IDLE;
    }

    public void moveDown(int destinationFloor) {
        stateEnum = StateEnum.MOVING;
        directionEnum = DirectionEnum.DOWN;
        while (currentFloor > destinationFloor) {
            currentFloor--;
            display.showFloor(currentFloor);
            // Check if there are any pending requests to process
           // controller.processRequests();
        }
        stateEnum = StateEnum.IDLE;
    }

}
