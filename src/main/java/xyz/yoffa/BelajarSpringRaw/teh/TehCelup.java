package xyz.yoffa.BelajarSpringRaw.teh;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import xyz.yoffa.BelajarSpringRaw.sweetener.Sweetener;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@Component
public class TehCelup implements Teh{

    @Override
    public String penyajian() {
        StringBuilder retString = new StringBuilder();
        try {
            // I could do file reading with multiple impl in java std, but I choose FileReader
            FileReader reader = new FileReader("src/main/resources/Cara Penyajian.txt");
            // loop until no content is left
            while (reader.ready()) {
                // Convert to ascii post-read, append to string
                retString.append((char)reader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return retString.toString();
    }

    @Override
    public int getCalories() {
        return 0;
    }

}
