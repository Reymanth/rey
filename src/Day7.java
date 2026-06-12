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