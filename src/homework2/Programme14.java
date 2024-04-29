package homework2;


public class Programme14 {
   String firstName;
   String lastName;
   int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = (age >= 0 && age <= 100) ? age : 0;
    }

    public boolean isTeen() {
        return (this.age > 12 && this.age < 20);
    }

    public String getFullName() {
        String fullName = "";
        if (!this.firstName.isEmpty()) {
            fullName += this.firstName;
            if (!this.lastName.isEmpty()) {
                fullName += " " + this.lastName;
            }
        } else {
            fullName = this.lastName;
        }
        return fullName;
    }

    public static void main(String[] args) {
        Programme14 person = new Programme14();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setFirstName("Kartik");
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());

        person.setLastName("Shah");
        System.out.println("fullName= " + person.getFullName());
    }
}

