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


    }
}