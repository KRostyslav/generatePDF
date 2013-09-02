package generatePDF;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class createPDF implements dataForPDF{

	public static void main(String[] args) {
		try {
			OutputStream file = new FileOutputStream(new File("file.pdf"));
			Document document = new Document();			
			setEncryptionPDF(document, file);
			document.open();
			setAtributePDF(document);
			inputTextPDF(document);
			document.add(TableBuilder.createTable());
			document.close();
			file.close();
			System.out.println("PDF generated!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void setEncryptionPDF(Document document, OutputStream file) throws DocumentException {
		PdfWriter writer = PdfWriter.getInstance(document, file);
		writer.setEncryption(USER_PASS.getBytes(), OWNER_PASS.getBytes(),
				PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);
		System.out.println("password...");
	}

	private static void setAtributePDF(Document document) {
		document.setPageSize(PageSize.A4);
		document.addAuthor(AUTHOR);
		document.addCreationDate();
		document.addCreator(CREATOR);
		document.addTitle(TITLE);
		System.out.println("atribute...");
	}

	private static void inputTextPDF(Document document) throws DocumentException {
		document.add(new Paragraph("First PDF-file"));
		document.add(new Paragraph(new Date().toString()));
		document.add(new Paragraph(" "));
		System.out.println("text...");
	}
	
}
