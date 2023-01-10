import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        strings.add("adsa");
        strings.add("second");
        strings.add("third");
        System.out.println(String.join(", ",strings));
        Collections.sort(strings);
        System.out.println(String.join(", ", strings));
        Collections.reverse(strings);
        System.out.println(String.join(", ", strings));

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ints = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] tokens = input.split("\\s+");
        //System.out.println(tokens[1]);
        //tokens[1] = "index1";
        //System.out.println(tokens[1]);
        for(int i = 0; i < tokens.length; i++){
            int element = Integer.parseInt(tokens[i]);
            ints.add(element);
        }

        for(int i = 0;i<ints.size();i++){
            System.out.println(ints.get(i) + " ");
        }
    }
}