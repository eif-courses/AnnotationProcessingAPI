import org.sravan.annotation.Person;
import org.sravan.annotation.PersonBuilder;

public class PersonBuilderTest {
  public static void main(String[] args) {
    Person p = new PersonBuilder()
        .setAge(22)
        .setName("Marius")
        .build();


    System.out.println(p.getName());
  }
}
