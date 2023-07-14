import java.util.*;
import java.util.stream.Collectors;

public class conditioner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true){
            list.add(scanner.nextLine());
            if(list.size()==2){
                break;
            }
        }
        String str = list.get(1);
        var vals = Arrays.stream(list.get(0).split(" ")).map(Integer::valueOf).collect(Collectors.toList());
        int troom = vals.get(0);
        int tcond = vals.get(1);

        switch (str){
            case "freeze" ->{
                if(troom > tcond)
                    System.out.println(tcond);
                else if(troom <= tcond)
                    System.out.println(troom);
            }
            case "heat" -> {
                if(troom > tcond)
                    System.out.println(troom);
                else if(troom <= tcond)
                    System.out.println(tcond);
            }
            case "auto" -> System.out.println(tcond);
            case "fan" -> System.out.println(troom);
        }
    }
}
