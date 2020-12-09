
public class BilletTrain {

	public static final float[] DISTANCE = {2F, 25F, 50F, 100F, 150F, 300F,Float.MAX_VALUE};
	public static final int[] BAREMEBORD = {10, 15, 25, 35, 60, 90};
	public static final int[] BAREMECONTROLE = {50, 50, 50, 50, 90, 120};


	private float Distance;
	private boolean Abord;

	public BilletTrain(float distance)throws IllegalArgumentException {
		if(distance<=2F) {
			throw new IllegalArgumentException(" c méchant");
		}
		this.Distance=distance;		
	}


	public int getTarif(boolean b) {
		return getTarifAvecTable(b ? BAREMEBORD : BAREMECONTROLE );
	}

	public int getTarifAvecTable(int[] tableTarif) {


		for(int i=0;i<DISTANCE.length;i++) {
			if(Distance<DISTANCE[i+1]) {
				return tableTarif[i];
			}
			
		}
		return tableTarif[0];
		
	}	

}
