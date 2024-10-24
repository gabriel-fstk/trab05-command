package main.java.commands;

import main.java.game.JogoNeedForSpeedTabajara;

public class NitroCommand implements Command {
    private JogoNeedForSpeedTabajara jogo;

    public NitroCommand(JogoNeedForSpeedTabajara jogo) {
        this.jogo = jogo;
    }

    @Override
    public void execute() {
        jogo.usarNitro();
    }
}
