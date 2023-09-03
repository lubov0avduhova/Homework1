package avduhova.lubov.regular;

/**
 * Класс для форматированного вывода на экран
 */
public class Decorator {

    /**
     * Метод для формарованного вывода на экран
     * @param a результат работы предыдущего метода
     * @return возвращает форматированный показ результата       */
    public static String decorator (int a) {
        return String.format("here is your number: %d", a);
    }
}
