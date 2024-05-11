public class Example16 {
//    enums

    enum Level {LOW, MEDIUM, HIGH,}


    public static void main(String[] args) {
        final Level level = Level.HIGH;

        switch (level) {
            case LOW:
                System.out.println("level is LOW");
                break;
            case MEDIUM:
                System.out.println("level is MEDIUM");
                break;
            case HIGH:
                System.out.println("level is HIGH");
                break;
            default:
                System.out.println("level is UNKNOWN");
        }

        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }

}
