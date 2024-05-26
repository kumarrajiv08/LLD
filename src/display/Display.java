package display;

import constants.DirectionEnum;

public class Display {
    int floor;
    DirectionEnum directionEnum;

    public Display(int floor, DirectionEnum directionEnum) {
        this.floor = floor;
        this.directionEnum = directionEnum;
    }

    public Display() {
        this.floor = 0;
        this.directionEnum = DirectionEnum.UP;
    }

    public int getFloor() {
        return floor;
    }

    public void showFloor(int floor){
        System.out.println("current floor: " + floor);
    }

    public DirectionEnum getDirectionEnum() {
        return directionEnum;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setDirectionEnum(DirectionEnum directionEnum) {
        this.directionEnum = directionEnum;
    }
}
