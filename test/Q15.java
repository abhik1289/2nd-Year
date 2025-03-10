class Rational {
    int num; // Numerator
    private int denom; // Denominator

    // Default Constructor (sets fraction to 0/1)
    public Rational() {
        this.num = 0;
        this.denom = 1;
    }

    // Parameterized Constructor
    public Rational(int num, int denom) {
        if (denom == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        this.num = num;
        this.denom = denom;
        simplify();
    }

    // Method to add two Rational numbers
    public Rational add(Rational r) {
        int newNum = this.num * r.denom + r.num * this.denom;
        int newDenom = this.denom * r.denom;
        return new Rational(newNum, newDenom);
    }

    // Method to multiply two Rational numbers
    public Rational mul(Rational r) {
        int newNum = this.num * r.num;
        int newDenom = this.denom * r.denom;
        return new Rational(newNum, newDenom);
    }

    // Method to check if two Rational numbers are equal
    public boolean isEqual(Rational r) {
        return this.num * r.denom == this.denom * r.num;
    }

    // Method to display the Rational number in num/denom format
    public void show() {
        System.out.println(num + "/" + denom);
    }

    // Utility method to simplify the fraction
    private void simplify() {
        int gcd = gcd(num, denom);
        num /= gcd;
        denom /= gcd;
        if (denom < 0) { // Ensure denominator is always positive
            num = -num;
            denom = -denom;
        }
    }

    // Utility method to compute GCD (Greatest Common Divisor)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Main method for testing
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(3, 4);
        System.out.println(r1.num);
        Rational sum = r1.add(r2);
        Rational product = r1.mul(r2);

        System.out.print("Sum: ");
        sum.show(); // Should print 5/4

        System.out.print("Product: ");
        product.show(); // Should print 3/8

        System.out.println("Are r1 and r2 equal? " + r1.isEqual(r2)); // Should print false
    }
}
