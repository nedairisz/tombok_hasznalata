package tombokhasznalata;


public class TombokHasznalata {

  
    public static void main(String[] args) {
        //index:
        //pyLista = ["egy", "kettő", "három"]
        String[] tomb ={"egy", "kettő", "három"};
        
        System.out.println("tömb= "+tomb);
        for(int i = 0; i<tomb.length; i++){
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        tomb=new String [4];
        System.out.println("az üres tömb: ");
        for(int i = 0; i<tomb.length; i++){
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        tomb[2]="zwei";
        System.out.println("részben németül feltöltött tömb: ");
        for(int i = 0; i<tomb.length; i++){
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        System.out.println("telsesen angolul feltöltött tömb: ");
        tomb[0]="null";
        tomb[1]="one";
        tomb[2]="two";
        tomb[3]="three";
        
        for(int i = 0; i<tomb.length; i++){
            System.out.printf("[%d. index]=%s\n", i, tomb[i]);
        }
        
        if ("null" == null){
            System.out.println("egyezik");
        }else{
            System.out.println("nem egyezik");
        }
        
        
        String[] nevek = {"Anna", "Béla", "János", "Kata"};
        int[] korok = {65, 76, 182, 43};
        System.out.println("Versenyzők kora");
        int osszKor = 0 ;
        for(int i = 0; i<nevek.length; i++){
            String nev = nevek[i];
            int kor = korok[i];
            osszKor += kor;
            System.out.printf("%10s %3d éves\n", nev, kor);
        }
        double atlag= (double)osszKor / korok.length;
        System.out.printf("a korok átlaga: %.2f év\n", atlag);
    }
    
}
