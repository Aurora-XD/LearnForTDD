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
}
