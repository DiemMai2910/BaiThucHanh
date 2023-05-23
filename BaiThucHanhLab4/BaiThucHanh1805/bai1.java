package BaiThucHanhLab4.BaiThucHanh1805;

public class bai1 {
        public static void main(String[] args) {
            ArrayList<Integer> arrListInteger = new ArrayList<>();
            Scanner sc = new Scanner(System.in); 
            
            System.out.println("Nhap so phan tu cua ArrayList: ");
            int n = sc.nextInt();
                
            // nhập và thêm phần tử cho ArrayList
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap phan tu thu " + i +": ");
                int number = sc.nextInt();
                arrListInteger.add(number);
            }
            int max = arrListInteger.get(0);    
            
        for (int i = 1; i < arrListInteger.size(); i++) 
        {
            // nếu kết quả của phép so sánh này lớn hơn 0
            // tức biến max nhỏ hơn phần tử tại vị trí thứ i trong ArrayList
            // thì gán max = phần tử tại vị trí i
            // và đó chính là phần tử lớn nhất
            if (arrListInteger.get(i).compareTo(max) > 0) {
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrListInteger = " + max);
    }
}
