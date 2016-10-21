package fcu.iecs.oop.tiida;


public class NissanTiida {
	public int k;
	public void tiida(){
		int i,j;
		k++;
		for(j=1;j<=k;j++){
			for(i=1;i<=k;i++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
