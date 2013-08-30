package generatePDF;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class createPDF {

	static String USER_PASS = "user";

	static String OWNER_PASS = "owner";

	public static void main(String[] args) {
		
		try {
			OutputStream file = new FileOutputStream(new File("file.pdf"));
			Document document = new Document();			
			PdfWriter writer = PdfWriter.getInstance(document, file);
			writer.setEncryption(USER_PASS.getBytes(), OWNER_PASS.getBytes(),
					PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);

			document.open();			
			document.addAuthor("Ros KRostyslav");
			document.addCreationDate();
			document.addCreator("iText library");
			document.addTitle("Title of PDF file");			
			document.add(new Paragraph("First PDF-file"));
			document.add(new Paragraph(new Date().toString()));
			document.close();
			file.close();
			
			System.out.println("PDF generated!!!");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
