
import java.util.*;

/**
 * versione 1 gitHub
 */
public class Treno {

   
    private Vagone[] listaVagoni;

    
    private int numVagPresenti;

    /**
     * 
     */
    private String nomeTreno;


    /**
     * @param nomeTr 
     * @param nVagMax
     */
    public  Treno(String nomeTr, int nVagMax) {
       listaVagoni= new Vagone[nVagMax];
    	nomeTreno=nomeTr;
    	numVagPresenti=0;
       
    }
   

  

    /**
     * @param vag 
     * @return
     */
    public boolean addVagone(Vagone vag) {
       listaVagoni[numVagPresenti]=vag;
       numVagPresenti++;
    	
        return false;
    }

    /**
     * @param nPostiO 
     * @param nPostiM 
     * @param matr 
     * @param tipoC 
     * @return
     */
    public boolean addVagone(int nPostiO, int nPostiM, String matr, int tipoC) {
        // TODO implement here
        return false;
    }

  

    /**
     * @param matricola 
     * @return
     */
    public boolean eliminaVagone(String matricola) {
        // TODO implement here
        return false;
    }




	@Override
	public String toString() {
		return "Treno [listaVagoni=" + Arrays.toString(listaVagoni) + ", numVagPresenti=" + numVagPresenti
				+ ", nomeTreno=" + nomeTreno + "]";
	}
    
	public static void main(String[] args) {
		Treno t1 = new Treno("milano", 10);
		Vagone v1= new Vagone(3, 50, "abc", 2);
		t1.addVagone(v1);
		System.out.println(t1);
	}

}