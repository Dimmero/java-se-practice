package Section_8.Exercises.Ex44_MobilePhone;

public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Dima", "123456");
        Contact contact19 = new Contact("Dima", "123456");
        Contact contact2 = new Contact("John", "98765");
        Contact contact3 = new Contact("Harry", "55555");
        Contact contact4 = new Contact("Rohn", "13579");
        MobilePhone mobilePhone = new MobilePhone("12345");
        mobilePhone.addNewContact(contact19);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);
        System.out.println(mobilePhone.removeContact(contact1));
        mobilePhone.queryContact("Dima");
        mobilePhone.printContacts();
    }

}
