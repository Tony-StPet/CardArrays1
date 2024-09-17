public class Main {
    public static void main(String[] args) {
//    PlayingCard card1 = new PlayingCard();
//    card1.suit= "пики";
//    card1.rank ="валет";

        PlayingCard card2 = new PlayingCard("бубны", "валет");
        PlayingCard card3 = new PlayingCard("трефы", "дама");
    System.out.println(card2.suit + " "+ card2.rank);

PlayingCard [] m5 = CardArrayRoutines.InputArray(5);
    CardArrayRoutines.printArray(m5);
    //CardArrayRoutines.printArray(m3);
    CardArrayRoutines.bubbleSort(m5);
    CardArrayRoutines.printArray(m5);

    }
}
