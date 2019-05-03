package ch.lukasakermann.connectfourchallenge.game.contest2019;

import ch.lukasakermann.connectfourchallenge.connectFourService.Game;

public interface ConnectFourStrategy {
    int dropDisc(Game game);

    default void win(Game game) {
    }

    default void loose(Game game) {
    }

    default void draw(Game game) {
    }
}
