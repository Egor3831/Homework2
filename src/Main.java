public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

            System.out.println("Собак = " + dog);
            System.out.println("Кошек = " + cat);
            System.out.println("Бумаги= " + paper);
            System.out.println();

        System.out.println("Задание 2");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

            System.out.println("Собак = " + dog);
            System.out.println("Кошек = " + cat);
            System.out.println("Бумаги = " + paper);
            System.out.println();

        System.out.println("Задание 3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

            System.out.println("Собак = " + dog);
            System.out.println("Кошек = " + cat);
            System.out.println("Бумаги = " + paper);
            System.out.println();

        System.out.println("Задание 4");

        var friend = 19;
            System.out.println("Значение friend = " + friend);

        friend += 2;
            System.out.println("После увеличения на 2 = " + friend);

        friend /= 7;
            System.out.println("После деления на 7 = " + friend);
            System.out.println();

        System.out.println("Задание 5");

        var frog = 3.5;

        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);
        System.out.println();

        System.out.println("Задание 6");

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        var weightDifference = boxer2Weight - boxer1Weight;

        System.out.println("Общая масса двух бойцов: " + totalWeight + " кг");
        System.out.println("Разница между массами бойцов: " + weightDifference + " кг");
        System.out.println();

        System.out.println("Задание 7");

        var weightRemainder = boxer2Weight % boxer1Weight;

        System.out.println("Остаток от деления массы второго боксера на массу первого: " + weightRemainder + " кг");
        System.out.println();

        System.out.println("Задание 8");
        var totalHours = 640;
        var hoursPerWorker = 8;
        var totalWorkers = totalHours / hoursPerWorker;

        System.out.println("Всего работников в компании — " + totalWorkers + " человек");

        var additionalWorkers = 94;
        var newTotalWorkers = totalWorkers + additionalWorkers;
        var newTotalHours = newTotalWorkers * hoursPerWorker;

        System.out.println("Если в компании работает " + newTotalWorkers + " человек, то всего " + newTotalHours + " часов работы может быть поделено между сотрудниками");
    }
}