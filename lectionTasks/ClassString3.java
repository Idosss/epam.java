package kz.epam.gabdollin.practice.lectionTasks;

public class ClassString3 {

        public static void main(String[] args) {
            int[] mas2 = { 0x3fdc, 0x4010};
            String str2 = new String(mas2, 0, mas2.length);
            System.out.println("Строка - " + str2);
            System.out.println("Длина строки - " + str2.length());
            System.out.println("Длина строки в байтах - " + str2.getBytes().length);

        }
}

