/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameencapsulation;
import java.util.Scanner;
import java.time.*;

/**
 *
 * @author User
 */
public class Pelanggan {
    private String idMember;
    private String nama;
    private String jenisMember;
    private int tglPinjam;
    private int blnPinjam;
    private int thnPinjam;
    private int tglKembali;
    private int blnKembali;
    private int thnKembali;
    
    //constructor
    Pelanggan(String nama, String jenisMember){
        this.nama = nama;
        this.jenisMember = jenisMember;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public String getJenisMember(){
        return this.jenisMember;
    }
    
    public String getIdMember(){
        return this.idMember;
    }
    
    //jika nilai input lebih besar dari 31 maka akan diconvert ke nilai maks =31
    //jika nilai input kurang dari 0 atau negatif maka akan diconvert ke nilai= 1
    public int setTglPinjam(){
        if(tglPinjam > 31){
            this.tglPinjam = 31;
        }
        else if(tglPinjam > 0){
            this.tglPinjam = tglPinjam;
        }
        else{
            this.tglPinjam = 1;
        }
        return tglPinjam;
    }
    
    public int getTglPinjam(){
        return this.tglPinjam;
    }
    
    //jika nilai input lebih besar dari 31 maka akan diconvert ke nilai maks =12
    //jika nilai input kurang dari 0 atau negatif maka akan diconvert ke nilai= 1
    public int setBlnPinjam(){
        if(blnPinjam > 12){
            this.blnPinjam = 12;
        }
        else if(blnPinjam > 0){
            this.blnPinjam = blnPinjam;
        }
        else{
            this.blnPinjam = 1;
        }
        return blnPinjam;
    }
    
    public int getBlnPinjam(){
        return this.blnPinjam;
    }
    
    public int getThnPinjam(){
        return this.thnPinjam;
    }
    
    //jika nilai input lebih besar dari 31 maka akan diconvert ke nilai maks =31
    //jika nilai input kurang dari 0 atau negatif maka akan diconvert ke nilai= 1
    public int setTglKembali(){
        if(tglKembali > 31){
            this.tglKembali = 31;
        }
        else if(tglKembali > 0){
            this.tglKembali = tglKembali;
        }
        else{
            this.tglKembali = 1;
        }
        return tglKembali;
    }
    
    public int getTglKembali(){
        return this.tglKembali;
    }
    
    //jika nilai input lebih besar dari 31 maka akan diconvert ke nilai maks =12
    //jika nilai input kurang dari 0 atau negatif maka akan diconvert ke nilai= 1
    public int setBlnKembali(){
        if(blnKembali > 12){
            this.blnKembali = 12;
        }
        else if(blnKembali > 0){
            this.blnKembali = blnKembali;
        }
        else{
            this.blnKembali = 1;
        }
        return blnKembali;
    }
    
    public int getBlnKembali(){
        return this.blnKembali;
    }
    
    public int getThnKembali(){
        return this.thnKembali;
    }
    //input id member, 
    //tgl, bln, tahun pinjam
    //tgl, bln, tahun kembali
    public void input(){
       Scanner input = new Scanner(System.in);
       System.out.println("============================== ");
        System.out.print("Masukan ID Member             : ");
        this.idMember = input.nextLine();
        System.out.print("Masukan Tanggal Pinjam (1-31) : ");
        this.tglPinjam = input.nextInt();
        System.out.print("Masukan Bulan Pinjam (1-12)   : ");
        this.blnPinjam = input.nextInt();
        System.out.print("Masukan Tahun Pinjam          : ");
        this.thnPinjam = input.nextInt();
        
        System.out.print("Masukan Tanggal Kembali (1-31): ");
        this.tglKembali = input.nextInt();
        System.out.print("Masukan Bulan Kembali (1-12)  : ");
        this.blnKembali= input.nextInt();
        System.out.print("Masukan Tahun Kembali         : ");
        this.thnKembali= input.nextInt();   

    }
    
    //menghitung lama peminjaman
    public long hitungLama(){
        LocalDate from = LocalDate.of(thnPinjam, setBlnPinjam(), setTglPinjam());
        LocalDate to = LocalDate.of(thnKembali, setBlnKembali(), setTglKembali());
        Period selisih = Period.between(from, to);
        int lama = selisih.getYears() * 365 + selisih.getMonths()*31 
                + selisih.getDays();
        return lama;
    }
    
    
    //menghitung biaya sewa
    public long hitungSewa(){
        long sewa = 0;
        if (this.jenisMember == "Silver"){
            sewa = 25000 * this.hitungLama();
        }
        else if (this.jenisMember == "Gold"){
            sewa = 30000 * this.hitungLama();
        }
        else if (this.jenisMember == "Platinum"){
            sewa = 45000 * this.hitungLama();
        }
        return sewa;
    }
    
    //ouput data pelanggan dan biaya sewa sebelum diskon
    public void printPelanggan(){
        System.out.println("============================== ");
        System.out.println("ID Member       : "+ this.idMember);
        System.out.println("Nama Member     : "+ this.nama);
        System.out.println("Jenis Member    : "+ this.jenisMember);
        System.out.println("");
        System.out.println("Tanggal Pinjam  : "+ this.setTglPinjam()+"-"+setBlnPinjam()+"-"+getThnPinjam());
        System.out.println("Tanggal Kembali : "+ this.setTglKembali()+"-"+setBlnKembali()+"-"+getThnKembali());
        System.out.println("Lama Sewa       : "+ this.hitungLama());
        System.out.println("");
        System.out.println("Total Sewa      : "+ this.hitungSewa());
        System.out.println("============================== ");
    }
}
