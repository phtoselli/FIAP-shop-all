import java.time.LocalDate;

class Facturer {
    private String _name;
    private String _address;
    private String _telephone;

    public Facturer(String name, String address, String telephone) {
        this._name = name;
        this._address = address;
        this._telephone = telephone;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        this._address = address;
    }

    public String getTelephone() {
        return _telephone;
    }

    public void setTelephone(String telephone) {
        this._telephone = telephone;
    }
}

class Product {
    private String _name;
    private double _price;
    private String _description;
    private int _stock;
    private Facturer _facturer;

    public Product(String name, double price, String description, int stock, Facturer facturer) {
        this._name = name;
        this._price = price;
        this._description = description;
        this._stock = stock;
        this._facturer = facturer;
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

    public Facturer getFabricante() {
        return _facturer;
    }

    public void setFabricante(Facturer facturer) {
        this._facturer = facturer;
    }

}

class Eletronic extends Product {
    private String _model;

    public Eletronic(String name, double price, String description, int stock, Facturer facturer, String model) {
        super(name, price, description, stock, facturer);
        this._model = model;
    }

    public String getModel() {
        return _model;
    }

    public void setModelo(String model) {
        this._model = model;
    }
}

class Clothing extends Product {
    private String _size;
    private String _color;
    private String _material;

    public Clothing(String name, double price, String description, int stock, Facturer facturer, String size, String color, String material) {
        super(name, price, description, stock, facturer);
        this._size = size;
        this._color = color;
        this._material = material;
    }

    public String getsize() {
        return _size;
    }

    public void setsize(String size) {
        this._size = size;
    }

    public String getcolor() {
        return _color;
    }

    public void setcolor(String color) {
        this._color = color;
    }

    public String getMaterial() {
        return _material;
    }

    public void setMaterial(String material) {
        this._material = material;
    }
}

class Food extends Product {
    private LocalDate _expiration_date;
    private String _ingredients;

    public Food(String name, double price, String description, int stock, Facturer facturer, LocalDate dataValidade, String ingredients) {
        super(name, price, description, stock, facturer);
        this._expiration_date = dataValidade;
        this._ingredients = ingredients;
    }

    public LocalDate getExpirationDate() {
        return _expiration_date;
    }

    public void setExpirationDate(LocalDate date) {
        this._expiration_date = date;
    }

    public String getIngredients() {
        return _ingredients;
    }

    public void setIngredients(String ingredients) {
        this._ingredients = ingredients;
    }

}

class Drink extends Product {
    private LocalDate _expiration_date;
    private String _ingredients;
    private boolean _alcoholic;
    private double _volume;

    public Drink(String name, double price, String description, int stock, Facturer facturer, boolean alcoholic, double volume) {
        super(name, price, description, stock, facturer);
        this._alcoholic = alcoholic;
        this._volume = volume;
    }

    public LocalDate getExpirationDate() {
        return _expiration_date;
    }

    public void setExpirationDate(LocalDate date) {
        this._expiration_date = date;
    }

    public String getIngredients() {
        return _ingredients;
    }

    public void setIngredients(String ingredients) {
        this._ingredients = ingredients;
    }

    public boolean isAlcoholic() {
        return _alcoholic;
    }

    public void setAlcoolico(boolean alcoholic) {
        this._alcoholic = alcoholic;
    }

    public double getVolume() {
        return _volume;
    }

    public void setVolume(double volume) {
        this._volume = volume;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}