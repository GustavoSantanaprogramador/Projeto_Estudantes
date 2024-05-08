/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_export_tabuada;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;




/**
 *
 * @author gusta_cnviuot
 */
public class Projeto_Export_tabuada {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        int valorUsuario = 0;
        String nomeArquivo = "";
        Date date = new Date();
        String  localSalvo = "";
        
        System.out.println("----------------TABUADA--------------");
        System.out.println("\n Informe um nome para o arquivo: ");
        nomeArquivo = sc.next();
        sc.nextLine();
        
        System.out.print("\nInformo um luugar para salvar o arquivo: ");
        localSalvo = sc.next();
        sc.nextLine();        
        FileWriter arquivo = new FileWriter(localSalvo + nomeArquivo + ".txt");
        PrintWriter escrever = new PrintWriter(arquivo);
        
        escrever.printf("Tabuada do "+ valorUsuario +  "|" + date + "\n"); //printf , pois será necesario para imprimir dados no txt
        escrever.printf("---------------");
        
        for (int i = 1; 1<= 10; i++){
            escrever.printf("\n" + i + "x" + valorUsuario + "=" + (i * valorUsuario));
            
        }
        escrever.printf("\n-----------------");
        arquivo.close();
       
    }
    
}
