package main.java.controller;

import main.java.commands.Command;

public class ControlePS {
    private Command botaoR2;
    private Command botaoL2;
    private Command botaoX;
    private Command botaoQuadrado;
    private Command botaoTriangulo;
    private Command botaoCirculo;
    private Command botaoL1;
    private Command botaoStart;
    private Command setaCima;
    private Command setaBaixo;
    private Command setaEsquerda;
    private Command setaDireita;

    public void setBotaoR2(Command acelerar) { this.botaoR2 = acelerar; }
    public void setBotaoL2(Command comando) { this.botaoL2 = comando; }
    public void setBotaoX(Command comando) { this.botaoX = comando; }
    public void setBotaoQuadrado(Command comando) { this.botaoQuadrado = comando; }
    public void setBotaoTriangulo(Command comando) { this.botaoTriangulo = comando; }
    public void setBotaoCirculo(Command comando) { this.botaoCirculo = comando; }
    public void setBotaoL1(Command comando) { this.botaoL1 = comando; }
    public void setBotaoStart(Command comando) { this.botaoStart = comando; }
    public void setSetaCima(Command comando) { this.setaCima = comando; }
    public void setSetaBaixo(Command comando) { this.setaBaixo = comando; }
    public void setSetaEsquerda(Command comando) { this.setaEsquerda = comando; }
    public void setSetaDireita(Command comando) { this.setaDireita = comando; }

    public void pressionarR2() { botaoR2.execute(); }
    public void pressionarL2() { botaoL2.execute(); }
    public void pressionarX() { botaoX.execute(); }
    public void pressionarQuadrado() { botaoQuadrado.execute(); }
    public void pressionarTriangulo() { botaoTriangulo.execute(); }
    public void pressionarCirculo() { botaoCirculo.execute(); }
    public void pressionarL1() { botaoL1.execute(); }
    public void pressionarStart() { botaoStart.execute(); }
    public void pressionarSetaCima() { setaCima.execute(); }
    public void pressionarSetaBaixo() { setaBaixo.execute(); }
    public void pressionarSetaEsquerda() { setaEsquerda.execute(); }
    public void pressionarSetaDireita() { setaDireita.execute(); }
}
