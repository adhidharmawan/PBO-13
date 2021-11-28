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
public class MemberSilver extends Pelanggan{
    
    //constructor
    MemberSilver(String nama, String jenisMember){
        super(nama, jenisMember);
        
    }
    
    private long hitungPoin(){
        long poin = this.hitungLama() * 1;
        return poin;
    }
    private long hitungDiskon(){
        long diskon = this.hitungSewa() * 1 / 100;
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
        System.out.println("============================== ");
    }
}
