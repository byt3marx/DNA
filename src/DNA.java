public class DNA {
    //DNA Sequencing

    public static void main(String[] args) {

//Example DNA strands
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna1;
        checkProtein(dna);
        dna = dna2;
        checkProtein(dna);
        dna = dna3;
        checkProtein(dna);
    }

    public static void checkProtein(String dna) {
        dna = dna.toUpperCase();
        int length = dna.length();
        System.out.println("Length: "+ length);

        System.out.println("Analyzing sequence: " + dna);

        int start = dna.indexOf("ATG");

        int stop = dna.indexOf("TGA", start + 3);

        if (start != -1 && stop != -1 && stop > start) {
            String protein = dna.substring(start, stop + 3);

            if (protein.length() % 3 == 0) {
                System.out.println("This DNA strand contains a protein: " + protein);
            } else {
                System.out.println("This DNA strand does not contain a protein (length not divisible by 3).");
            }
        } else {
            System.out.println("This DNA strand does not contain a protein (missing start or stop codon).");
        }

    }

    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ /
    //   / \   \   / \   \
    //  ~   `-~ `-`   `-~ `-

}

