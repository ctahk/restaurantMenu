package restaurant;

public class MenuItem {
    private String category;
    private String name;
    private String description;
    private Double price;
    private boolean isNew;

    public MenuItem(String category, String name, String description, Double price, boolean isNew) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.isNew = isNew;
    }

    public MenuItem(String category, String name, String description, Double price) {
        this(category, name, description, price, true);
    }

    public MenuItem() {}

    public String getCategory () {
        return this.category;
    }
    public void setCategory (String aCategory) {
        this.category = aCategory;
    }

    public String getName () {
        return this.name;
    }
    public void setName (String aName) {
        this.name = aName;
    }

    public String getDescription () {
        return this.description;
    }

    public void setDescription (String aDescription) {
        this.description = aDescription;
    }

    public Double getPrice () {
        return this.price;
    }

    public void setPrice (Double aPrice) {
        this.price = aPrice;
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    public void setIsNew (boolean aIsNew) {
        this.isNew = aIsNew;
    }
}
