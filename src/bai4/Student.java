package exercise4;

public class Student {
    private String tenHV;
    private int ageHV;
    private String lopHV;
    private float diemTH;
    private float diemLT;

    public Student() {
    }

    public Student(String tenHV, int ageHV, String lopHV, float diemTH, float diemLT) {
        this.tenHV = tenHV;
        this.ageHV = ageHV;
        this.lopHV = lopHV;
        this.diemTH = diemTH;
        this.diemLT = diemLT;
    }

    public String getTenHV() {
        return tenHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    public int getAgeHV() {
        return ageHV;
    }

    public void setAgeHV(int ageHV) {
        this.ageHV = ageHV;
    }

    public String getLopHV() {
        return lopHV;
    }

    public void setLopHV(String lopHV) {
        this.lopHV = lopHV;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDimeLT(float diemLT) {
        this.diemLT = diemLT;
    }
    public float tinhDiemTB(){
        return  ((diemTH + diemLT) / 2);
    }
    public String toString() {
        return tenHV + " - " + ageHV + " - " + lopHV + " diem Tb : " + tinhDiemTB();
    }
    public void inHV() {
        System.out.print("\n" + tenHV + " " + ageHV + " " + lopHV +  " " + diemTH + " " + diemLT + " " +tinhDiemTB());
//        System.out.printf("%6d %-18s %10s %10.2f %12.2f %12.2f \n", tenHV, ageHV,  lopHV,diemTH, diemLT, tinhDiemTB());
    }
}
