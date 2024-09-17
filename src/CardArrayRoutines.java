import java.util.Scanner;

public class CardArrayRoutines {
    public static PlayingCard[] InputArray(int size){
    PlayingCard[] mas = new PlayingCard[size];
        System.out.println("введите массив из "+size+" целых карт");
    Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            System.out.println("введите масть");
            String suit = scanner.next();
            System.out.println("введите ранк");
            String rank = scanner.next();
            mas[i] = new PlayingCard(suit, rank);
    }
        return mas;
    }
    public static void printArray(PlayingCard[] mas)    {
        System.out.println("массив: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.println("| "+ "масть: "+ mas[i].suit +" :: "+ "масть: "+ mas[i].rank+" |");
        }
        System.out.println();
    }

    // Алгоритм сортировки пузырьком массива объектов
    public static void bubbleSort(PlayingCard[] mas) {
        for (int i = 0; i < mas.length-1; i++) {
            int end = mas.length - i;
            for (int j = 0; j < end-1; j++) {
                if (calcPower(mas[j]) > calcPower(mas[j+1])) {

                    PlayingCard tmp = mas[j+1];
                    mas[j+1] = mas[j];
                    mas[j] = tmp;
                }
            }
        }
    }

    public static int calcPower(PlayingCard card){
        switch (card.rank){
            case "2": case "двойка": return 2;
            case "3": case "тройка": return 3;
            case "4": case "четверка": return 4;
            case "5": case "пятерка": return 5;
            case "6": case "шестерка": return 6;
            case "7": case "семерка": return 7;
            case "8": case "восьмерка": return 8;
            case "9": case "девятка": return 9;
            case "10": case "десятка": return 10;
            case "валет":  return 11;
            case "дама":  return 12;
            case "король":  return 13;
            case "туз":  return 14;
            case "джокер":  return 15;
            default:  return 0;
        }
    }





}
