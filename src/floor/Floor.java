package floor;

import buttons.ExternalButton;

public class Floor {
    public int floorNumber;
    public ExternalButton externalButton;

    public Floor(int floorNumber, ExternalButton externalButton) {
        this.floorNumber = floorNumber;
        this.externalButton = externalButton;
    }
}
