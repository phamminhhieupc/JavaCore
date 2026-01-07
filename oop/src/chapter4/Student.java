package chapter4;

abstract class SinhVien {


    abstract double getScore();

}

class SinhVienIT extends SinhVien {

    private double scoreJava;
    private double scoreHTML;

    public double getScoreJava() {
        return scoreJava;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public double getScoreHTML() {
        return scoreHTML;
    }

    public void setScoreHTML(double scoreHTML) {
        this.scoreHTML = scoreHTML;
    }

    public SinhVienIT(double scoreJava, double scoreHTML) {
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;
    }

    @Override
    double getScore() {
        return (this.scoreJava * 2 + this.scoreHTML) / 3;
    }
}

class SinhVienCoKhi extends SinhVien {
    private double scoreCNC;
    private double scorePLC;

    public double getScoreCNC() {
        return scoreCNC;
    }

    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }

    public double getScorePLC() {
        return scorePLC;
    }

    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }

    public SinhVienCoKhi(double scoreCNC, double scorePLC) {
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    @Override
    double getScore() {
        return (this.scoreCNC + this.scorePLC) / 2;
    }
}

public class Student {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVienIT(10, 9);
        SinhVien sv2 = new SinhVienCoKhi(8, 6);
        System.out.println(sv1.getScore());
        System.out.println(sv2.getScore());

    }


}
