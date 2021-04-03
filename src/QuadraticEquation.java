public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant() {
        double delta = this.b*2 - 4*this.a*this.c;
        return delta;
    }
    public void printRoot() {
        if(this.getDiscriminant() >0) {
            System.out.println("r1 = " + ((-1*this.b + Math.pow(Math.pow(this.b, 2) - 4*this.a*this.c, 0.5)) / (2*this.a)));
            System.out.println("r2 = " + ((-1*this.b - Math.pow(Math.pow(this.b, 2) - 4*this.a*this.c, 0.5)) / (2*this.a)));
        } else if (this.getDiscriminant() ==0) {
            System.out.println("r = " + ((-1*this.b) / (2*this.a)));
        } else {
            System.out.println("The equation has no roots");
        }
    }

    public static void main(String[] args) {
        QuadraticEquation quadra1 = new QuadraticEquation(1.0, 3, 1);
        quadra1.printRoot();
        QuadraticEquation quadra2 = new QuadraticEquation(1, 2.0, 1);
        quadra2.printRoot();
    }
}
