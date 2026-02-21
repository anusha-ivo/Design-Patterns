public class Student {
    String name;
    int age;
    Student(Studentnew st){

         this.name=st.name;
         this.age=st.age;

    }
    static class Studentnew{
        String name;
        int age;
        public Studentnew setAge(int age){
            this.age=age;
            return this;
        }
        public Studentnew setName(String name){
            this.name=name;
            return this;
        }
        public Student show(){
            return new Student(this);
        }


    }
}
