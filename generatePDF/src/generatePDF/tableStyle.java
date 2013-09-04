package generatePDF;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfPCell;

public class tableStyle {

	public static void headerCellStyle(PdfPCell cell) {
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setBackgroundColor(BaseColor.GRAY);
		cell.setPaddingTop(0f);
		cell.setPaddingBottom(7f);
		cell.setBackgroundColor(new BaseColor(0, 121, 182));
		cell.setBorder(0);
		cell.setBorderWidthBottom(2f);
	}

	public static void labelCellStyle(PdfPCell cell) {
		cell.setHorizontalAlignment(Element.ALIGN_CENTER);
		cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		cell.setPaddingLeft(3f);
		cell.setPaddingTop(0f);
		cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
		cell.setBorder(0);
		cell.setBorderWidthBottom(1);
		cell.setBorderColorBottom(BaseColor.GRAY);
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
