package buttons;

import dispatcher.InternalButtonDispatcher;
import elevator.Elevator;

public class InternalButton {

    InternalButtonDispatcher internalButtonDispatcher = new InternalButtonDispatcher();

    void pressButton(int destination, Elevator elevatorCar) {

        internalButtonDispatcher.submitInternalRequest(destination, elevatorCar);
    }


}
