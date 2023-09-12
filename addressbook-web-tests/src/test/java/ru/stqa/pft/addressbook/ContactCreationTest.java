package ru.stqa.pft.addressbook;

import org.testng.annotations.*;
import org.openqa.selenium.*;

public class ContactCreationTest extends TestBase1 {


  @Test
  public void testContactCreation() throws Exception {

    gotoAddNew();
    fillNewContact(new GroupContact("Name1", "Name2", "Name3", "Company1", "Address1", "+79999999999", "+79998888888", "+79998888777", "email1@test.ru", "email2@test.ru", "email3@test.ru", "Address2", "Home2", "notes1"));
    submitNewContact();
    wd.findElement(By.linkText("home page")).click();
  }

}
