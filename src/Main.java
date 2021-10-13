import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String line = "2700;Brønshøj;Husum;Københavns Biblioteker;Frederikssundsvej 290;55.7113268;Folkebibliotek;710107;12.4747123;Husum Bibliotek\n";
        String[] lineArr=line.split(";");
	// write your code here
        Adresse adresse = new Adresse(Integer.valueOf(lineArr[0]),lineArr[1],lineArr[4]);
        Bibliotek bib = new Bibliotek(adresse,lineArr[2]);
        ArrayList<Bibliotek> biblioteks = new ArrayList<>();
        biblioteks.add(bib);
        Bibloteksloader bibloader = new Bibloteksloader();
        try {
            bibloader.loadBibliotekerFraEnFil("resources/testbib");
        } catch (IOException io) {
            io.printStackTrace();
        }


    }
}
