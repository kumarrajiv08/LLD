package controller;

import constants.DirectionEnum;
import constants.StateEnum;
import elevator.Elevator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorController {

    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;

    Queue<Integer> pendingRequest;


    public Elevator elevator;

    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>((a,b)->b-a);
        pendingRequest = new LinkedList<>();
    }

    public void submitExternalRequest(int floor, DirectionEnum direction){

        if(direction == DirectionEnum.DOWN) {
            if(floor > elevator.currentFloor) pendingRequest.add(floor);
            else downMaxPQ.add(floor);
        } else {
            if(floor < elevator.currentFloor) pendingRequest.add(floor);
            else upMinPQ.add(floor);
        }
        processRequests();
    }

    public void processRequests() {
        if(elevator.stateEnum == StateEnum.IDLE) {
            if(elevator.directionEnum == DirectionEnum.UP) {
                while(!upMinPQ.isEmpty()) {
                    int nextFloor = upMinPQ.poll();
                    elevator.moveUp(nextFloor);
                }
                if(!pendingRequest.isEmpty())upMinPQ.addAll(pendingRequest);
                elevator.directionEnum = DirectionEnum.DOWN;
            } else if(elevator.directionEnum == DirectionEnum.DOWN) {
                while(!downMaxPQ.isEmpty()) {
                    int nextFloor = downMaxPQ.poll();
                    elevator.moveDown(nextFloor);
                }
                elevator.directionEnum = DirectionEnum.UP;
                if(!pendingRequest.isEmpty())upMinPQ.addAll(pendingRequest);
            }
        }
    }







}
