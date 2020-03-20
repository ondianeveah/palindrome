package ThursdayHomework;

public class Button {
    public String label;
    public String color;

    public Button(String label, String color){
        this.label = label;
        this.color = color;
    }
    public void setColor(){
        System.out.println("Button color is" + color);
    }
    public void setLabel(){
        System.out.println("Button label is" + label);
    }

}
