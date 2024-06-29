import java.util.Objects;

public class Laptop {
    private String brand;
    private String modelName;
    private double screenSize;
    private String color;
    private int hardDiskSize;
    private String cpuModel;
    private String operatingSystem;
    private int ramMemorySize;
    private String graphicsCard;
    private double price;

    public Laptop(String brand,
                  String modelName,
                  double screenSize,
                  String color,
                  int hardDiskSize,
                  String cpuModel,
                  String operatingSystem,
                  int ramMemorySize,
                  String graphicsCard,
                  double price) {

        this.brand = brand;
        this.modelName = modelName;
        this.screenSize = screenSize;
        this.color = color;
        this.hardDiskSize = hardDiskSize;
        this.cpuModel = cpuModel;
        this.operatingSystem = operatingSystem;
        this.ramMemorySize = ramMemorySize;
        this.graphicsCard = graphicsCard;
        this.price = price;
    }

    // Геттеры
    public String getBrand() {
        return brand;
    }

    public String getModelName() {
        return modelName;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getColor() {
        return color;
    }

    public int getHardDiscSize() {
        return hardDiskSize;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getRamMemorySize() {
        return ramMemorySize;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }
    public double getPrice(){
        return price;
    }


    //Сеттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHardDiskSize(int hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setRamMemorySize(int ramMemorySize) {
        this.ramMemorySize = ramMemorySize;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setPrice (Double price){
        this.price = price;
    }

    // Еще методы допишу
    //
    // Переопределения методов

    @Override
    public String toString(){
        String res = "Производитель: " + brand + System.lineSeparator()
                +"Модель: " +  modelName + System.lineSeparator()
                +"Диагональ экрана (дюйм): " + screenSize + System.lineSeparator()
                +"Цвет: " + color + System.lineSeparator()
                +"Объем жесткого диска (Гб): " + hardDiskSize + System.lineSeparator()
                +"Тип процессора: " + cpuModel + System.lineSeparator()
                +"Операционная система: " + operatingSystem + System.lineSeparator()
                +"Объем оперативной памяти (Гб): " +  ramMemorySize + System.lineSeparator()
                +"Видеокарта: " + graphicsCard + System.lineSeparator()
                +"Цена: " + price + System.lineSeparator();
        return res;
    }

    @Override
    public int hashCode(){
        return Objects.hash(brand, modelName, screenSize,
                color, hardDiskSize, cpuModel, operatingSystem,
                ramMemorySize, graphicsCard, price);
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Laptop laptop =(Laptop) obj;

        return brand.equals(laptop.brand)
                && modelName.equals(laptop.modelName)
                && screenSize == laptop.screenSize
                && color.equals(laptop.color)
                && hardDiskSize == laptop.hardDiskSize
                && cpuModel.equals(laptop.cpuModel)
                && operatingSystem.equals(laptop.operatingSystem)
                && ramMemorySize == laptop.ramMemorySize
                && graphicsCard.equals(laptop.graphicsCard)
                && price == laptop.price;
    }
}
