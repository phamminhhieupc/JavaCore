package chapter4;

abstract class SinhVien {
    protected String id;
    protected String name;
    protected double price;
    protected double tax;

    abstract void tinhDiem();

    public SinhVien(String id, String name, double price, double tax) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public double getPriceTax() {
        return this.price * this.tax;
    }

    public void info() {
        System.out.println("hello");
    }
}

class SinhVienIT extends SinhVien {
    private String language;

    public SinhVienIT(String id, String name, double price, double tax, String language) {
        super(id, name, price, tax);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    void tinhDiem() {

    }
}

class SinhVienCoKhi extends SinhVien {
    private String skill;

    public SinhVienCoKhi(String id, String name, double price, double tax, String skill) {
        super(id, name, price, tax);
        this.skill = skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    @Override
    void tinhDiem() {
        
    }
}

public class Student {
    public static void main(String[] args) {
        SinhVienIT sv = new SinhVienIT("1", "hieu", 10, 0.2, "java");
        System.out.println(sv.getPriceTax());
    }


}
