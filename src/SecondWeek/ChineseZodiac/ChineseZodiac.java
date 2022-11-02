package SecondWeek.ChineseZodiac;

public class ChineseZodiac {
    public static void main(String[] args) {
        System.out.println(calculateChineseZodiac(1990));

    }

    public static String calculateChineseZodiac(int birthday){
        int remainingNum = (birthday%12);
        return switch (remainingNum) {
            case 1 -> "Rooster";
            case 2 -> "Dog";
            case 3 -> "Pig";
            case 4 -> "Mice";
            case 5 -> "Ox";
            case 6 -> "Tiger";
            case 7 -> "Rabbit";
            case 8 -> "Dragon";
            case 9 -> "Snake";
            case 10 -> "Horse";
            case 11 -> "Sheep";
            default -> "Monkey";
        };
    }
}
