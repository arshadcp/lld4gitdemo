//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        cat c = new cat();

        System.out.println(c);
        cat b = new cat("red",4);
        System.out.println(b.colour);
        System.out.println(b.legs);



    }
}