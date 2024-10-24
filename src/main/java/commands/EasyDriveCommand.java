package main.java.commands;

import main.java.game.JogoNeedForSpeedTabajara;

public class EasyDriveCommand implements Command {
    private JogoNeedForSpeedTabajara jogo;
    private String direcao;

    public EasyDriveCommand(JogoNeedForSpeedTabajara jogo, String direcao) {
        this.jogo = jogo;
        this.direcao = direcao;
    }

    @Override
    public void execute() {
        jogo.easyDrive(direcao);
    }
}
