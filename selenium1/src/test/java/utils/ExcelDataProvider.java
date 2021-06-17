package utils;

public class ExcelDataProvider {
	
	public static void main(String[] args) {
		
		String excelPath="/Users/jayadeepy/eclipse-workspace/selenium1/excel/data.xlsx";
		testData(excelPath, "Sheet1");
	}
	
	public static void testData(String excelPath, String sheetPath) {
		
		Excelutils excel = new Excelutils(excelPath,sheetPath);
		
		int rowCount = excel.getRowCount();
		int columnCount = excel.getColumnCount();
		
		// we gave 1 becz to skip header row
		//until the i is less than rowcount
		for(int i=1;i<rowCount;i++) {
			//for column
			for(int j=0;j<columnCount;j++) {
				
				String cellData = excel.getCellDataString(i, j);
				
				System.out.println(cellData+" | ");
			}
			
			System.out.println();
		}
		
	}
	
	

}
