package main.java.commands;

import main.java.game.JogoNeedForSpeedTabajara;

public class MenuCommand implements Command {
    private JogoNeedForSpeedTabajara jogo;

    public MenuCommand(JogoNeedForSpeedTabajara jogo) {
        this.jogo = jogo;
    }

    @Override
    public void execute() {
        jogo.abrirMenu();
    }
}
