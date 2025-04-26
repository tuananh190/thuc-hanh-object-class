public class sinh_vien {
    String ho_ten;
    int tuoi;
    String lop;

    public sinh_vien(String ho_ten, int tuoi, String lop) {
        this.ho_ten = ho_ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }
    public void hienthithongtin(){  // đây l 1 contructor ( hàm khởi tạo có tên hienthithongtin và nó có cái void này để thu thông tin và không in gì ra hết
        System.out.println(ho_ten); // đây là câu lệnh sẽ in ra những gì mình muốn trong ngoặc (tôi không biết lý giải nó là gì nữa
        System.out.println(tuoi);
        System.out.println(lop);
        }
    }


