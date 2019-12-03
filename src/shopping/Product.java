package shopping;

public class Product {
    private String code;
    private String title;
    private String descripcion;
    private Double price;
    
    public Product(String code, String title, String descripcion, Double price){
        this.code = code;
        this.descripcion = descripcion;
        this.title = title;
        this.price = price;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @return the price
     */
    public Double getPrice() {
        return price;
    }
    
}
