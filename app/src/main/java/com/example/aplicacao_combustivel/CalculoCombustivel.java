package com.example.aplicacao_combustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Scanner;

public class CalculoCombustivel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Calculador de Combustível!");
        System.out.println("Digite o preço da Gasolina por litro: ");
        double precoGasolina = scanner.nextDouble();

        System.out.println("Digite o preço do Álcool por litro: ");
        double precoAlcool = scanner.nextDouble();

        double vantagemAlcool = precoAlcool / precoGasolina;

        if (vantagemAlcool < 0.7) {
            System.out.println("\nRecomendação: Abasteça com Álcool.");
        } else {
            System.out.println("\nRecomendação: Abasteça com Gasolina.");
        }

        scanner.close();
    }
}