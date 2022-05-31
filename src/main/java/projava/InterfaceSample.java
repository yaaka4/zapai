package projava;

import java.util.List;

public class InterfaceSample {
    record Student(String name, int score) implements Named {}
    record Teacher(String name, String subject) implements Named {}
    record Staff(String name, String job) implements Named {}
    static class Passenger implements Named {

        @Override
        public String name() {
            return "通りすがり";
        }
    }

    public static void main(String[] args) {
        var people = List.of(
                new Student("kis", 80),
                new Teacher("hosoya", "Math"),
                new Passenger());
        for(var p : people) {
//            var n = p instanceof Student s ? s.name() :
//                           p instanceof Teacher t ? t.name() :
//                                   "---";
//            System.out.println("こんにちは%sさん".formatted(n));
            System.out.println("こんにちは%sさん".formatted(p.name()));
        }
        message(() -> "no name");
        message(new Student("kis", 80));
    }

    static void message(Named named) {
        System.out.println("Hello " + named.name());
    }

}
