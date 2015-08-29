package ua.burdyga._2_spring.bean._4_di._1_constructor_di;

public class ComputerBean {
    private String manufacturer;
    private String name;

    private HardDriveBean hardDrive;
    private GraphicsCardBean graphicsCard;
    private CpuBean cpu;

    public ComputerBean(HardDriveBean hardDrive) {
        this.hardDrive = hardDrive;
    }

    public ComputerBean(String manufacturer, String name, HardDriveBean hardDrive, GraphicsCardBean graphicsCard, CpuBean cpu) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.cpu = cpu;
    }

    public ComputerBean(HardDriveBean hardDrive, GraphicsCardBean graphicsCard, CpuBean cpu) {
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.cpu = cpu;
    }


    public void specs() {
        System.out.println("Computer specs.");

        hardDrive.specs();
        if (graphicsCard != null) {
            graphicsCard.specs();
        }
        if (cpu != null) {
            cpu.specs();
        }
    }

}
