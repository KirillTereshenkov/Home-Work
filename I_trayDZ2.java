package HomeWork;

public class I_trayDZ2 {

    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        System.out.println(trueOrFalse(10,1));
        System.out.println("==================");
        System.out.println(" Задание 2 ");
        number(5);
        System.out.println("==================");
        System.out.println(" Задание 3 ");
        System.out.println(otrizalovo(5));
        System.out.println("==================");
        System.out.println(" Задание 4 ");
        print("Misisipi");
        System.out.println("==================");

    }
    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean trueOrFalse(int a,int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void number(int a) {
        if (a >= 0) {
            System.out.println("Положительное: " + a);
        } else {
            System.out.println("Отрицательное: " + a);
        }

    }
    //Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean otrizalovo(int a) {
        return (a < 0);
    }
    //Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку,
    // указанное количество раз;
    public static void print(String slowo) {
        for (int i = 0;i < 5;i++) {
            System.out.println(slowo +" "+ i);
        }
    }
}







