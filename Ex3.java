import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

public class Ex3 {
    public static void main(String[] args) {
        String a = "a+{(d*3)";
        System.out.println(isTruePlacement(a));
    }

    public static boolean isTruePlacement(String a) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> dictionary = new HashMap<>();
        dictionary.put('(', ')');
        dictionary.put('[', ']');
        dictionary.put('{', '}');
        dictionary.put('<', '>');

        for (int i = 0; i < a.length(); i++) {
            if (dictionary.containsKey(a.charAt(i))) {
                stack.addFirst(a.charAt(i));
            }
            if (dictionary.containsValue(a.charAt(i))) {
                Character openBracket = stack.removeFirst();
                if (!dictionary.get(openBracket).equals(a.charAt(i))) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
