/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salary;

/**
 *
 * @author ASUS
 */
public class penggajian {
    // area field atau variabel sifatnya global dlm class penggajian
    private int tunjanganStatus;
    private int tunjanganAnak;
    private int tunjanganMasaKerja;
    private int tunjanganGolongan;
    
    public penggajian () {} //constructor
    public penggajian (String status) {
        setStatus(status);
    }
    public penggajian (String status, String golongan) {
        setStatus(status);
        setGolongan(golongan);
    }
    public penggajian (String status, String golongan, int Masa) {
        setStatus(status);
        setGolongan(golongan);
        setMasaKerja(Masa);
    }
    public penggajian (String status, String golongan, int Masa, int Jumlah) {
        setStatus(status);
        setGolongan(golongan);
        setMasaKerja(Masa);
        setjumlahAnak(Jumlah);
    }
    
    public void setStatus(String status){
        if (status.equals("Menikah")){
            this.tunjanganStatus=1000000;
        }else{
            this.tunjanganStatus=150000;
        }  
    }
    
    public int getTunjStatus(){
        return this.tunjanganStatus;
    }
    
    public void setjumlahAnak(int jumlahAnak){
        if(jumlahAnak == 0){
            this.tunjanganAnak= 0;
        }else if(jumlahAnak <=3){
            this.tunjanganAnak= 500000;
        }else if(jumlahAnak <=6){
            this.tunjanganAnak= 750000;
        }else{
            this.tunjanganAnak = 900000;
        }
    }
    
    public int getTunjAnak(){
        return this.tunjanganAnak;
    }
    
    public void setMasaKerja(int masaKerja){
        if(masaKerja <= 3){
            this.tunjanganMasaKerja= 400000;
        }else if(masaKerja <= 8){
            this.tunjanganMasaKerja= 700000;
        }else{
            this.tunjanganMasaKerja= 1000000;
        }
    }
    
    public int getTunjMasaKerja(){
        return this.tunjanganMasaKerja;
    }
    
    public void setGolongan(String golongan){
        if(golongan.equals("Gol 1")){
            this.tunjanganGolongan= 3500000;
        }else if(golongan.equals("Gol 2")){
            this.tunjanganGolongan= 4000000;
        }else if(golongan.equals("Gol 3")){
            this.tunjanganGolongan= 4500000;
        }else {
            this.tunjanganGolongan= 0;
        }
    }
    
    public int getTunjGolongan(){
        return this.tunjanganGolongan;
    }
    
    public int gajiTotal(){
        return getTunjAnak() + getTunjGolongan() + getTunjMasaKerja() + getTunjStatus();
    }
}
