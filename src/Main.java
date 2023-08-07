import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        getFloat();
        obj2();
        obg3();
        obg4();
    }
    public static void getFloat(){
        while (true){
            try {
                System.out.println("Введите дробное число:");
                System.out.println("Вы ввели " + getFl());
                break;
            }
            catch (Exception e){
                System.out.println("Вы ввели некорректные данные, попробуйте ещё");
            }
        }
    }
    private static float getFl(){
        Scanner sc = new Scanner(System.in);
        return sc.nextFloat();
    }

    public static void obj2(){
        try {
            int d = 0;
            int intArray[] = {2,3,4,5,6,7,8,9,9,10};
            if (d == 0){
                throw new ArithmeticException("На ноль делить нельзя");
            }else {
                double catchedRes1 = (double) intArray[8] / (double)d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }

        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }

    public static void obg3(){
        try {
            int a = 90;
            int b = 7;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }

    public static void obg4() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любые данные:");
        String line = sc.nextLine();
        if (line.isEmpty()){
            throw new Exception("Введена пустая строка");
        }else{
            System.out.println("Ваша строка -> " + line);
        }
    }

}