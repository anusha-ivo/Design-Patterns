public class User {
    String name;
    String hoby;
    int age;

    User(Builderr b) {
        this.name = b.name;
        this.age = b.age;
        this.hoby = b.hoby;


    }

    static class Builderr {
        String name;
        String hoby;
        int age;

        public Builderr setName(String name) {
            this.name = name;
            return this;
        }

            public Builderr setHoby (String hoby){
                this.hoby = hoby;
                return this;
            }
            public Builderr setAge ( int age){
                this.age = age;
                return this;
            }
            public User build() {
                return new User(this);
            }


        }
    }

