import building.Building;
import buttons.ExternalButton;
import constants.DirectionEnum;
import floor.Floor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Floor firstFloor = new Floor(1,new ExternalButton());
        Floor secondFloor = new Floor(2,new ExternalButton());
        Floor thirdFloor = new Floor(3,new ExternalButton());
        Floor fourthFloor = new Floor(4,new ExternalButton());
        Floor fifthFloor = new Floor(5,new ExternalButton());
        Floor sixthFloor = new Floor(6,new ExternalButton());
        List<Floor> listOfFloors = List.of(firstFloor,secondFloor,thirdFloor,fourthFloor,fifthFloor,sixthFloor);

        Building building = new Building(listOfFloors);
        building.floor.get(0).externalButton.pressButton(4,DirectionEnum.UP);

        building.floor.get(4).externalButton.pressButton(2,DirectionEnum.DOWN);
    }
}