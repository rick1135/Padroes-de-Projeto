/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.decorators;

/**
 *
 * @author rick1
 */

public class Demo {
    public static void main(String[] args) {
        String salaryRecords = "Nome,Salário\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("C:\\Users\\rick1\\Documents\\NetBeansProjects\\decorators\\src\\main\\java\\com\\mycompany\\decorators\\out\\OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("C:\\Users\\rick1\\Documents\\NetBeansProjects\\decorators\\src\\main\\java\\com\\mycompany\\decorators\\out\\OutputDemo.txt");

        System.out.println("- Saída ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Codificado --------------");
        System.out.println(plain.readData());
        System.out.println("- Decodificado --------------");
        System.out.println(encoded.readData());
    }
}
