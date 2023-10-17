package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupDeletionTest extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupsHelper().getCroupCount();
    if ( ! app.getGroupsHelper().isThereAGroup()) {
      app.getGroupsHelper().createGroup(new GroupData("test1", null, null));
    }
    app.getGroupsHelper().selectGroup();
    app.getGroupsHelper().deleteSelectedGroups();
    app.getGroupsHelper().returnToGroupPage();
    int after = app.getGroupsHelper().getCroupCount();
    Assert.assertEquals(after, before - 1);
  }
}


