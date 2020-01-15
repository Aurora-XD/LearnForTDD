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
        marsRover.move();
        Position position = marsRover.getPosition();
        Assert.assertEquals(2,position.getX());
        Assert.assertEquals(3,position.getY());
    }

    @Test
    public void should_not_change_direction_when_MArsRover_move() {
        MarsRover marsRover = new MarsRover(2,2,Direction.N);
        marsRover.move();
        Direction currentDirection = marsRover.getCurrentDirection();
        Assert.assertEquals(Direction.N,currentDirection);
    }
}
