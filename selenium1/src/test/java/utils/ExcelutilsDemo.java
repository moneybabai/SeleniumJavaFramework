package utils;

public class ExcelutilsDemo {
	
	//we demonstrated that we ca use excelutils in any class in our entire selenium1 project

	public static void main(String[] args) {
	
		String projectPath = System.getProperty("user.dir");	
		Excelutils excel = new Excelutils(projectPath+"/excel/data.xlsx", "Sheet1");
		
		
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 1);
	}
	
}
