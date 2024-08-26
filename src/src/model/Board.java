package model;

public interface Board {
    Board move(Move move);

    Board move();

    Board copy();
    ResultSet isCompleted();


}
