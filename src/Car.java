public class Car {
    private String mark;
    private String model;
    private int yar;
    private String country;
    private String wheel;

    public Car(String mark, String model, int yar, String country, String wheel) {
        this.mark = mark;
        this.model = model;
        this.yar = yar;
        this.country = country;
        this.wheel = wheel;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYar() {
        return yar;
    }

    public void setYar(int yar) {
        this.yar = yar;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }
}
