import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(6)+1;
        int b = rand.nextInt(6)+1;
        int c = rand.nextInt(6)+1;
        int d = rand.nextInt(6)+1;
        int e = rand.nextInt(6)+1;
        System.out.println("Aces            "+aces(a,b,c,d,e));
        System.out.println("Twos            "+ twos(a,b,c,d,e));
        System.out.println("Threes          "+threes(a,b,c,d,e));
        System.out.println("Fours           "+fours(a,b,c,d,e));
        System.out.println("Fives           "+fives(a,b,c,d,e));
        System.out.println("Sixes           "+sixes(a,b,c,d,e));
        System.out.println("3 of a Kind     "+threeofakind(a,b,c,d,e));
        System.out.println("4 of a Kind     "+fourofakind(a,b,c,d,e));
        System.out.println("Full House      "+fullhouse(a,b,c,d,e));
        System.out.println("Small Straight  "+smallStraight(a,b,c,d,e));
        System.out.println("Large Straight  "+largestraight(a,b,c,d,e));
        System.out.println("Yahtzee         "+yahtzee(a,b,c,d,e));
        System.out.println("Chance          "+chance(a,b,c,d,e));
    }
    public static int aces(int A, int B, int C, int D, int E) {
        int Score;
        if (A == 1){
            A = 1;
        } else {
            A = 0;
        }
        if (B == 1) {
            B = 1;
        } else {
            B = 0;
        }
        if (C == 1) {
            C = 1;
        } else {
            C = 0;
        }
        if (D == 1) {
            D = 1;
        } else {
            D = 0;
        }
        if (E == 1) {
            E = 1;
        } else {
            E = 0;
        }

        return A+B+C+D+E;
    }

    public static int twos(int a, int b, int c, int d, int e){
        int numTwos = 0;
        if(a == 2){
            numTwos = numTwos + 1;
        }if(b== 2){
            numTwos= numTwos + 1;
        }if(c== 2){
            numTwos = numTwos +1;
        }if(d== 2){
            numTwos = numTwos +1;
        }if(e== 2) {
            numTwos = numTwos + 1;
        }
        int totalTwos = numTwos*6;
        return totalTwos;
    }

    public static int threes(int dice1, int dice2, int dice3, int dice4, int dice5)
    {
        int a=0;

        if(dice1 == 3){
            a += 3;
        }

        if(dice2 == 3) {
            a += 3;
        }

        if(dice3 == 3){
            a += 3;
        }

        if(dice4 == 3){
            a += 3;
        }

        if(dice5 == 3){
            a += 3;
        }

        return a;

    }

    public static int fours(int dice1, int dice2, int dice3, int dice4, int dice5)
    {
        int a=0;

        if(dice1 == 4){
            a += 4;
        }

        if(dice2 == 4) {
            a += 4;
        }

        if(dice3 == 4){
            a += 4;
        }

        if(dice4 == 4){
            a += 4;
        }

        if(dice5 == 4){
            a += 4;
        }

        return a;

    }

    public static int fives(int a, int b, int c, int d, int e){
        if(a==5){
            a=5;
        }else{
            a=0;
        }
        if(b==5){
            b=5;
        }else{
            b=0;
        }
        if(c==5){
            c=5;
        }else{
            c=0;
        }
        if(d==5){
            d=5;
        }else{
            d=0;
        }
        if(e==5){
            e=5;
        }else{
            e=0;
        }
        return a+b+c+d+e;
    }

    public static int sixes(int a, int b, int c, int d, int e){
        int numSix = 0;
        if(a == 6){
            numSix = numSix + 1;
        }if(b== 6){
            numSix= numSix + 1;
        }if(c== 6){
            numSix = numSix +1;
        }if(d== 6){
            numSix = numSix +1;
        }if(e== 6) {
            numSix = numSix + 1;
        }
        int totalSix = numSix*6;
        return totalSix;
    }

    public static int threeofakind(int a, int b, int c, int d, int e){
        if ((a == b) && (a == c)){
            int result = a+b+c+d+e;
            return result;
        }
        if ((a == b) && (a == d)){
            int result = a+b+c+d+e;
            return result;
        }
        if ((a == b) && (a == e)){
            int result = a+b+c+d+e;
            return result;
        }
        if ((b == c) && (c == d)){
            int result = a+b+c+d+e;
            return result;
        }
        if ((b == c) && (c == e)){
            int result = a+b+c+d+e;
            return result;
        }
        if ((b == d) && (d == e)){
            int result = a+b+c+d+e;
            return result;
        }
        if ((c == d) && (d == e)){
            int result = a+b+c+d+e;
            return result;
        }
        if ((c == a) && (a == d)){
            int result = a+b+c+d+e;
            return result;
        }
        if ((c == a) && (a == e)){
            int result = a+b+c+d+e;
            return result;
        }
        if ((d == a) && (a == e)){
            int result = a+b+c+d+e;
            return result;
        }
        return a+b+c+d+e;

    }


    public static int fourofakind(int a, int b, int c, int d, int e) {
        int fourOfAKindTotal;
        if (a == b && a == c && a == d) {
            fourOfAKindTotal = a + b + c + d + e;
        }
        if (a == b && a == c && a == e) {
            fourOfAKindTotal = a + b + c + d + e;
        }
        else {
            fourOfAKindTotal = 0;
        }
        return fourOfAKindTotal;

    }

    public static int fullhouse(int die1, int die2, int die3, int die4, int die5){

        boolean fullHouse = true;
        int score = 0;

        if (die1 == die2 && die1 == die3 && die4 == die5 && die1 != die5) {
            score = score + 25;
        }
        if (die1 == die2 && die1 == die4 && die3 == die5 && die1 != die5) {
            score = score + 25;
        }
        if (die1 == die3 && die1 == die4 && die2 == die5 && die1 != die5) {
            score = score + 25;
        }
        if (die3 == die2 && die4 == die3 && die1 == die5 && die2 != die5) {
            score = score + 25;
        }
        if (die2 == die3 && die2 == die5 && die1 == die4 && die2 != die4) {
            score = score + 25;
        }
        if (die1 == die3 && die1 == die5 && die2 == die4 && die1 != die4) {
            score = score + 25;
        }
        if (die1 == die2 && die1 == die5 && die3 == die4 && die1 != die4) {
            score = score + 25;
        }
        if (die2 == die4 && die2 == die5 && die1 == die3 && die1 != die4) {
            score = score + 25;
        }
        if (die1 == die4 && die1 == die5 && die2 == die3 && die1 != die2) {
            score = score + 25;
        }
        if (die3 == die4 && die3 == die5 && die1 == die2 && die1 != die4) {
            score = score + 25;
        }
        return score;
    }

    public static int smallStraight(int a, int b, int c, int d, int e) {
        boolean have1;
        boolean have2;
        boolean have3;
        boolean have4;
        boolean have5;
        boolean have6;

        if (a == 1 || b == 1 || c == 1 || d == 1 || e == 1) {
            have1 = true;
        } else {
            have1 = false;
        }

        if (a == 2 || b == 2 || c == 2 || d == 2 || e == 2) {
            have2 = true;
        } else {
            have2 = false;
        }


        if (a == 3 || b == 3 || c == 3 || d == 3 || e == 3) {
            have3 = true;
        } else {
            have3 = false;
        }

        if (a == 4 || b == 4 || c == 4 || d == 4 || e == 4) {
            have4 = true;
        } else {
            have4 = false;
        }

        if (a == 5 || b == 5 || c == 5 || d == 5 || e == 5) {
            have5 = true;
        } else {
            have5 = false;
        }

        if (a == 6 || b == 6 || c == 6 || d == 6 || e == 6) {
            have6 = true;
        } else {
            have6 = false;
        }

        if ((have1 == true) && (have2 == true) && (have3 == true) && (have4 == true)) {
            return (30);
        } else if ((have2 == true) && (have3 == true) && (have4 == true) && (have5 == true)) {
            return (30);
        } else if ((have3 == true) && (have4 == true) && (have5 == true) && (have6 == true)) {
            return (30);
        } else {
            return 0;
        }
    }

    public static int largestraight(int a,int b, int c,int d,int e){
        boolean have1;
        boolean have2;
        boolean have3;
        boolean have4;
        boolean have5;
        boolean have6;

        if (a == 1 || b == 1 || c == 1 || d == 1 || e == 1) { have1 = true; }
        else {have1 = false;}

        if (a == 2 || b == 2 || c == 2 || d == 2 || e == 2) { have2 = true; }
        else {have2 = false;}


        if (a == 3 || b == 3 || c == 3 || d == 3 || e == 3) { have3 = true; }
        else {have3 = false;}

        if (a == 4 || b == 4 || c == 4 || d == 4 || e == 4) { have4 = true; }
        else {have4 = false;}

        if (a == 5 || b == 5 || c == 5 || d == 5 || e == 5) { have5 = true; }
        else {have5 = false;}

        if (a == 6 || b == 6|| c == 6 || d == 6 || e == 6) { have6 = true; }
        else {have6 = false;}

        if ((have1 == true) && (have2 == true) && (have3 == true) && (have4 == true) && (have5 == true)){return(40);}

        else if ((have2 == true) && (have3 == true) && (have4 == true) && (have5 == true) && (have6 == true)){return(40);}

        else return 0;
    }

    public static int yahtzee(int dice1, int dice2, int dice3, int dice4, int dice5) {
        if ((dice1 == dice2) && (dice1 == dice3) && (dice3 == dice4) && (dice1 == dice5)) {
            return 50;
        }
        else {
            return 0;
        }
    }

    public static int chance(int dice1, int dice2, int dice3, int dice4, int dice5) {
        return dice1+dice2+dice3+dice4+dice5;
    }

}