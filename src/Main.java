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
            var fourDog = dog + 4;
            var fourCat = cat + 4;
            var fourPaper = paper + 4;
            System.out.println("Собак " + fourDog + ", Кошек " + fourCat + ", Бумаги " + fourPaper);

            //3адача 3
            var minusDog = fourDog - 3.5;
            var minusCat = fourCat - 1.6;
            var minusPaper = fourPaper - 7639;
            System.out.println("Собак " + minusDog + ", Кошек " + minusCat + ", Бумаги " + minusPaper);

            //Задача 4
            var friends = 19;
            System.out.println("Друзей " + friends);

            var twoFriends = friends + 2;
            System.out.println("Друзей " + twoFriends);

            var endFriends = twoFriends / 7;
            System.out.println("Друзей " + endFriends);

            //Задача 5
            var frog = 3.5;
            System.out.println("Лягушек " + frog);

            var manyFrogs = frog * 10;
            System.out.println("Лягушек " + manyFrogs);

            var noManyFrogs = manyFrogs / 3.5;
            System.out.println("Лягушек " + noManyFrogs);

            var fourFrogs = noManyFrogs + 4;
            System.out.println("Лягушек " + fourFrogs);

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


    }
}