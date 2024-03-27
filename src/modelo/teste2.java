/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhojava.src.modelo;

import modelo.Cliente;

/**
 *
 * @author Laboratorio
 */
public class teste2 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente(15, "fisico", "luis", "122222222");
        Cliente c2 = new Cliente(15, "fisico", "luis", "222222222");
        c1.depositar (500);
        System.out.println(c1.getSaldo());
        c1.transferir(c2, 250);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
    
}
