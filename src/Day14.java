public class Day14 {
    static class Student {
        String name;
        int age;
        int regNo;

        Student(Builder builder) {
            this.name = builder.name;
            this.age = builder.age;
            this.regNo = builder.regNo;
        }

        static class Builder {
            private String name;
            private int age;
            private int regNo;

            public Builder name(String NameValue) {
                this.name = NameValue;
                return this;
            }

            public Builder age(int AgeValue) {
                this.age = AgeValue;
                return this;
            }

            public Builder regNo(int RegNoValue) {
                this.regNo = RegNoValue;
                return this;
            }


            public Student build() {
                return new Student(this);
            }
        }
    }

    static void main() {
        Student student = new Student.Builder()
                .name("REYMANTH")
                .age(18)
                .regNo(2524)
                        .build();
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.regNo);

    }
}

