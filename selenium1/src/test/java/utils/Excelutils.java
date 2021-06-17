package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

	public static void main(String[] args) {
		getRowCount();
		getColumnCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1); //as we have opted not to use hardcoaded values
		
	}

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	//we created a constructor
	public Excelutils(String excelPath, String sheetPath) {
		try {
		projectPath = System.getProperty("user.dir");	

		workbook = new XSSFWorkbook(excelPath);

		sheet = workbook.getSheet(sheetPath);
		}
		catch(Exception exp) {
			exp.printStackTrace();
		}
	}
	

	// to find how many rows are there
	public static int getRowCount(){

		int rowCount=0;
		try {
			
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No.of Rows : "+rowCount);
		} 

		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;

	}

	// to find how many columns are there
		public static int getColumnCount(){
			int columnCount=0;

			try {
				
				columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
				System.out.println("No.of columns : "+columnCount);
			} 

			catch(Exception exp) {
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
			return columnCount;

		}

	
	
	// to get data in the cells
	//we are not hard coding values, we need to enter row and columns
	public static String getCellDataString(int rowNum, int columnNum) {

		String cellData=null;
		try {
			
			cellData = sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();

			//System.out.println(cellData);
		}

		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
	}

	public static void getCellDataNumber(int rowNum, int columnNum) {

		try {
			
			double cellData = sheet.getRow(rowNum).getCell(columnNum).getNumericCellValue();

			System.out.println(cellData);
		}

		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	
}
