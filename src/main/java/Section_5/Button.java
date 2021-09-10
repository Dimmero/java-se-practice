package Section_5;

public class Button {
    public int height;
    public int width;
    public String color;
    public boolean isVisible;
    public String text;

    public Button(int height, int width, String text){
        this.height = height;
        this.width = width;
        this.text = text;
    }

    public final void click(int clicks){
       clicks += 2;
        System.out.println("Number of clicks is  " + clicks);
    }
}
