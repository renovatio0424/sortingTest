public class TestSort {
    public static void main(String[] args) {



    }

    class Student implements Comparable {
        private String name;
        private int primaryKey;
        private Gender gender;
        private int age;
        private int height;

        @Override
        public int compareTo(Object o) {
            Student student = (Student) o;
            return student.primaryKey - this.primaryKey;
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }
}
