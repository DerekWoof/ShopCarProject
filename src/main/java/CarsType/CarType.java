package CarsType;

public class CarType {

    private String carType;

    public CarType(String carType) {
        this.carType = carType;
    }

    public String getCarType() {
        if (carType.equals("szybkie"))
            return "BMW";
        else if (carType.equals("rodzinne"))
            return "Ford";
        else if (carType.equals("do kościoła"))
            return "Multipla";
        else return "Mercedes";
    }
}
