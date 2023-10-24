package hwprogrammes;

    public class Person { // public class declaring variables
        String firstName;
        String lastName;
        int age;

        public String getFirstName() { // instance method returning First name
            return firstName;
        }

        public String getLastName() { // instance method returning last name
            return lastName;
        }

        public int getAge() { // instance method returning age
            return age;
        }

        public void setFirstName(String firstName) { // instance method setting first name
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {// instance method setting last name
            this.lastName = lastName;
        }

        public void setAge(int age) {// instance method setting age
            if (age > 0 && age <= 100) {
                this.age = age;
            } else {
                this.age = 0;
            }
        }

        public boolean isTeen() { // instance method checking value of age and returning true/false for teen
            if (age > 12 && age < 20) {
                return true;
            }
            return false;
        }

        // instance method compiling full name from different combinations of first & last name using if else
        public String getFullName() {
            if (firstName.isEmpty()) {
                return lastName;
            }
            if (lastName.isEmpty()) {
                return firstName;
            }
            if (firstName.isEmpty() && lastName.isEmpty()) {
                return " ";
            } else {
                return firstName + " " + lastName;
            }
        }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}


