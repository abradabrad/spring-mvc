package web.model;

public class Car {
    private int age;
    private String model;
    private int series;

    public Car() {
    }

    public Car(int age, String model, int series) {
        this.age = age;
        this.model = model;
        this.series = series;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}