/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsolegameencapsulation;

/**
 *
 * @author User
 */
public class MemberPlatinum extends Pelanggan{
        //constructor
    MemberPlatinum(String nama, String jenisMember){
        super(nama, jenisMember);
        
    }
    
    private long hitungPoin(){
        long poin = this.hitungLama() * 10;
        return poin;
    }
    
    private long hitungCashback(){
        long cashback = 10000;
        return cashback;
    }
    
    private long hitungPulsa(){
        long pulsa = this.hitungLama() * 5000;
        return pulsa;
    }
    
    private long hitungDiskon(){
        long diskon = this.hitungSewa() * 3 / 100;
        return diskon;
    }
    
    private long hitungTotalSewa(){
        long total = this.hitungSewa() - this.hitungDiskon();
        return total;
    }
    
    public void printPelanggan(){
        System.out.println("============================== ");
        System.out.println("ID Member       : "+ this.getIdMember());
        System.out.println("Nama Member     : "+ this.getNama());
        System.out.println("Jenis Member    : "+ this.getJenisMember());
        System.out.println("");
        System.out.println("Tanggal Pinjam  : "+ this.setTglPinjam()+"-"+setBlnPinjam()+"-"+getThnPinjam());
        System.out.println("Tanggal Kembali : "+ this.setTglKembali()+"-"+setBlnKembali()+"-"+getThnKembali());
        System.out.println("Lama Sewa       : "+ this.hitungLama()+ " hari");
        System.out.println("");
        System.out.println("Total Sewa      : Rp "+ this.hitungTotalSewa());
        System.out.println("Jumlah Poin     : "+ this.hitungPoin()+ " poin");
        System.out.println("Jumlah Cashback : Rp "+ this.hitungCashback());
        System.out.println("Bonus Pulsa     : "+ this.hitungPulsa());
        System.out.println("============================== ");
    }
    
}
