import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class MarsRover {
    private Position position;
    private Direction currentDirection;

    private static Map<Direction,int[]> moveIndex = ImmutableMap.<Direction,int[]>builder()
            .put(Direction.N,new int[]{0,1})
            .put(Direction.S,new int[]{0,-1})
            .put(Direction.E,new int[]{1,0})
            .put(Direction.W,new int[]{-1,0})
            .build();

    public MarsRover(int x,int y, Direction currentDirection) {
        this.position = new Position(x,y);
        this.currentDirection = currentDirection;
    }

    public Position getPosition() {
        return this.position;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void move() {
        int[] steps = moveIndex.get(currentDirection);
        this.position = new Position(this.position.getX()+steps[0],this.position.getY()+steps[1]);
    }

    public void turn(Command command) {
        if(Command.L.equals(command)){
            this.currentDirection = currentDirection.getLeftDirection();
        }
        if(Command.R.equals(command)){
            this.currentDirection = currentDirection.getRightDirection();
        }
    }

    public void moveByCommands(String fixCommands) {
        String[] commands = fixCommands.split("");
        for (String command : commands) {
            if(Command.M.equals(Command.valueOf(command))){
                this.move();
            }
            if(Command.L.equals((Command.valueOf(command))) || Command.R.equals(Command.valueOf(command))){
                this.turn(Command.valueOf(command));
            }
        }
    }
}
