import java.util.InputMismatchException;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Ввод текста
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        int k = 0;
        while ( true ) // ввод k
        {
            System.out.print("Введите значение k: ");
            Scanner sc1 = new Scanner(System. in );
            try
            {
                k = sc1.nextInt();
                break;
            }
            catch(InputMismatchException fg)
            {
                // если введенное значение не является числом
                System.out.print("Вы ввели не число. " );
            }
        }

        // Введите символ, которым нужно заменить k-ю букву
        System.out.print("Введите символ для замены: ");
        char replacement = scanner.next().charAt(0);

        // Разделим текст на слова и обработаем каждое слово
        String[] words = text.split("\\s+"); // Разделение текста по пробелам
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (k <= word.length()) {
                // Если k не превышает длину слова, замена символа
                char[] charArray = word.toCharArray();
                charArray[k - 1] = replacement;
                result.append(new String(charArray)).append(" ");
            } else {
                // Нет - просто добавление слова
                result.append(word).append(" ");
            }
        }
        // Корректировка
        String finalResult = result.toString().trim();
        System.out.println("Результат: " + finalResult);
    }
}
