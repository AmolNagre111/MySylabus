package rough;

import dd_util.ExcelReader;

public class TestRunmode {
	
	public static ExcelReader excel= new ExcelReader(System.getProperty("user.dir")+"\\src\\dd_properties\\testData.xlsx");
	// checking runmode Y or N for testcases is executable or not
	public static boolean isExecutable()
	{
	String sheetName = "test_suite";
	
	int rows= excel.getRowCount(sheetName);
	
	for(int rownum=2;rownum<=rows;rownum++)
	{
		if(excel.getCellData(sheetName,"tcid",rownum).equals("LoginTest")){
			if(excel.getCellData(sheetName,"runmode",rownum).equals("Y"))
			{
				return true;
			}else
				return false;
		}
	}
	return false;

}
	public static void main(String[] args) {
		System.out.println(isExecutable());
	}
	}
