package ua.burdyga._5_di._3_inner_beans;

public class EngineBean {
    private String manufacturer;
    private String horsePower;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "EngineBean{" +
                "manufacturer='" + manufacturer + '\'' +
                ", horsePower='" + horsePower + '\'' +
                '}';
    }
}
