public enum Direction {
    N("W","E"),
    S("E","W"),
    E("N","S"),
    W("S","N");

    private String left;
    private String right;

    Direction(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public Direction getLeftDirection(){
        return Direction.valueOf(left);
    }

    public Direction getRightDirection(){
        return Direction.valueOf(right);
    }
}
