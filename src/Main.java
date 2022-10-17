public class Main {
    public static void main(String[] args) {
        //Задание 6
        var boxMan1 = 78.2;
        var boxMan2 = 82.7;
        System.out.println("общий вес бойцов: " + boxMan1+boxMan2);
        //Задание 7
        var diference = boxMan2-boxMan1;
        System.out.println("разница бойцов(вычетание): " + diference);
        diference = boxMan2%boxMan1;
        System.out.println("разница бойцов(деление): " + diference);
        //Задание 8.1
        var totalTime = 640;
        var workTime = 8;
        var amountPeople = 640/8;
        System.out.println("Всего работников в компании "+amountPeople+ " человек ");
        //задание 8.2
        amountPeople += 94;
        totalTime = workTime*amountPeople;
        System.out.println("Если в компании работает "+amountPeople+" человек, то всего "+totalTime +
                " часов работы может быть поделено между сотрудниками");

    }
}