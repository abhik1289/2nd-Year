
interface Income {
    void earnings();

    void deductions();

    void bonus(){};
}
class Manager implements Income{
    public void earnings() {
        System.out.println("Manager earnings");
    }
    public void deductions() {
        System.out.println("Manager deductions");
    }
    
}
public class Question3 {
    public static void main() {
    }
}
