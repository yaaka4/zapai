package performance;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class Performance {
    public static void main(String[] args) {
        System.out.println("Hee");

        performeStream();

        //performeMap();
    }

    private static void performeMap() {
        List<Info> infoList = createInfoList();

        LocalDateTime start = LocalDateTime.now();

        Map<Long, String> infoMap = infoList.stream().collect(HashMap::new, (m, i) -> m.put(i.id, i.type), HashMap::putAll);
        for (long i = 0; i < 100000; i++) {
            String ss = infoMap.get(i);
            //System.out.println(infoMap.get(i));
        }

        LocalDateTime end = LocalDateTime.now();
        System.out.println(Duration.between(start, end));

    }

    private static void performeStream() {

        List<Info> infoList = createInfoList();

        LocalDateTime start = LocalDateTime.now();

        for (long i = 0; i < 100000; i++) {
            final long index = i;
            Optional<Info> result = infoList.stream().filter(info -> info.id == index).findFirst();
            String ss = result.orElse(new Info()).type;
//            System.out.println(result.orElse(new Info()).type);
        }

        LocalDateTime end = LocalDateTime.now();
        System.out.println(Duration.between(start, end));

    }

    private static List<Info> createInfoList() {

        return IntStream.range(0, 100000).mapToObj(i -> {
            Info in = new Info();
            in.id = (long)i;
            in.type = "aa" + i;
            return in;
        }).toList();

    }


}
