package app;

import static app.LatexTest.parseArithmetic;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.Scanner;

import net.percederberg.grammatica.parser.Node;
import net.percederberg.grammatica.parser.Parser;
import net.percederberg.grammatica.parser.ParserCreationException;
import net.percederberg.grammatica.parser.ParserLogException;

public class LatexTest {

    public static Node parseArithmetic(String input) throws ParserCreationException, ParserLogException {
        Parser  parser = null;

        parser = new LatexMathParser(new StringReader(input));
        return parser.parse();
    }
  
    protected static void saveFile(String strToWrite, String extension) throws FileNotFoundException {
        
        String filepath = "src/examples/out" + "." + extension;
        File destination = new File(filepath);
  
        PrintWriter writer = new PrintWriter(destination);

        writer.println(strToWrite);
        writer.close();      
    }
    
    protected static void saveHTMLFile(String strToWrite) throws FileNotFoundException {
        
        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>"
                        + "<html>"
                        + "<head>"
                        + "<title>Latex MathML Converter</title>"
                        + "<meta charset=\"UTF-8\">"
                        + "</head>"
                        + "<body>"
                        + strToWrite
                        + "</body>"
                        + "</html>"
        );
        
        LatexTest.saveFile(html.toString(), "html");
    }

    public static void main(String[] args) throws ParserCreationException, ParserLogException, FileNotFoundException {
        
        String sourcePath = null;
        File sourceFile;
        Scanner reader;
        StringBuilder source = new StringBuilder("");
        Node parseLatex = null;

        sourcePath = "src/examples/input.tex";
        //sourcePath = "src/examples/caption.tex";
        //sourcePath = "src/examples/simple.tex";
        sourceFile = new File(sourcePath);

        if(!sourceFile.exists()) {
            System.err.println("Conversion failed: Source file does not exist!!!");
            System.exit(1);
        }
        reader = new Scanner(sourceFile);
        while(reader.hasNextLine())
            source.append(reader.nextLine()+"\n");
        reader.close();

        try {
            parseLatex = parseArithmetic(source.toString());
            //Wypisanie drzewa składniowego
            PrintWriter a = new PrintWriter("src/tree.txt");
            parseLatex.printTo(a);

            // Analiza i konwersja na MathML
            LatexMathInterpreter i = new LatexMathInterpreter();
            Node node = i.analyze(parseLatex);
            
            LatexTest.saveFile(i.getMathML(), "txt");
            LatexTest.saveHTMLFile(i.getMathML());
            
        } catch(Exception e) {
            System.err.print("Conversion failed: ");
            e.printStackTrace();
            System.exit(1);
        }
        
    }

    

}
