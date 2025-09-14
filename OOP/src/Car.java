public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String ValidModel = model.toLowerCase();
        if (ValidModel.equals("g wagon") || ValidModel.equals("a6")) {
            this.model = model;
        }else
            this.model = "invalid";



    }

    public String getModel() {
        return this.model;
    }

}