package kyu7;

public class FizzBuzzCuckooClock {
    public static String fizzBuzzCuckooClock(String time) {
        String[] tempo = time.split(":");
        int hora = Integer.parseInt(tempo[0]);
        StringBuilder sb = new StringBuilder();
        int minutos = Integer.parseInt(tempo[1]);

        if(minutos % 15 == 0) {
            if (minutos == 30) {
                sb.append("Cuckoo");
            } else if (hora >= 12 || hora == 0) {
                int qnd = Math.abs(hora - 12);
                if (qnd == 0) qnd = 12;
                for (int i = 0; i < qnd - 1; i++) {
                    sb.append("Cuckoo ");
                }
                sb.append("Cuckoo");
            } else {
                sb.append("Fizz Buzz");
            }
        } else if (minutos % 3 == 0) {
            sb.append("Fizz");
        } else if (minutos % 5 == 0) {
            sb.append("Buzz");
        } else {
            sb.append("tick");
        }

        return sb.toString();
    }
}
