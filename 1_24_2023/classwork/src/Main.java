import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tokens = input.split("\\s+");
        int result = 1;

        for(int i = 0; i < tokens.length; i++){
            stack.offer(tokens[i]);
        }
        while(stack.size() > 0){
            String element = stack.peek();
            int number = 0;
            if(!element.equals("+") && !element.equals("-")) {

            }
            else if(element.equals("+"));
        }
        else{
            int number = Integer.parseInt(element);
        }
    }
}