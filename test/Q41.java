
abstract class Address {
    void getAddress(){};

    void setAddress(String address){};
}

class HomeAddress extends Address {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void getAddress() {
        System.out.println(address);
    }
}
class OfficeAddress extends Address {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void getAddress() {
        System.out.println(address);
    }
}
class SchoolAddress extends Address {
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public void getAddress() {
        System.out.println(address);
    }
}
public class Q41 {
    public static void main(String[] args) {
        Address ref;
        ref = new HomeAddress();
        ref.setAddress("Home Address");
        ref.getAddress();   
        ref = new OfficeAddress();
        ref.setAddress("Office Address");
        ref.getAddress();
        ref = new SchoolAddress();
        ref.setAddress("School Address");
        ref.getAddress();
    }
}
