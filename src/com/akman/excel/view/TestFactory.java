package com.akman.excel.view;

import com.akman.excel.model.Buyer;
import com.akman.excel.model.Invoice;
import com.akman.excel.model.Order;
import com.akman.excel.model.Sender;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author AKL SOFT
 */
public class TestFactory {

    public static java.util.Collection generateCollection(String filePath) {

        final DataFormatter df = new DataFormatter();

        java.util.Vector collection = new java.util.Vector();

        try (FileInputStream file = new FileInputStream(new File(filePath))) {

            DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale

            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.next();

            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                if (cellIterator.hasNext()) {

                    System.out.println("reading cell values");
                    Cell cell0 = row.getCell(0);
                    Cell cell1 = row.getCell(1);
                    Cell cell2 = row.getCell(2);
                    Cell cell3 = row.getCell(3);
                    Cell cell4 = row.getCell(4);
                    Cell cell5 = row.getCell(5);
                    Cell cell6 = row.getCell(6);
                    Cell cell7 = row.getCell(7);
                    Cell cell8 = row.getCell(8);
                    Cell cell9 = row.getCell(9);
                    Cell cell10 = row.getCell(10);
                    Cell cell11 = row.getCell(11);
                    Cell cell12 = row.getCell(12);
                    Cell cell13 = row.getCell(13);
                    Cell cell14 = row.getCell(14);
                    Cell cell15 = row.getCell(15);
                    Cell cell16 = row.getCell(16);
                    Cell cell17 = row.getCell(17);
                    Cell cell18 = row.getCell(18);
                    Cell cell19 = row.getCell(19);
                    Cell cell20 = row.getCell(20);
                    Cell cell21 = row.getCell(21);
                    Cell cell22 = row.getCell(22);
                    Cell cell23 = row.getCell(23);
                    Cell cell24 = row.getCell(24);
                    Cell cell25 = row.getCell(25);
                    Cell cell26 = row.getCell(26);
                    Cell cell27 = row.getCell(27);
                    Cell cell28 = row.getCell(28);
                    Cell cell29 = row.getCell(29);
                    Cell cell30 = row.getCell(30);
                    Cell cell31 = row.getCell(31);
                    Cell cell32 = row.getCell(32);
                    
                    String InvoiceNo = (isCellEmpty(row.getCell(0))) ? "" : formatter.formatCellValue(cell0);
                    String OrderNo = (isCellEmpty(row.getCell(1))) ? "" : formatter.formatCellValue(cell1);
                    String Date = (isCellEmpty(row.getCell(2))) ? "" : formatter.formatCellValue(cell2);
                    String TinNo = (isCellEmpty(row.getCell(3))) ? "" : formatter.formatCellValue(cell3);
                    String RefNo = (isCellEmpty(row.getCell(4))) ? "" : formatter.formatCellValue(cell4);
                    String CountryOrigin = (isCellEmpty(row.getCell(5))) ? "" : formatter.formatCellValue(cell5);
                    String MOP = (isCellEmpty(row.getCell(6))) ? "" : formatter.formatCellValue(cell6);
                    String PaymentTerm = (isCellEmpty(row.getCell(7))) ? "" : formatter.formatCellValue(cell7);
                    String TrakingNo = (isCellEmpty(row.getCell(8))) ? "" : formatter.formatCellValue(cell8);
                    String SenderName = (isCellEmpty(row.getCell(9))) ? "" : formatter.formatCellValue(cell9);
                    String SenderAdd1 = (isCellEmpty(row.getCell(10))) ? "" : formatter.formatCellValue(cell10);
                    String SenderAdd2 = (isCellEmpty(row.getCell(11))) ? "" : formatter.formatCellValue(cell11);
                    String SenderAdd3 = (isCellEmpty(row.getCell(12))) ? "" : formatter.formatCellValue(cell12);
                    String SenderCity = (isCellEmpty(row.getCell(13))) ? "" : formatter.formatCellValue(cell13);
                    String SenderState = (isCellEmpty(row.getCell(14))) ? "" : formatter.formatCellValue(cell14);                    
                    String SenderPinCode = (isCellEmpty(row.getCell(15))) ? "" : formatter.formatCellValue(cell15);
                    String SenderPhoneNo = (isCellEmpty(row.getCell(16))) ? "" : formatter.formatCellValue(cell16);
                    String SenderCountry = (isCellEmpty(row.getCell(17))) ? "" : formatter.formatCellValue(cell17);
                    String BuyerName = (isCellEmpty(row.getCell(18))) ? "" : formatter.formatCellValue(cell18);
                    String BuyerAdd1 = (isCellEmpty(row.getCell(19))) ? "" : formatter.formatCellValue(cell19);
                    String BuyerAdd2 = (isCellEmpty(row.getCell(20))) ? "" : formatter.formatCellValue(cell20);
                    String BuyerAdd3 = (isCellEmpty(row.getCell(21))) ? "" : formatter.formatCellValue(cell21);
                    String BuyerCity = (isCellEmpty(row.getCell(22))) ? "" : formatter.formatCellValue(cell22);
                    String BuyerState = (isCellEmpty(row.getCell(23))) ? "" : formatter.formatCellValue(cell23);
                    String BuyerPinCode = (isCellEmpty(row.getCell(24))) ? "" : formatter.formatCellValue(cell24);
                    String BuyerPhoneNo = (isCellEmpty(row.getCell(25))) ? "" : formatter.formatCellValue(cell25);
                    String BuyerCountry = (isCellEmpty(row.getCell(26))) ? "" : formatter.formatCellValue(cell26);
                    String Pakegetype = (isCellEmpty(row.getCell(27))) ? "" : formatter.formatCellValue(cell27);
                    Double Quantity = (isCellEmpty(row.getCell(28))) ? 0 : row.getCell(28).getNumericCellValue();
                    Double Rate = (isCellEmpty(row.getCell(29))) ? 0 : row.getCell(29).getNumericCellValue();
                    String Description = (isCellEmpty(row.getCell(30))) ? "" : formatter.formatCellValue(cell30);
                    String CatagoryItem = (isCellEmpty(row.getCell(31))) ? "" : formatter.formatCellValue(cell31);
                    String Catagory = (isCellEmpty(row.getCell(32))) ? "" : formatter.formatCellValue(cell32);

                    Sender sender = new Sender(SenderName, SenderAdd1, SenderAdd2, SenderAdd3, SenderCity, SenderState, SenderPinCode, SenderPhoneNo, SenderCountry);

                    Buyer buyer = new Buyer(BuyerName, BuyerAdd1, BuyerAdd2, BuyerAdd3, BuyerCity, BuyerState, BuyerPinCode, BuyerPhoneNo, BuyerCountry);

                    Order order = new Order(Pakegetype, Quantity, Rate, Description);

                    Invoice invoice = new Invoice(InvoiceNo, OrderNo, Date, TinNo,
                            RefNo, CountryOrigin, sender, buyer, order, MOP, PaymentTerm, TrakingNo, CatagoryItem, Catagory);

                    collection.add(invoice);

                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

            e.printStackTrace();
        }

        return collection;
    }

    /**
     * Checks if the value of a given {@link Cell} is empty.
     *
     * @param cell The {@link Cell}.
     * @return {@code true} if the {@link Cell} is empty. {@code false}
     * otherwise.
     */
    public static boolean isCellEmpty(final Cell cell) {
        if (cell == null || cell.getCellType() == Cell.CELL_TYPE_BLANK) {
            return true;
        }

        return cell.getCellType() == Cell.CELL_TYPE_STRING && cell.getStringCellValue().isEmpty();
    }

}
