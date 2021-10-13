import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bibloteksloader {
    Scanner sc;

    public ArrayList<Bibliotek> loadBibliotekerFraEnFil(String filepath) throws FileNotFoundException {
        //"2700;Brønshøj;Husum;Københavns Biblioteker;Frederikssundsvej 290;55.7113268;Folkebibliotek
        ArrayList<Bibliotek> bibs = new ArrayList<>();
        File file = new File(filepath);
        sc = new Scanner(file);
        Adresse adresse = null;
        Bibliotek bibliotek = null;

        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] lineArr = line.split(";");
            // logik
            //adresse =
            bibs.add(bibliotek);
        }
        return bibs;
    }
}
