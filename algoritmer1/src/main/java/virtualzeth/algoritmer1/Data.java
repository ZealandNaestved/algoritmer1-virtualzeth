package virtualzeth.algoritmer1;

import java.util.Random;

public class Data {

    // 4 private arrays of random numbers and names
    private int[] randomNumbers1000 = { 271, 404, 44, 201, 591, 201, 549, 515, 391, 25, 299, 44, 638, 78, 999, 653, 302,
            81, 977, 473, 328, 216, 324, 557, 160, 541, 669, 316, 874, 534, 56, 783, 238, 116, 432, 320, 485, 641, 138,
            962, 109, 6, 397, 687, 711, 184, 17, 953, 898, 947, 149, 661, 685, 531, 426, 641, 458, 337, 498, 705, 543,
            635, 440, 337, 688, 570, 983, 277, 772, 777, 705, 161, 439, 103, 531, 676, 506, 77, 484, 250, 31, 577, 835,
            79, 225, 444, 689, 439, 505, 685, 411, 483, 872, 893, 252, 430, 677, 18, 79, 437 };
    private int[] randomNumbers10 = { 5, 0, 1, 9, 4, 8, 6, 6, 2, 5 };
    private String[] randomPigeNavne = { "Ae", "Aloha", "Altan", "Amen", "Badr", "Befri", "Charme", "Cirkel",
            "Diddedarling", "Dyne", "Engel", "Europa", "Fan", "Fe", "Fri", "Fryd", "Gift", "Gin", "Glød", "Gul", "Hane",
            "Harme", "Håb", "Kigge", "Krushbakht", "Malmfred", "Manjabjørg", "Musling", "Myrtille", "Nectaria", "Nøks",
            "Ninja", "Nitte", "Ny", "Ok", "Panda", "Pil", "Pop", "Rikkepippih", "Ryle", "Sne", "Soya", "Tigerlilly",
            "Tytte", "Vølve" }; // fra https://www.alt.dk/boern/her-er-danmarks-90-usaedvanlige-navne
    private String[] randomDrengeNavne = { "Awesome", "Barc", "Blær", "Brormand", "Bue", "Cello", "Cobra", "Dreng",
            "Faktor", "Fru", "Gandalf", "Haj", "Havand", "Jazz", "Jesus", "Jura", "Kamel", "Klausbjerke", "Kritte",
            "Laban", "Lillemann", "Life", "Lucky (kan endda kombineres med Luke)", "Ludo", "Lurifax", "Memo", "Muslim",
            "Nam", "Niks", "Nord", "Offer", "Og", "Piphat", "Rocky", "Skak", "Skat", "Snoopy", "Sok", "Sut", "Syver",
            "Sønnik", "Tavs", "Triumf", "Tung", "Viking" };

    public String[] getBoyNames() {
        return this.randomDrengeNavne;
    }

    public String[] getGirlNames() {
        return this.randomPigeNavne;
    }

    public int[] getNumbers10() {
        return this.randomNumbers10;
    }

    public int[] getNumbers1000() {
        return this.randomNumbers1000;
    }

    public static void main(String[] args) {
        // The randomNumbers method is run
        randomNumbers(10, 10);
    }

    // Prints out an array of random numbers
    // n is the amount of numbers and max is the maximum value of each number
    private static void randomNumbers(int n, int max) {
        System.out.print("{");

        for (int i = 0; i < n - 1; i++) {
            System.out.print(new Random().nextInt(max) + ", ");
        }
        System.out.print(new Random().nextInt(max));
        System.out.print("}");
    }

}
