
public class Day8 {
    record CourseRecord(String department, String coursename){
    }

    static void main() {
        CourseRecord courseRecord=new CourseRecord("~ AI ~","~ Bsc,CS(AI) ~");
        System.out.println(courseRecord.department);
        System.out.println(courseRecord.coursename);

    }
}