package main.java.commands;

import main.java.game.JogoNeedForSpeedTabajara;

public class AcelerarCommand implements Command {
    private JogoNeedForSpeedTabajara jogo;

    public AcelerarCommand(JogoNeedForSpeedTabajara jogo) {
        this.jogo = jogo;
    }

    @Override
    public void execute() {
        jogo.acelerar();
    }
}
