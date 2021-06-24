import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {

        List<String>  users = Arrays.asList("Faruque", "Paulo", "Ju" ,"Jorge Barata", "Eduardo Cumabana", "Ju" );
        List<Double>  productPrices = Arrays.asList(80.0 , 20.3, 30.3);

    // get the size of filtered values
     long count  = users.stream()
                .distinct()
                .filter(e -> e.equalsIgnoreCase("Ju"))
                .map(e -> e + " Rodriques "  )
                .count();
     // getting the list of filtered values
     List <String>  professionals  = users.stream()
                .distinct()
                .filter(e -> !e.equalsIgnoreCase("Ju") && !e.equalsIgnoreCase("Jorge Barata") )
                .collect(Collectors.toList());
                 System.out.println("SCI Employees: " + professionals);


     // get the minimum value of list
     Optional minValue  = productPrices.stream()
                .min(Comparator.naturalOrder());
                 System.out.println("Menor Preco " + minValue.get());

    }
}
