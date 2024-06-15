public class tester{
    public static void main(String[] args){
        MyDate date_one = new MyDate();
        MyDate date_two = new MyDate(34355555133101L);

        System.out.println("1st Date " + date_one.getMonth() + "/" + date_one.getDay() + "/" + date_one.getYear());
        System.out.println("2nd Date " + date_two.getMonth() + "/" + date_two.getDay() + "/" + date_two.getYear());
         
    }
}