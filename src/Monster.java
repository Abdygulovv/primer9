public class Monster {
    private int numEyes;
    private int numLeg;
    private int numHand;

    @Override
    public String toString() {
        return " Monster( " + " numEyes: " + numEyes + " numLeg: " + numLeg + " numHand: " + numHand;
    }

    public Monster() {
        this.numEyes = 2;
        this.numLeg = 2;
        this.numHand = 2;
    }

    public Monster(int numEyes) {
        this.numEyes = numEyes;
    }

    public Monster(int numEyes, int numLeg) {
        this.numEyes = numEyes;
        this.numLeg = numLeg;
    }

    public Monster(int numEyes, int numLeg, int numHand) {
        this.numEyes = numEyes;
        this.numLeg = numLeg;
        this.numHand = numHand;
    }

    public void voice() {
        System.out.println("Голос");
    }

    public void voice(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println("Голос");
        }
    }

    public void voice(int i, String word) {
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }
}
