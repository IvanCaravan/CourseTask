public class Main {
    public static void main(String[] args) {
        String[] cities = {"Kiev", "Moscow", "Beijing", "Oslo", "Oslo", "Beijing"};
        String result = "";
        for (int i = 0; i < cities.length; i++) { //пишем цикл для сравнения одного элемента со всеми
            for (int j = 0; j < cities.length;j++){ //пишем вложенный цикл, чтоб перебирать второе значение.
                if (i!=j && cities[i].equals(cities[j])) { // пишем условный оператор, который будет осуществлять замену
                    cities[j] = ""; //собственно, сама замена
                }
            }
            result += cities[i] + " "; //конкатенация строк. Сравниваемое значение прошло проверки и пишется в строку.
        }
        System.out.println(result); //выводим эту строку
    }
}