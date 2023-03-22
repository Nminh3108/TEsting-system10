package com.vti.entity;

public class Position {
    public static Position postion;
    int positionId ;

    public static Position getPostion() {
        return postion;
    }

    public static void setPostion(Position postion) {
        Position.postion = postion;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public PositionName getPositionName() {
        return positionName;
    }

    public void setPositionName(PositionName positionName) {
        this.positionName = positionName;
    }

    PositionName positionName ;
}
