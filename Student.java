class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private char grade;

    public Student(int id,String name,int age,String course,char grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade = grade;
    }
        public void setStudentName(String name) {
            this.name = name;
        }

        public void setStudentAge(int age) {
            this.age = age;
        }

        public void setStudentCourse(String course) {
            this.course = course;
        }

        public void setStudentGrade(char grade) {
            this.grade = grade;
        }

    public int getStudentId() { return id; }
    public String getStudentName() { return name; }
    public int getStudentAge() { return age; }
    public String getStudentCourse() { return course; }
    public char getStudentGrade() { return grade; }

    @Override
    public String toString() {
        return "ID: " + id +
           ", Name: " + name +
           ", Age: " + age +
           ", Course: " + course +
           ", Grade: " + grade;
    }
    
}



