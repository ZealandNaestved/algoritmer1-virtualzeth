package virtualzeth.algoritmer1;

import java.util.Random;

public class Algorithms1 {
    private Data data = new Data();

    // TODO 3 - Skriv en test til randomBoyName() metoden HINT: Se metoden
    // exampleOfPredictableRandomNumber() for at se, hvordan du kan lave et
    // tilfældigt nummer som er altid det samme (til test)

    // TODO 4 - Skriv en randomGirlName() metode i Algorithms1, som returnerer et
    // tilfældigt pigenavn fra Data klassen

    // TODO 5 - Skriv en randomName() metode i Algorithms1, som laver et sammenlagt
    // array som indeholder både piger og drenge, og returnerer det

    // TODO 6 - Skriv en test til randomName() metoden

    // TODO 7 - Skriv en random bogstavs-generator metode (du kan tage udgangspunkt
    // i randomNumbers() i Data)

    // TODO 8 - Skriv en plet eller krone generator metode (plet er boolean true og
    // krone er boolean false)

    private static void exampleOfPredictableRandomNumber() {
        Random random = new Random();
        random.setSeed(15L); // Hvis vi angiver et seed som et long number, vil random klassen altid generere
                             // det samme tal, i det her tilfælde 21
        System.out
                .print("Hvis vi bruger seed, vil random altid returnere de samme værdier, f.eks. giver denne 21 --> ");
        System.out.println(random.nextInt(45));
    }

    public String randomBoyName() {
        String[] names = this.data.getBoyNames();
        int randInt = new Random().nextInt(names.length);
        return names[randInt];
    }

}
