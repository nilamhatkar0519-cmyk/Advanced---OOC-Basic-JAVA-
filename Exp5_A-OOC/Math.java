class Operations {
    void show(double n) {
        System.out.println("Floor: " + java.lang.Math.floor(n));
        System.out.println("Ceil: " + java.lang.Math.ceil(n));
        System.out.println("Round: " + java.lang.Math.round(n));
    }
}

public class Math {
     public static void main(String[] args) {
        Operations op = new Operations();
        op.show(10.651);
    }
}
