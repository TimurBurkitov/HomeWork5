package ru.stqa.pft.addressbook.appmanager;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Browser;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private final String  browser;
    WebDriver wd;
    private  NavigationHelper navigationHelper;
    private ContactHelper contactHelper;

    private SessionHelper sessionHelper;
    private GroupsHelper groupsHelper;

    public ApplicationManager(Browser browser) {
        this.browser = String.valueOf(browser);
    }

    public void init() {
        if (browser.equals(String.valueOf(Browser.FIREFOX)) ) {
            wd = new FirefoxDriver();
        } else  if ( browser.equals(String.valueOf(Browser.CHROME))) {
            wd = new ChromeDriver();
        }
        wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
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
