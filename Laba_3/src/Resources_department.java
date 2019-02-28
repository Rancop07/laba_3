//Реалізувати пошук даних працівника за вказаною посадою та допустимим стажем роботи
public class Resources_department {
    private Worker[] workers;

    public Resources_department(Worker[] list) {
        workers = list;
    }

    public void print_works() {
        for (Worker w : workers) {
            System.out.println("Прізвище: " + w.getPrizv() + "\t " + "Домашня адреса: " + w.getAdres() + "\t "
                    + "Посада:" + w.getPosition() + "\t " + "Рік народження: " + w.getYear() + "\t "
                    + "Кількість дітей: " + w.getKids() + "\t " + "Дата прийом на роботу: " + w.getDate_R() + "\t "
                    + "Постійний/за сумісництвом працівнк: " + w.getWork() + "\t ");
        }
    }

    public void print_workerst() {
        for (Worker w : workers) {
            if (w.getWork()== true)
            System.out.println("Прізвище: " + w.getPrizv() + "\t " + "Рік народження: " + w.getYear() + "\t " + "Посада:" + w.getPosition() + "\t " + "Постійний/за сумісництвом працівнк: " + w.getWork() + "\t ");
        }
    }
    public void print_workerst_1() {
        for (Worker w : workers) {
            if (w.getWork()== false)
                System.out.println("Прізвище: " + w.getPrizv() + "\t " + "Рік народження: " + w.getYear() + "\t " + "Посада:" + w.getPosition() + "\t " + "Постійний/за сумісництвом працівнк: " + w.getWork() + "\t ");
        }
    }
    public void print_search(String Position){
        String printer = "";
        for (Worker w : workers){
            for (int i=0; i<w.getPosition().length(); i++){
                if (w.getPosition().equals(Position)){
                    printer = w.getPrizv().toString();
                    System.out.println("Posada: " + printer + "\t "  + w.getYear()+ "\t " + w.getAdres() + "\t "  + w.getKids() + "\t "+ w.getDate_R());
                }
            }
        }
    }


}
