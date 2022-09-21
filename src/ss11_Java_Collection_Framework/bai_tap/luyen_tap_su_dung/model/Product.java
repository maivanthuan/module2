package ss11_Java_Collection_Framework.bai_tap.luyen_tap_su_dung.model;

public class Product   {
    private String code;
    private String name;
    private String manufacturer;
    private double price;

    public Product(String code) {
    }

    public Product(String code, String name, String manufacturer, double price) {
        this.code = code;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mã: " + code + " Tên sản phẩm: " + name + " Hãng sản xuất: " + manufacturer + " Giá tiền: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return code == product.code;
    }

}
