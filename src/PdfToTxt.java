import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;

import java.io.*;

public class PdfToTxt {

    private String getText(File file){
        FileInputStream fis = null;
        String text = null;
        try {
            fis = new FileInputStream(file);
            // PDF解析器 得到PDF解析对象
            PDFParser parser = new PDFParser(fis);
            // 解析
            parser.parse();
            // 得到解析的PD文档
            PDDocument pd = parser.getPDDocument();
            PDFTextStripper stripper = new PDFTextStripper();
            // 通过PDFTextStripper从文档PD中获得文本
            text = stripper.getText(pd);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return text;
    }

    private void toWord (File file, String text) {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        PdfToTxt p = new PdfToTxt();
        String text = p.getText(new File("D:\\唐诗中月意象的情感内涵与艺术特征.pdf"));
        p.toWord(new File("D:\\唐诗中月意象的情感内涵与艺术特征.txt"), text);
    }
}