package projava;

public class SwitchSample {
    public static void main(String[] args) {
        var a = 5;
        switch (a) {
            case 1, 2 -> System.out.println("one-two");
            case 3 -> System.out.println("tree");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            default -> System.out.println("other");
        }

//        switch (a) {
//            case 1:
//            case 2:
//                System.out.println("one-two");
//                break;
//            case 3:
//                System.out.println("tree");
//                break;
//            case 4:
//                System.out.println("four");
//                break;
//            case 5:
//                System.out.println("five");
//                break;
//            default:
//                System.out.println("other");
//                break;
//        }

//        System.out.println(switch (a) {
//            case 1,2 -> "one-two";
//            case 3 -> "three";
//            case 4 -> "four";
//            default -> "other";
//        });

        System.out.println(switch (a) {
            case 1:
            case 2: yield "one-two";
            case 3: yield  "three";
            case 4: yield  "four";
            default: yield  "other";
        });
    }
}
