package generatePDF;

import com.lowagie.text.DocumentException;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;

public class TableBuilder {

	public static PdfPTable createTable() throws DocumentException {

		PdfPTable table = new PdfPTable(6);
		table.setWidthPercentage(100);
		table.setWidths(new float[] { 1f, 1f, 1f, 1f, 1f, 1f });

		PdfPCell cell = new PdfPCell(new Phrase("Table in PDF"));

		cell.setColspan(6);
		table.addCell(cell);

		// 1st Row
		table.addCell(createLabelCell("Label 1"));
		table.addCell(createLabelCell("Label 1"));
		table.addCell(createLabelCell("Label 2"));
		table.addCell(createLabelCell("Label 2"));
		table.addCell(createLabelCell("Label 3"));
		table.addCell(createLabelCell("Label 3"));

		// 2nd Row
		table.addCell(createLabelCell("one"));
		table.addCell(createLabelCell("two"));
		table.addCell(createLabelCell("three"));
		table.addCell(createLabelCell("four"));
		table.addCell(createLabelCell("five"));
		table.addCell(createLabelCell("six"));
		System.out.println("table...");
		return table;
	}

	private static PdfPCell createLabelCell(String text) {
		PdfPCell cell = new PdfPCell(new Phrase(text));
		return cell;
	}

}
