package ua.burdyga._5_di._1_constructor_di;

public class HardDriveBean {
    private String manufacturer;
    private String name;
    private String capacity;
    private String rotationalSpeed;
    private String seekSpeed;
    private String interfaceType;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getRotationalSpeed() {
        return rotationalSpeed;
    }

    public void setRotationalSpeed(String rotationalSpeed) {
        this.rotationalSpeed = rotationalSpeed;
    }

    public String getSeekSpeed() {
        return seekSpeed;
    }

    public void setSeekSpeed(String seekSpeed) {
        this.seekSpeed = seekSpeed;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }

    public void specs() {
        System.out.println("Hard Drive specs.");
    }
}
