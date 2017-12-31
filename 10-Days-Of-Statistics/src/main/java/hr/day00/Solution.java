package hr.day00;

import java.text.DecimalFormat;
import java.util.*;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> values = new ArrayList<>(n);

        while (values.size() < n) {
            values.add(scan.nextInt());
        }
        scan.close();

        values.sort(Comparator.naturalOrder());

        DecimalFormat format = new DecimalFormat("#.#");

        double avg = (double) values.stream()
                .reduce((a, b) -> a + b).orElse(0) / (double) n;
        System.out.println(format.format(avg));

        double med = values.size() % 2 == 0 ?
                (double) (values.get((n - 1) / 2) + values.get(n / 2)) / 2 : (double) values.get(n / 2);

        System.out.println(format.format(med));

        int mod = values.stream().collect(groupingBy(identity(), LinkedHashMap::new, counting()))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey).orElse(values.get(0));

        System.out.println(format.format(mod));
    }

}