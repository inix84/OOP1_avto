public class Main {
    public static void main(String[] args) {
        car LadaGranta = new car("Lada", "Granta", 2015,"Россия", "желтый",1.7);
        car AudiA8 = new car("Audi", "A8 50 L TDI quattro", 2020,"Германия", "черный",3.0);
        car BMWZ8 = new car("BMW", "Z8", 2021,"Германия", "черный",3.0);
        car KiaSportage4 = new car("Kia", "Sportage 4-го поколения", 2018,"Южная Корея", "красный",2.4);
        car HyundaiAvante = new car("Hyundai", "Avante", 2016,"Южная Корея", "оранжевый",1.6);
        car NoName = new car(null, "", -2015,"", "",-1.7);
        System.out.println(LadaGranta);
        System.out.println(AudiA8);
        System.out.println(BMWZ8);
        System.out.println(KiaSportage4);
        System.out.println(HyundaiAvante);
        System.out.println(NoName);
       }
}