package generatePDF;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class createPDF implements dateForPDF{

	public static void main(String[] args) {

		try {
			OutputStream file = new FileOutputStream(new File("file.pdf"));
			Document document = new Document();
			setEncryptionPDF(document, file);
			document.open();
			setAtributePDF(document);
			inputTextPDF(document);
			document.close();
			file.close();
			System.out.println("PDF generated!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void setEncryptionPDF(Document document, OutputStream file) throws DocumentException {
		PdfWriter writer = PdfWriter.getInstance(document, file);
		writer.setEncryption(USER_PASS.getBytes(), OWNER_PASS.getBytes(),
				PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);
		System.out.println("password..");
	}

	public static void setAtributePDF(Document document) {
		document.addAuthor(AUTHOR);
		document.addCreationDate();
		document.addCreator(CREATOR);
		document.addTitle(TITLE);
		System.out.println("Atribute...");
	}

	public static void inputTextPDF(Document document) throws DocumentException {
		document.add(new Paragraph("First PDF-file"));
		document.add(new Paragraph(new Date().toString()));
		System.out.println("text...");
	}
	
}
