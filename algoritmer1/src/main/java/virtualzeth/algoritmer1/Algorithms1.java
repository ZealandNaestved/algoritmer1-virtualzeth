package virtualzeth.algoritmer1;

import java.util.Random;

public class Algorithms1 {
    private Data data = new Data();
    public Random random = new Random();

    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt
    // array som indeholder både piger og drenge, og returnerer det

    // TODO 6 - Skriv en test til randomName() metoden

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt
    // i randomNumbers() i Data)

    // TODO 8 - Skriv en plet eller krone generator metode (plet er boolean true og
    // krone er boolean false)

    public String randomBoyName() {
        String[] names = this.data.getBoyNames();
        int randInt = this.random.nextInt(names.length);
        return names[randInt];
    }

    public String randomGirlName() {
        String[] names = this.data.getGirlNames();
        int randInt = this.random.nextInt(names.length);
        return names[randInt];
    }

}
