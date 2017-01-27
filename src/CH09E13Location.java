public class CH09E13Location{
	private int row;
	private int column;
	private double maxValue;
	private int[][] coord = new int[row][column];
	
	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	public double getMaxValue() {
		return maxValue;
	}

	public CH09E13Location(int row, int column, double maxValue){
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	public CH09E13Location locateLargest(double[][] a){		
		double maxValue = getMaxValue();
		int row = getRow();
		int column = getColumn();
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				if(a[i][j] > maxValue){
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		CH09E13Location loc = new CH09E13Location(row, column, maxValue);
		return loc;
	}
}