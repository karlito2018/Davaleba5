import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExelidanWakitxva {
    public static List<Car> listLoader() throws IOException {
        Workbook workbook = WorkbookFactory.create(new File("C:/Users/karli/Documents/CarModel.xlsx"));
        List<Car> carList = new ArrayList<>();

        Sheet sheet = workbook.getSheetAt(0);

        for (int rn = 1; rn <= sheet.getLastRowNum(); rn++){
            Row row = sheet.getRow(rn);
            carList.add(new Car(row.getCell(1).getStringCellValue(),
                    row.getCell(2).getStringCellValue(),
                    (int) row.getCell(3).getNumericCellValue(),
                    row.getCell(4).getStringCellValue(),
                    row.getCell(5).getStringCellValue()));
        }
        return carList;
    }
}
