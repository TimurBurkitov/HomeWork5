package ru.stqa.pft.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    //protected ApplicationManager app = new ApplicationManager();
    private  NavigationHelper navigationHelper;
    private ContactHelper contactHelper;

    private SessionHelper sessionHelper;
    private GroupsHelper groupsHelper;

    public void init() {
       wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/");

        groupsHelper = new GroupsHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        contactHelper = new ContactHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper.login("admin", "secret");
    }



    public GroupsHelper getGroupsHelper() {
        return groupsHelper;
    }

    public boolean isElementPresent(By by) {
    try {
      getGroupsHelper().wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }


    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
