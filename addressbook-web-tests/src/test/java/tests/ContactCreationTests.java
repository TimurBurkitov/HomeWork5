package tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.ContactData;
import tests.TestBase;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() throws Exception {
      app.getNavigationHelper().gotoContactPage();
      app.getContactHelper().fillContactForm(new ContactData("Name1", "Name2", "Name3", "Company1", "Address", "+79998888888", "email1@test.ru", "test1"), true);
      app.getContactHelper().SubmitContactCreation();
      app.getContactHelper().returnToHomePage();
    }


}
