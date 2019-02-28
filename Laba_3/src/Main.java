import java.util.Scanner;

public class Main {

    public static void Space_line(){
        System.out.println("________________________________________________________________________________________" +
                "_____________________________" + "\n");    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Resources_department workerss;

        Worker[] workers= {
                new Worker("Іванов","Вул.Кіквідзе,39","Студент",1999,0,2017),
                new Worker("Смирнов","Вул.Перова,6","Касир",1997,1,2010,false),
                new Worker("Бурунов","Вул.Київська,7","Програміст",1991,2,2007),
                new Worker("Моргун","Вул.І.Мазепи,8","Менеджер",1994,1,2014,false),
                new Worker("Агапова","Вул.Правди,43","Дизайнер",1996,0,2015,false),
        };
        workerss=new Resources_department(workers);

        Space_line();
        System.out.println("Загальна інформація: ");
        workerss.print_works();
        Space_line();
        System.out.println("Постійні працівники:");
        workerss.print_workerst();
        Space_line();
        System.out.println("Працівники за сумісництвом:");
        workerss.print_workerst_1();
        Space_line();
        System.out.println("Пошук данних працівника");
        Space_line();
        System.out.print("Введіть посаду: ");
        String Position = scanner.nextLine();
        workerss.print_search(Position);
        Space_line();
    }

}