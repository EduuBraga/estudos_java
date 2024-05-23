import com.github.eduubraga.AgeContactComparator;
import com.github.eduubraga.Contact;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<Contact> contacts = new TreeSet<>(new AgeContactComparator());
        Set<Contact> contacts = new TreeSet<>();

        contacts.add(new Contact("eduardo", "eduardo.braga467@gmail.com", 20));
        contacts.add(new Contact("pereira", "pereira@gmail.com", 20));
        contacts.add(new Contact("joao", "joao123@gmail.com", 20));
        contacts.add(new Contact("jean", "joao123@gmail.com", 20));

        for (Contact contact : contacts) {
            System.out.printf("%s / %d%n", contact, contact.hashCode());
        }
    }
}
