public class BenhNhan {
    private String maBN;
    private String hoTen;
    private int tuoi;
    private String benhLy;

    public BenhNhan(String maBN, String hoTen, int tuoi, String benhLy) {
        this.maBN = maBN;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.benhLy = benhLy;
    }

    public void hienThi() {
        System.out.println(
            "Mã BN: " + maBN + " | Họ tên: " + hoTen + " | Tuổi: " + tuoi + " | Bệnh lý: " + benhLy
        );
    }
}
