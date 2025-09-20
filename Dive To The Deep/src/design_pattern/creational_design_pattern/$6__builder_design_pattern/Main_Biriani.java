package design_pattern.creational_design_pattern.$6__builder_design_pattern;

class Biriani{
    private String name;
    private String rice;
    private String meat;
    private String salad;
    private String chili;

    public void setName(String name) {
        this.name = name;
    }
    public void setRice(String rice) {
        this.rice = rice;
    }
    public void setMeat(String meat) {
        this.meat = meat;
    }
    public void setSalad(String salad) {
        this.salad = salad;
    }
    public void setChili(String chili) {
        this.chili = chili;
    }

    public void serve() {
        System.out.println("Name: " + name + '\'' +
                "\nMade with: " +
                "rice='" + rice + '\'' +
                ", meat='" + meat + '\'' +
                ", salad='" + salad + '\'' +
                ", chili='" + chili + "\n");
    }
}


class BirianiBuilder{
    private Biriani biriani = new Biriani();

    public BirianiBuilder addName(String name) {
        biriani.setName(name);
        return this;
    }
    public BirianiBuilder addRice(String rice) {
        biriani.setRice(rice);
        return this;
    }
    public BirianiBuilder addMeat(String meat) {
        biriani.setMeat(meat);
        return this;
    }
    public BirianiBuilder addSalad(String salad) {
        biriani.setSalad(salad);
        return this;
    }
    public BirianiBuilder addChili(String chili) {
        biriani.setChili(chili);
        return this;
    }

    public Biriani buildBiriani() {
        return biriani;
    }

}


// public class
public class Main_Biriani{
    static void main() {
        Biriani kacchi = new BirianiBuilder()
                .addName("Kacchi Biriani")
                .addRice("Poalo")
                .addMeat("Khashi")
                .addSalad("Tomato and Sosha")
                .addChili("Red Chili")
                    .buildBiriani();


        Biriani beaf = new BirianiBuilder()
                .addName("Beaf Biriani")
                .addRice("Bashmoti")
                .addMeat("Beaf")
                .addSalad("Onion")
                    .buildBiriani();

        kacchi.serve();
        beaf.serve();

    }
}