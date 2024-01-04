public class Main {
    public static void main(String[] args) {

        System.out.println("     задача_1");

    int a = 2147483647;
    byte b = 127;
    short c = 32767;
    long l = 9223372036854775807L;
    float f = 3.438f;
    double d = 1.7308;
    System.out.println("Значение переменной a с типом int равно " + a +".");
    System.out.println("Значение переменной b с типом byte равно " + b +".");
    System.out.println("Значение переменной c с типом short равно " + c +".");
    System.out.println("Значение переменной l с типом long равно " + l +".");
    System.out.println("Значение переменной f с типом float равно " + f +".");
    System.out.println("Значение переменной d с типом double равно " + d +".");

        System.out.println("     задача_2");

    float fL = 27.12f;
    long lN = 987678965549L;
    double dB = 2.786;
    short sH = 569;
    int iN = - 159;
    short sHr = 27897;
    byte bT = 67;
    System.out.println("fl = " + fL);
    System.out.println("lN = " + lN);
    System.out.println("dB = " + dB);
    System.out.println("sH = " + sH);
    System.out.println("iN = " + iN);
    System.out.println("sHr = " + sHr);
    System.out.println("bT = " + bT);

        System.out.println("     задача_3");

    var numberStLp = 23;
    var numberStAs = 27;
    var numberStEa = 30;
    var paperTotal = 480;
    System.out.println ("На каждого ученика рассчитано " + paperTotal/(numberStLp+numberStAs+
            numberStEa) + " листов бумаги.");

        System.out.println("     задача_4");

    byte productivityTwuMinutes = 16;
    int productivityOneMinute = productivityTwuMinutes/2;
    byte timeMinutes = 20;
    byte timeDay = 1;
    byte timeDays = 3;
    byte timeMonth = 1;
        int produced1 = productivityOneMinute * timeMinutes;
        System.out.println("За " + timeMinutes + " минут машина произвела "
            + produced1 + " штук бутылок.");
        int produced2 = productivityOneMinute * timeDay * 24 * 60;
        System.out.println("За " + timeDay + " день машина произвела "
                + produced2 + " штук бутылок.");
        int produced3 = produced2 * timeDays;
        System.out.println("За " + timeDays + " дня машина произвела "
                + produced3 + " штук бутылок.");
        int produced4 = produced3 * 10;
        System.out.println("За " + timeMonth + " месяц машина произвела "
                + produced4 + " штук бутылок.");

    System.out.println("     задача_5");

    byte canTotal = 120;
    byte canWhiteClass = 2;
    byte canBrownClass = 4;
    int numberClasses = canTotal/(canBrownClass+canWhiteClass);
    int canWhiteTotal = numberClasses * canWhiteClass;
    int canBrownTotal  = numberClasses * canBrownClass;
    System.out.println("В школе, где " + numberClasses + " классов, нужно "
            + canWhiteTotal + " банок белой краски и " + canBrownTotal +
            " банок коричневой краски.");

    System.out.println("     задача_6");

int numberBananas = 5;
int weightBanana = 80;
int numberMilk = 200;
int weight100Milk = 105;
int numberIceCream = 2;
int weightIceCream = 100;
int numberEggs = 4;
int weightEggs = 70;
    float weightBreakfastGr = (float) ((numberBananas * weightBanana) + ((numberMilk / 100) * weight100Milk) +
        (numberIceCream * weightIceCream) + (numberEggs * weightEggs));
    float weightBreakfastKgr = weightBreakfastGr/1000;
        System.out.println("Вес спортзавтрака составляет " + weightBreakfastGr + " граммов или " +
        weightBreakfastKgr + " килограмма.");

        System.out.println("     задача_7");

        float weightTotal = 7;
        float weightTotalGr = weightTotal * 1000;
        float weightDayMin = 250;
        float weightDayMax = 500;
        float numberDaysMin = weightTotalGr / weightDayMax;
        float numberDaysMax = weightTotalGr / weightDayMin;
        float numberDaysMid = weightTotalGr /((weightDayMin + weightDayMax)/2);
        System.out.println("Если спортсмен будет терять по " + weightDayMin + " грамм в день, то чтобы сбросить " +
                weightTotal + " килограмм, ему потребуется " + numberDaysMax + " дней, если по " +
                weightDayMax + " грамм, то " + numberDaysMin + " дней. В среднем ему потребуется " +
                numberDaysMid + " дней.");

        System.out.println("     задача_8");

        int wageM = 67760;
        int wageD = 83690;
        int wageK = 76230;
        float factorIncrease = 0.1f; // Коэфициент повышения заплаты
        double wageMnew = wageM * (1 + factorIncrease); // Зарплата Маши после повышения
        double wageDnew = wageD * (1 + factorIncrease);
        double wageKnew = wageK * (1 + factorIncrease);
        double increaseAnnualSalaryM = wageM * factorIncrease * 12; // Годовое повышение зарплаты у Маши
        double increaseAnnualSalaryD = wageD * factorIncrease * 12;
        double increaseAnnualSalaryK = wageK * factorIncrease * 12;


        System.out.println("Маша теперь получает " + wageMnew + " рублей. Годовой доход вырос на " +
                increaseAnnualSalaryM + " рублей.");
        System.out.println("Денис теперь получает " + wageDnew + " рублей. Годовой доход вырос на " +
                increaseAnnualSalaryD + " рублей.");
        System.out.println("Кристина теперь получает " + wageKnew + " рублей. Годовой доход вырос на " +
                increaseAnnualSalaryK + " рублей.");



    }
}