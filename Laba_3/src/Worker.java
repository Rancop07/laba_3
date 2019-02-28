//Іванов А.В. КН-2-1
//Орієнтовний перелік полів: прізвище, домашня адреса, посада, рік народження, кількість дітей, дата прийому на роботу, постійний працівник/ працівник за сумісництвом.

public class Worker {
    private final String Prizv;
    private final String Adres;
    private final String Position;
    private final int Year;
    private final int Kids;
    private final int Date_R;
    private boolean Work;

    public Worker(String prizv, String adres, String position, int year, int n, int date_r, boolean work) {
        this.Prizv = prizv;
        this.Adres = adres;
        this.Position = position;
        this.Year = year;
        this.Kids = n;
        this.Date_R = date_r;
        this.Work = Work;
    }

    public Worker(String prizv, String adres, String position, int year, int n, int date_r) {
        this.Prizv = prizv;
        this.Adres = adres;
        this.Position = position;
        this.Year = year;
        this.Kids = n;
        this.Date_R = date_r;
        this.Work = true;
    }

        public String getPrizv(){
        return  Prizv;
        }
    public String getAdres(){
        return Adres;
    }
    public String getPosition(){
        return Position;
    }
    public int getYear(){
        return Year;
    }
    public int getKids(){
        return Kids;
    }
    public int getDate_R(){
        return Date_R;
    }
    public boolean getWork(){
        return Work;
    }
}