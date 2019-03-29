
package output;


import java.io.*;
import java.util.*;
import java.lang.reflect.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook; 
import org.apache.poi.ss.usermodel.*;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

/**
 *
 * @author Chernetskyi
 */
public class ExcelOutput {
    public void excelOutput(String fileName, String sheetName, Table outData)
            throws FileNotFoundException, IOException{
        
        File file = new File(fileName);
        
        
        Workbook wb;
        Sheet sheet;
        if(file.exists()){
            FileInputStream fileInp = new FileInputStream(file);
            wb = WorkbookFactory.create(fileInp);
            sheet = wb.createSheet(sheetName);
        }
        else{
            wb = new HSSFWorkbook();
            sheet = wb.createSheet(sheetName);
        }
        
        
        
        Set<Integer> rowKeys = outData.rowKeySet();
        int rownum = 0;
        for(Integer rowKey : rowKeys){
            Row row = sheet.createRow(rownum++);
            Set<String> colKeys = outData.columnKeySet();
            int cellnum = 0;
            for(String colKey : colKeys){
                Cell cell = row.createCell(cellnum++);
                cell.setCellValue((long)outData.get(rowKey, colKey));
            }
        }
        
        FileOutputStream fileOut = new FileOutputStream(fileName);
        wb.write(fileOut);
        fileOut.close();
    }
}
