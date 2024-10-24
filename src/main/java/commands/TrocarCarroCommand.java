package main.java.commands;

import main.java.game.JogoNeedForSpeedTabajara;

public class TrocarCarroCommand implements Command {
    private JogoNeedForSpeedTabajara jogo;

    public TrocarCarroCommand(JogoNeedForSpeedTabajara jogo) {
        this.jogo = jogo;
    }

    @Override
    public void execute() {
        jogo.trocarCarro();
    }
}
