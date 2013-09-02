package generatePDF;

import com.lowagie.text.DocumentException;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;

public class TableBuilder implements dataForPDF{

	public static PdfPTable createTable() throws DocumentException {

		PdfPTable table = new PdfPTable(5); //5 column
		table.setWidthPercentage(100); // width of the table to 100% of page
		table.setWidths(new float[] { 1f, 1f, 1f, 1f, 1f });

		PdfPCell cell = new PdfPCell(new Phrase("Table in PDF"));

		cell.setColspan(5);
		tableStyle.headerCellStyle(cell);
		table.addCell(cell);

		for(int i = 0; i < LABEL.length;i++){
			table.addCell(labelCell(LABEL[i]));
		}

		for(int i = 0; i < VALUE.length;i++){
			table.addCell(valueCell(VALUE[i]));
		}

		System.out.println("table...");
		return table;
	}

	private static PdfPCell labelCell(String text) {
		PdfPCell cell = new PdfPCell(new Phrase(text));
		tableStyle.labelCellStyle(cell);
		return cell;
	}
	
	private static PdfPCell valueCell(String text) {
		PdfPCell cell = new PdfPCell(new Phrase(text));
		tableStyle.valueCellStyle(cell);
		return cell;
	}

}
