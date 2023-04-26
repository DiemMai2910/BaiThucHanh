package BaiThucHanh.BaiThucHanhLab3.BaiThucHanh2004;

public abstract class DanhBa {
    public String name;
    public String sdt;
    
    public DanhBa(String name, String sdt) {
        this.name = name;
        this.sdt = sdt;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSDT() {
        return sdt;
    }
    
    public void setSDT(String sdt) {
        this.sdt = sdt;
    }
}
