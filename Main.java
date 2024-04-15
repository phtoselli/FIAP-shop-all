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
    private String _name;
    private Double _price;
    private String _description;
    private Number _stock;
    private String _facturer;

    public Product(String nome, double price, String description, Number stock) {
        this._name = nome;
        this._price = price;
        this._description = description;
        this._stock = stock;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        this._price = price;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public Number getStock() {
        return _stock;
    }

    public void setStock(int stock) {
        this._stock = stock;
    }

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