
interface Salary {
    double earnings();

    double deduction();

    double bonus();
}

class Technical {
    int techId;
    double baseSal;

    Technical(int techId, double baseSal) {
        this.techId = techId;
        this.baseSal = baseSal;
    }

    public double earnings() {
        return baseSal + (.4 * baseSal);
    }

    public double deduction() {
        return (.1 * baseSal);
    }
}

class NonTechnical extends Technical implements Salary {

    NonTechnical(int techId, double baseSal) {
        super(techId, baseSal);
    }

    public double bonus() {
        return (.05 * baseSal);
    }

    public double totalEarning() {
        return super.earnings() - super.deduction() + this.bonus();
    }

}

public class Q6 {

    public static void main(String args[]) {

        NonTechnical nt = new NonTechnical(12, 12000.00);
        System.out.println(nt.totalEarning());

    }

}
