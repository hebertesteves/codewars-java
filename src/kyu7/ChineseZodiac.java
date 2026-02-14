package kyu7;

public class ChineseZodiac {
    public static String chineseZodiac(int year) {
        String[] animals = new String[]{"Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"};
        String[] elements = new String[]{"Wood", "Fire", "Earth", "Metal", "Water"};

        int animalIndex = (year - 1984) % 12;
        if (animalIndex < 0) animalIndex += 12;

        int elementIndex = Math.floorDiv(year - 1984, 2) % 5;
        if (elementIndex < 0) elementIndex += 5;

        String resultadoAnimal = animals[animalIndex];
        String resultadoElemento = elements[elementIndex];

        return resultadoElemento + " " + resultadoAnimal;
    }
}
