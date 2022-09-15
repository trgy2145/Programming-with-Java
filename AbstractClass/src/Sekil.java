
public abstract class Sekil {
	private String isim;
	
  public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

public Sekil(String isim) {
	  this.isim = isim;
	  
  }
  
 

public void ismini_söyle() {
	  System.out.println("bu obje " + isim + "objesidr");
  }
  abstract void alanHesapla(); // abstract method gövdesiz etod alt sınıflar muhakkak tanımlamalı
}
