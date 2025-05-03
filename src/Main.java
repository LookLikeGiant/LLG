//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
           // System.out.println("Привет, мир!!");


            //Задача 1
            var dog = 8.0;//Присвоили значение переменной dog
            var cat = 3.6;//Присвоили значение переменной cat
            var paper = 763789;//Присвоили значение переменной paper
            System.out.println("Собак " + dog + ", Кошек " + cat + ", Бумаги " + paper);

            //Задача 2
            dog = dog + 4;
            cat = cat + 4;
            paper = paper + 4;
            System.out.println("Собак " + dog + ", Кошек " + cat + ", Бумаги " + paper);

            //3адача 3
            dog = dog - 3.5;
            cat = cat - 1.6;
            paper = paper - 7639;
            System.out.println("Собак " + dog + ", Кошек " + cat + ", Бумаги " + paper);

            //Задача 4
            var friends = 19;
            System.out.println("Друзей " + friends);

            friends = friends + 2;
            System.out.println("Друзей " + friends);

            friends = friends / 7;
            System.out.println("Друзей " + friends);

            //Задача 5
            var frog = 3.5;
            System.out.println("Лягушек " + frog);

            frog = frog * 10;
            System.out.println("Лягушек " + frog);

            frog = frog / 3.5;
            System.out.println("Лягушек " + frog);

            frog = frog + 4;
            System.out.println("Лягушек " + frog);

            //Задача 6
            var boxer1 = 78.2;
            var boxer2 = 82.7;
            var all = boxer1 + boxer2;
            System.out.println("Общая масса " + all + " кг");

            var boxRaz = boxer1 - boxer2;
            System.out.println("Разница в массе " + boxRaz + " кг");

            //Задание 7
            var ost = boxer2 % boxer1;
            System.out.println("Остаток от деления двух весов " + ost);

            //Задача 8
            var allTime = 640;
            var onePersonTime = 8; //Часов на одного работника
            var total = allTime/onePersonTime;
            System.out.println("Всего работников в компании - " + total + " человек");

            total = total + 94;
            var newTime = allTime / total;
            System.out.println("Если в компании работает " + total + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");

            //задача 1 (переменные, часть 2)
            int integer = 1000;
            byte bite = 100;
            short shor = 255;
            long lg = 123L;
            float fl = 2.5F;
            double db = -1.7E+308;
            System.out.println("Значение переменной 'integer' с типом 'int' равно" + integer);
            System.out.println("Значение переменной 'bite' с типом 'byte' равно" + bite);
            System.out.println("Значение переменной 'shor' с типом 'short' равно" + shor);
            System.out.println("Значение переменной 'lg' с типом 'long' равно" + lg);
            System.out.println("Значение переменной 'fl' с типом 'float' равно" + fl);
            System.out.println("Значение переменной 'db' с типом 'double' равно" + db);

            //Задача 2
            //int first = 569;
            //byte second = 67;
            //short third = -159;
            //long fourth = 987678965549L;
            //float fifth = 2.786F;
            //double sixth = 27.12;
            //int seventh = 27897;

            //Задача 3
            int lp = 23;
            int as = 27;
            int ea = 30;
            int allPaper = 480;
            int stud = allPaper/(lp+as+ea);
            System.out.println("На каждого ученика рассчитано " + stud + " листов бумаги");

            //Задача 4
            int mashMin = 8;
            int min20 = 20;
            int minDay = 1440; //свела все время к минутам
            int day3 = 4320;
            int mount = 44640;

            min20 = min20 * mashMin;
            minDay = minDay * mashMin;
            day3 = day3 * mashMin;
            mount = mount * mashMin;
            System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
            System.out.println("За сутки машина произвела " + minDay + " штук бутылок");
            System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
            System.out.println("За месяц машина произвела " + mount + " штук бутылок");

            //Задача 5
            int allCol = 120;
            int oneClWh = 2;
            int oneClBr = 4;
            int clas = oneClWh + oneClBr;
            int colvo = allCol/clas;
            oneClWh = oneClWh * colvo;
            oneClBr = oneClBr * colvo;
            System.out.println("В школе, где " + colvo + " классов, нужно " + oneClWh + " банок белой краски и " + oneClBr + " банок коричневой краски");

            //Задача 6
            int bananas = 5 * 80;
            int milks = 2 * 105;
            int iceCream = 2 * 100;
            int eggs = 4 * 70;
            float blend = bananas + milks + iceCream + eggs;
            System.out.println("Вес  в граммах - " + blend);
            blend = blend/1000;
            System.out.println("Вес  в килограммах - " + blend);

            //Задача 7
            int ves = 7*1000;
            int sb1 = 250;
            int sb2 = 500;
            int ves1 = ves/sb1;
            System.out.println("Если терять по 250 грамм, то вес сбросит за " + ves1 + " дней. ");
            int ves2 = ves/sb2;
            System.out.println("Если терять по 500 грамм, то вес сбросит за " + ves2 + " дней. ");
            ves = (ves1+ves2)/2;
            System.out.println(ves + " среднее количество дней для похудения");

            //Задача 8
            //Временно оставлена без решения






    }
}