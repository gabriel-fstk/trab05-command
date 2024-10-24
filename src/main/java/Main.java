package main.java;

import main.java.commands.*;
import main.java.controller.ControlePS;
import main.java.game.JogoNeedForSpeedTabajara;

public class Main {
    public static void main(String[] args) {
        JogoNeedForSpeedTabajara jogo = new JogoNeedForSpeedTabajara();

        Command acelerar = new AcelerarCommand(jogo);
        Command freiar = new FreiarCommand(jogo);
        Command nitro = new NitroCommand(jogo);
        Command freioDeMao = new FreioDeMaoCommand(jogo);
        Command buzina = new BuzinaCommand(jogo);
        Command trocarCarro = new TrocarCarroCommand(jogo);
        Command mudarCamera = new MudarCameraCommand(jogo);
        Command menu = new MenuCommand(jogo);
        Command easyDriveUp = new EasyDriveCommand(jogo, "cima");
        Command easyDriveDown = new EasyDriveCommand(jogo, "baixo");
        Command easyDriveLeft = new EasyDriveCommand(jogo, "esquerda");
        Command easyDriveRight = new EasyDriveCommand(jogo, "direita");

        ControlePS controle = new ControlePS();
        controle.setBotaoR2(acelerar);
        controle.setBotaoL2(freiar);
        controle.setBotaoX(nitro);
        controle.setBotaoQuadrado(freioDeMao);
        controle.setBotaoTriangulo(buzina);
        controle.setBotaoCirculo(trocarCarro);
        controle.setBotaoL1(mudarCamera);
        controle.setBotaoStart(menu);
        controle.setSetaCima(easyDriveUp);
        controle.setSetaBaixo(easyDriveDown);
        controle.setSetaEsquerda(easyDriveLeft);
        controle.setSetaDireita(easyDriveRight);

        controle.pressionarR2();
        controle.pressionarL2();
        controle.pressionarX();
        controle.pressionarQuadrado();
        controle.pressionarTriangulo();
        controle.pressionarCirculo();
        controle.pressionarL1();
        controle.pressionarStart();
        controle.pressionarSetaCima();
    }
}
