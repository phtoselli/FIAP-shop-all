/*
Cadastro de Produto Eletrônico:
modelo.

Cadastro de Produto de Vestuário:
tamanho, cor e material.

Cadastro de Produto Alimentício:
data de validade e ingredientes.

Cadastro de Bebida:
data de validade, ingredientes, alcoólico (se é ou não) e volume.

O fabricante deve conter o nome, endereço e um telefone de contato.
*/

import java.text.DateFormat;

class Product {
    String name;
    Float price;
    String description;
    String stock;
    String facturer;
}

class facturer {
    String name;
    String address;
    String telephone;
}

class Eletronic extends Product {
    String model;
}

class Clothing extends Product {
    String size;
    String color;
    String material;
}

class Food extends Product {
    DateFormat expiration_date;
    String ingredients;
}

class Drink extends Product {
    DateFormat expiration_date;
    String ingredients;
    Boolean alcoholic;
    Number volume;
}

public class Main {
    public static void main(String[] args) {

    }
}