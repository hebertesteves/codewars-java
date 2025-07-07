package kyu8;

public class TotalPoints {
    public static int points(String[] games) {
        int totalPontos = 0;
        for (String jogo : games) {
            int placarNossoTime = Integer.parseInt(jogo.substring(0, 1));
            int placarAdversario = Integer.parseInt(jogo.substring(jogo.length() - 1));

            if (placarNossoTime > placarAdversario) {
                totalPontos += 3;
            } else if (placarNossoTime == placarAdversario) {
                totalPontos += 1;
            }

        }

        return totalPontos;
    }

    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"}));
        System.out.println(points(new String[]{"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
        System.out.println(points(new String[]{"0:1","0:2","0:3","0:4","1:2","1:3","1:4","2:3","2:4","3:4"}));
        System.out.println(points(new String[]{"1:0","2:0","3:0","4:0","2:1","1:3","1:4","2:3","2:4","3:4"}));
        System.out.println(points(new String[]{"1:0","2:0","3:0","4:4","2:2","3:3","1:4","2:3","2:4","3:4"}));
    }
}
