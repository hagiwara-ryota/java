public class Person {

    public enum Gender {
        MAN, WOMAN
    };

    private Gender gender;

    public Person(Gender gender) {
        this.gender = gender;
    }

    public void speak() {
        System.out.println("I'm a " + gender);
    }

    public static void main(String[] args) {
		Person man = new Person(Gender.MAN);
		man.speak();

		Person woman = new Person(Gender.WOMAN);
		woman.speak();
	}
}
