package com.khailpq2004110006.Cuoiky;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KhoHang {
    String loai;
    int maHang;
    String tenHangHoa;
    double giaNhap;
    int soLuongTonKho;  
    Date ngayNhapKho = null;
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy"); 
    Scanner scanner = new Scanner(System.in);

    public KhoHang() {}

    public KhoHang(String l, int m, String t, double g, int s, Date n){ 
        loai = l;
        maHang = m;
        tenHangHoa = t;
        giaNhap = g;
        soLuongTonKho = s;
        ngayNhapKho = n;
    }

    public KhoHang(String l, int m, String t, double g, int s, String ngay){ 
        loai = l;
        maHang = m;
        tenHangHoa = t;
        giaNhap = g;
        soLuongTonKho = s;
        try {
            ngayNhapKho = simpleDateFormat.parse(ngay);

        } catch (Exception e) {
        }
        Date n = ngayNhapKho;
    }
    

    public void nhap(){
        System.out.println("====================");
        System.out.print("Loai: ");
        loai = scanner.nextLine();
        System.out.print("Ma: ");
        maHang = scanner.nextInt();
        System.out.print("Ten: ");
        scanner.nextLine();
        tenHangHoa = scanner.nextLine();
        System.out.print("Gia: ");
        giaNhap = scanner.nextDouble();
        System.out.print("So luong: ");
        soLuongTonKho = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ngay nhap: ");
        try {
            ngayNhapKho = simpleDateFormat.parse(scanner.nextLine());

        } catch (Exception e) {
        }
    }

    void inThongTin(){
         
        System.out.println("Loai: " + loai + "\t" + "|| Ma : "  + maHang + "\t" + "|| Ten: " + tenHangHoa + "\t" + "|| Gia: " + giaNhap + "\t" + "|| So Luong: " + soLuongTonKho + "\t" + "|| Ngay nhap: " +simpleDateFormat.format(ngayNhapKho)); 
              
    }

}
