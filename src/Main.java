public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 98; // вес
        double height = 1.87; //рост
        int index = service.calculate(weight, height); //расчет

        System.out.println ("Индекс массы тела" + index);

    }
}