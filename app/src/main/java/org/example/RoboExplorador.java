package org.example;

import java.security.InvalidParameterException;

public class RoboExplorador {
    private String nome;
    private int[] coordenada;
    private int angulo;
    private int bateria;

    public RoboExplorador(String nome, int[] coordenada, int angulo, int bateria) {
        setNome(nome);
        setCoordenada(coordenada);
        setAngulo(angulo);
        setBateria(bateria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String n) {
        if (n == null) throw new InvalidParameterException("Não pode ser nulo");
        this.nome = n;
    }

    public String getCoordenada() {
        String x = String.valueOf(coordenada[0]);
        String y = String.valueOf(coordenada[1]);
        return "Coordenadas: (" + x + "," + y + ")";
    }

    public void setCoordenada(int[] c) {
        if (c == null) throw new InvalidParameterException("Não pode ser nulo");
        if (c.length != 2){
            throw new InvalidParameterException("Devem ser passados apenas 2 valores de coordenadas");
        }
        this.coordenada = c;
    }

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int a) {
        if (a != 0 && a != 45 && a != 90 && a != 135 && a != 180 && a != 225 && a != 280 && a != 325) a = 0;
        this.angulo = a;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int b) {
        if (b < 0 || b > 30){
            this.bateria = 10;
        } else {
            this.bateria = b;
        }
    }

    public void girarDireita(){
        if (this.angulo == 325){
            this.angulo = 0;
        } else {
            this.angulo += 45;
        }
    }
    public void girarEsquerda(){
        if (this.angulo == 0){
            this.angulo = 325;
        } else {
            this.angulo -= 45;
        }
    }
}
