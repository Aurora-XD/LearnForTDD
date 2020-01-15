import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void should_return_MarsRover_current_position() {
        MarsRover marsRover = new MarsRover(2,3,Direction.N);
        Position position = marsRover.getPosition();
        Assert.assertEquals(2,position.getX());
        Assert.assertEquals(3,position.getY());
    }

    @Test
    public void should_return_MarsRover_current_direction() {
        MarsRover marsRover = new MarsRover(2,3,Direction.N);
        Direction currentDirection = marsRover.getCurrentDirection();
        Assert.assertEquals(Direction.N,currentDirection);
    }

    @Test
    public void should_return_new_position_when_MarsRover_move_one_step() {
        MarsRover marsRover = new MarsRover(2,2,Direction.N);
        marsRover.moveByCommands(Command.M.name());
        Position position = marsRover.getPosition();
        Assert.assertEquals(2,position.getX());
        Assert.assertEquals(3,position.getY());
    }

    @Test
    public void should_not_change_direction_when_MarsRover_move() {
        MarsRover marsRover = new MarsRover(2,2,Direction.N);
        marsRover.moveByCommands(Command.M.name());
        Direction currentDirection = marsRover.getCurrentDirection();
        Assert.assertEquals(Direction.N,currentDirection);
    }

    @Test
    public void should_return_current_direction_when_MarsRover_turn_left_or_right() {
        MarsRover marsRover = new MarsRover(2,3,Direction.N);
        marsRover.moveByCommands(Command.L.name());
        Direction currentDirection1 = marsRover.getCurrentDirection();
        Assert.assertEquals(Direction.W,currentDirection1);

        marsRover.moveByCommands(Command.R.name());
        Direction currentDirection2 = marsRover.getCurrentDirection();
        Assert.assertEquals(Direction.N,currentDirection2);
    }

    @Test
    public void should_return_current_position_and_direction_when_MarsRover_move_by_fix_command() {
        MarsRover marsRover = new MarsRover(2,2,Direction.N);
        String command = "LMMRRMMMR";
        marsRover.moveByCommands(command);
        Assert.assertEquals(3,marsRover.getPosition().getX());
        Assert.assertEquals(2,marsRover.getPosition().getY());
        Assert.assertEquals("S",marsRover.getCurrentDirection().name());
    }
}
