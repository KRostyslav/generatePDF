package generatePDF;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.Date;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class createPDF implements dataForPDF {

	public static void main(String[] args) {
		try {
			OutputStream file = new FileOutputStream(new File("file.pdf"));
			Document document = new Document();
			PdfWriter writer = PdfWriter.getInstance(document, file);

	//		setEncryptionPDF(document);
			document.open();
			setAtributePDF(document); // set atribute in pdf
			inputTextPDF(document); // input text in pdf
			document.add(TableBuilder.createTable()); // input table in pdf
			inputImagePdf(document); // input image in pdf
			document.close();
			file.close();
			System.out.println("PDF generated!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void inputImagePdf(Document document)
			throws BadElementException, MalformedURLException, IOException {
		Image jpg = Image.getInstance("images.jpg");
		try {
			document.add(jpg);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		System.out.println("image...");
	}

//	private static void setEncryptionPDF(Document document)
//			throws DocumentException {
//		// setEncryption(boolean strength, String userPassword, String
//		// ownerPassword, int permissions)
//		// writer.setEncryption(PdfWriter.STRENGTH128BITS, USER_PASS,
//		// OWNER_PASS, PdfWriter.AllowCopy | PdfWriter.AllowPrinting);
//
//		// writer.setEncryption(USER_PASS.getBytes(), OWNER_PASS.getBytes(),
//		// PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);
//		System.out.println("password...");
//	}

	private static void setAtributePDF(Document document) {
		document.setPageSize(PageSize.A4);
		document.addAuthor(AUTHOR);
		document.addCreationDate();
		document.addCreator(CREATOR);
		document.addTitle(TITLE);
		System.out.println("atribute...");
	}

	private static void inputTextPDF(Document document)
			throws DocumentException {
		document.add(new Paragraph("First PDF-file"));
		document.add(new Paragraph(new Date().toString()));
		document.add(new Paragraph(" "));
		System.out.println("text...");
	}

}
