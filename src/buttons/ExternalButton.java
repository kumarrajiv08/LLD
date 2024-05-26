package buttons;

import constants.DirectionEnum;
import dispatcher.ExternalButtonDispatcher;

public class ExternalButton {

    ExternalButtonDispatcher externalButtonDispatcher = new ExternalButtonDispatcher();

    public void pressButton(int floor, DirectionEnum directionEnum) {
        externalButtonDispatcher.submitExternalRequest(floor,directionEnum);
    }
}
