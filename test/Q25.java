
interface Interest {
    double calInterest(double amount, int yaer);
}

class HDFC implements Interest {
    public double calInterest(double amount, int year) {
        return amount * year * 0.08;
    }
}

class ICICI implements Interest {
    public double calInterest(double amount, int year) {
        return amount * year * 0.07;
    }
}

public class Q25 {

    public static void main() {
    }

}
