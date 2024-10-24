package main.java.commands;

import main.java.game.JogoNeedForSpeedTabajara;

public class MudarCameraCommand implements Command {
    private JogoNeedForSpeedTabajara jogo;

    public MudarCameraCommand(JogoNeedForSpeedTabajara jogo) {
        this.jogo = jogo;
    }

    @Override
    public void execute() {
        jogo.mudarCamera();
    }
}
