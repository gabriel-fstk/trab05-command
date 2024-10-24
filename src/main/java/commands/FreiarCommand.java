package main.java.commands;

import main.java.game.JogoNeedForSpeedTabajara;

public class FreiarCommand implements Command {
    private JogoNeedForSpeedTabajara jogo;

    public FreiarCommand(JogoNeedForSpeedTabajara jogo) {
        this.jogo = jogo;
    }

    @Override
    public void execute() {
        jogo.freiar();
    }
}
