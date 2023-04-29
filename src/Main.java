public class Main {
    public static void main(String[] args) {
        Monster monster1 = new Monster();
        monster1.voice();


        Monster monster2 = new Monster(4);
        System.out.println(monster2);
        monster2.voice(5);


        Monster monster3 = new Monster(8, 12);
        System.out.println(monster3);
        monster3.voice(2, "Мяу");


        Monster monster4 = new Monster(2, 4, 8);
        System.out.println(monster4);
        monster4.voice();
    }
}