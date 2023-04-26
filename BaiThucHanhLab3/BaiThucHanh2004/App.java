package BaiThucHanh.BaiThucHanhLab3.BaiThucHanh2004;

public class App {
   
    public static void main(String[] args) throws Exception {   
       DanhBaAB dv = new DanhBaAB(10);

       dv.Update("Quynh", "0377384777");
       dv.SeachByName("Thoa", "0377827123");
       dv.Delete("Quynh");
    }
} 
