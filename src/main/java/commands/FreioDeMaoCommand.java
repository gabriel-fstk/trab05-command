package main.java.commands;

import main.java.game.JogoNeedForSpeedTabajara;

public class FreioDeMaoCommand implements Command {
    private JogoNeedForSpeedTabajara jogo;

    public FreioDeMaoCommand(JogoNeedForSpeedTabajara jogo) {
        this.jogo = jogo;
    }

    @Override
    public void execute() {
        jogo.freioDeMao();
    }
}
