package generatePDF;

import java.awt.Color;

import com.lowagie.text.Element;
import com.lowagie.text.pdf.PdfPCell;

public class tableStyle {

	public static void headerCellStyle(PdfPCell cell) {
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setBackgroundColor(Color.GRAY);
		cell.setPaddingTop(0f);
		cell.setPaddingBottom(7f);
		cell.setBackgroundColor(new Color(0, 121, 182));
		cell.setBorder(0);
		cell.setBorderWidthBottom(2f);
	}

	public static void labelCellStyle(PdfPCell cell) {
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setPaddingLeft(3f);
		cell.setPaddingTop(0f);
		cell.setBackgroundColor(Color.LIGHT_GRAY);
		cell.setBorder(0);
		cell.setBorderWidthBottom(1);
		cell.setBorderColorBottom(Color.GRAY);
		cell.setMinimumHeight(15f);
	}

	public static void valueCellStyle(PdfPCell cell) {
		cell.setHorizontalAlignment(Element.ALIGN_LEFT);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setPaddingTop(0f);
		cell.setPaddingBottom(5f);
		cell.setBorder(0);
		cell.setBorderWidthBottom(0.5f);
		cell.setMinimumHeight(15f);
	}

}
