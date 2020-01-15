public class MarsRover {
    private Position position;
    private Direction currentDirection;

    public MarsRover(int x,int y, Direction currentDirection) {
        this.position = new Position(x,y);
        this.currentDirection = currentDirection;
    }

    public Position getPosition() {
        return this.position;
    }
}
