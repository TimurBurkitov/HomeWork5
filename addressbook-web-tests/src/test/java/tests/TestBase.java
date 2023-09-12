package tests;

import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();

    }

    @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    app.getGroupsHelper().wd.quit();
  }

    private boolean isElementPresent(By by) {
    try {
      app.getGroupsHelper().wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

}
