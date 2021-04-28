




public class Vagone {

	
	private int numPostiOccupati;
	private int numPostiMax;
	private String matricola;
	private int tipoClasse;
   
    /**
     * @param nPostiO 
     * @param nPostiM 
     * @param matr 
     * @param tipoC
     */
	
    public  Vagone(int nPostiO, int nPostiM, String matr, int tipoC) {
        numPostiOccupati=nPostiO;
        numPostiMax=nPostiM;
        matricola=matr;
        tipoClasse=tipoC;
    	
    }

    
    
    public Vagone() {
		
	}



	public void setNumPostiMax(int numPostiMax) {
		this.numPostiMax = numPostiMax;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public void setTipoClasse(int tipoClasse) {
		this.tipoClasse = tipoClasse;
	}


	

   

   

    /**
     * @return
     */
    public int getPostiOcc() {
        // TODO implement here
        return 0;
    }

    /**
     * @param nPosti 
     * @return
     */
    public void setNPosti(int nPosti) {
        // TODO implement here
        numPostiOccupati=nPosti;
    }


	@Override
	public String toString() {
		return "Vagone [numPostiOccupati=" + numPostiOccupati + ", numPostiMax=" + numPostiMax + ", matricola="
				+ matricola + ", tipoClasse=" + tipoClasse + "]";
	}
    
    public static void main(String[] args) {
		Vagone v1= new Vagone(3, 50, "abc", 2);
		Vagone v2=new Vagone();
		System.out.println(v1);
		
		System.out.println(v2);
		v2.setMatricola("qwe");
		System.out.println(v2);
	}

}