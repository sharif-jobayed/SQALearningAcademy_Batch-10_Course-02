import package_01.Class_01;
import package_01.Class_02;
import package_02.Class_03;
import package_02.Class_04;

public class Main {
    public static void main(String[] args) {
        Class_01 class01 = new Class_01();
        Class_02 class02 = new Class_02();
        Class_03 class03 = new Class_03();
        Class_04 class04 = new Class_04();

        System.out.println(class01.display());
        System.out.println(class01.getClass_02());
        System.out.println(class04.getClass_03());
    }
}
