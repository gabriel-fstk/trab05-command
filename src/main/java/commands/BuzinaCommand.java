package main.java.commands;

import main.java.game.JogoNeedForSpeedTabajara;

public class BuzinaCommand implements Command {
    private JogoNeedForSpeedTabajara jogo;

    public BuzinaCommand(JogoNeedForSpeedTabajara jogo) {
        this.jogo = jogo;
    }

    @Override
    public void execute() {
        jogo.buzinar();
    }
}
