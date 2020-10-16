  
import java.util.Scanner;

class TiketPesawat{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int harga = 0;
		String nama,alamat;
		char tipe;
		int bayar,kembalian;
		boolean loop = true;
		
			
		System.out.print("masukkan nama anda : ");
		nama = input.nextLine();
		System.out.print("masukkan alamat anda : ");
		alamat = input.nextLine();
	
		while(loop){
		System.out.print("masukkan Tipe Pesawat anda(A/B/C) : ");
		tipe = input.next().charAt(0);
		


		
		 switch(tipe){
            case 'A' :
                harga = 5000000;
                System.out.println("harga : "+harga);
                
                loop = false;
                break;
            case 'B' :
               harga = 2000000;
                 System.out.println("harga :" +harga);
                 
                loop= false;
                break;
                case 'C' :
               harga = 1000000;
                 System.out.println("harga :" +harga);
                 
                loop = false;
                break;
            
               default :
                System.out.println("ndak ada pilihan");
               
                
        }
        
	  
	}
	   System.out.print("masukkan Jumlah uang anda : ");
		bayar = input.nextInt();
		
		kembalian =  bayar - harga;
		
		
	   System.out.println("Nama      : "+nama );
	   System.out.println("alamat    : "+alamat);
	   System.out.println("kembalian :" +kembalian);
	    
	   
	    	
	
      
	
		
		
		 
		
	}
}