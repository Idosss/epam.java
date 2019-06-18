package kz.epam.gabdollin.practice.lectionTasks;

public class ClassStringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Java StringBuilder");
        System.out.println("StringBuilder1 : " + sb);
        sb.append("Example");
        System.out.println("StringBuilder2 : " + sb);
        sb.insert(5,"insert");
        System.out.println("StringBuilder3 : " + sb);
        sb.setCharAt(18, '4');
        System.out.println("StringBuilder : " + sb);
    }
}
