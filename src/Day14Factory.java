
public class Day14Factory {
    interface Transcation {
        void send(String to, String message);
    }

    class CreditTranscation implements Transcation {
        @Override
        public void send(String to, String message) {
            System.out.println("Amount Credited 800: " + message + ", to" + to);
        }

    }

    class DebitTranscation implements Transcation {
        @Override
        public void send(String to, String message) {
            System.out.println("Amount Debited 800: " + message + ", to" + to);
        }
    }

    static Transcation getTranscation(Day14Factory factory, String type) {
        return switch (type) {
            case "Credit" -> factory.new CreditTranscation();
            case "Debit" -> factory.new DebitTranscation();
            default -> throw new IllegalArgumentException("Invalid account type:" + type);
        };
    }

    static void main() {
        Day14Factory factory = new Day14Factory();
        String type = "Credit";
        getTranscation(factory, type).send(" 123467798", "Amount 800 credited");
    }
}





