package contactmanagerstarter;

import org.junit.jupiter.api.*;

class ContactManagerTest {

    ContactManager contactManager;

    @BeforeAll
    public static void setupAll() {
        System.out.println("Should Print Before All Tests");
    }

    @BeforeEach
    public void setup() {
        contactManager = new ContactManager();
    }

    @Test
    public void shouldCreateContact() {
    contactManager.addContact("Adu", "Obed", "0549117886");
    Assertions.assertFalse((contactManager.getAllContacts().isEmpty()));
    Assertions.assertEquals(1, contactManager.getAllContacts().size());
    }

    @Test
    @DisplayName("Should not create Contact When First Name is Null")
    public void shouldThrowRuntimeExceptionFirstNameIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact(null, "Doe", "1457896325");
        });
    }

    @Test
    @DisplayName("Should not create Contact When Last Name is Null")
    public void shouldThrowRuntimeExceptionLastNameIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact("John", null, "1457896325");
        });
    }

    @Test
    @DisplayName("Should not create Contact When Phone Number is Null")
    public void shouldThrowRuntimeExceptionPhoneNumberIsNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact("John", "Doe", null);
        });
    }
}