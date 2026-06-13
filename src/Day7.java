/*
public class Day7 {

    static class Request {
        String name;
        String reason;
        String date;

        Request(String name, String reason, String date) {
            this.name = name;
            this.reason = reason;
            this.date = date;
        }

        void approve() {
            System.out.println("Request approved");
        }

        void reject() {
            System.out.println("Request rejected");
        }
    }

    static class LeaveRequest extends Request {

        LeaveRequest(String name, String reason, String date) {
            super(name, reason, date);
        }

        void approveLeaveRequest() {
            System.out.println("Leave is approved");
            System.out.println("NAME: " + name);
            System.out.println("REASON: " + reason);
            System.out.println("DATE: " + date);
        }

        void rejectLeaveRequest() {
            System.out.println("Leave is rejected");
        }
    }

    static class ODRequest extends Request {

        ODRequest(String name, String reason, String date) {
            super(name, reason, date);
        }

        void approveODRequest() {
            System.out.println("OD is approved");
            System.out.println("NAME: " + name);
            System.out.println("REASON: " + reason);
            System.out.println("DATE: " + date);
        }

        void rejectODRequest() {
            System.out.println("OD is rejected");
        }
    }

    public static void main(String[] args) {

        LeaveRequest lr =
                new LeaveRequest("REYMANTH", "SICK LEAVE", "12/02/2026");
        lr.approveLeaveRequest();

        System.out.println();

        ODRequest od =
                new ODRequest("KUMAR", "SPORTS", "14/03/2026");
        od.rejectODRequest();
    }
}

 */
/*
public class Day7 {
    static class Payment {
        String amount;

        void transfer() {
            System.out.println("Transferring a amount");

        }
    }

    static class UPIpayment extends Payment {
        @Override
        void transfer() {
            System.out.println("UPI payments is Succeeded and Paid");
        }
    }

    static class Cardpayment extends Payment {
        @Override
        void transfer() {
            System.out.println("Card payment  is Paid");
        }

    }
static class NetBankingpayment extends Payment{
        @Override
    void transfer(){
            System.out.println("Net Banking is Paid");
        }
        static void main(){
            UPIpayment upIpayment = new UPIpayment();
            upIpayment.transfer();
            Cardpayment cardpayment = new Cardpayment();
            cardpayment.transfer();
            NetBankingpayment netBankingpayment = new NetBankingpayment();
            netBankingpayment.transfer();

        }
}

}

 */
/*
public class Day7 {
    // correct code
    static class Payment {
        void transfer() {
            System.out.println("Transferring a amount");
        }
    }

    static class UPIpayment extends Payment {
        @Override
        void transfer() {
            System.out.println("UPI payment($) is done");
            System.out.println(" ");
        }
    }

    static class Cardpayment extends Payment {
        @Override
        void transfer() {
            System.out.println("Card payment($) is done");
            System.out.println(" ");
        }
    }

    static class NetBankingpayment extends Payment {
        @Override
        void transfer() {
            System.out.println("Net Banking payment($) is done");
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {

        UPIpayment upIpayment = new UPIpayment();
        upIpayment.transfer();

        Cardpayment cardpayment = new Cardpayment();
        cardpayment.transfer();

        NetBankingpayment netBankingpayment = new NetBankingpayment();
        netBankingpayment.transfer();
    }
}

 */


/*

public  class Day7 {

    interface Employee {
        String solveproblem();

        String work();
    }

    static  class BankEmployee implements Employee{
        @Override
        public String solveproblem(){
            System.out.println("Solving Bank Problem");
            return "Solving Bank Problem";
        }
        public String work(){
            System.out.println("Working as a Bank Employee");
            return "Working as a Bank Employee";
        }

    }
    static class CheckingEmployee implements Employee{
        @Override
        public String solveproblem() {
            System.out.println("Checking the customer ID");
            return "Checking the customer ID";
        }
        public String work(){
            System.out.println("Working as a Checking employee");
            return "Working as a Checking employee";
        }
    }
    static  void main(){
        BankEmployee bank = new BankEmployee();
        bank.solveproblem();
        bank.work();
        CheckingEmployee checking = new CheckingEmployee();
        checking.solveproblem();
        checking.work();


            }
        }



 */
