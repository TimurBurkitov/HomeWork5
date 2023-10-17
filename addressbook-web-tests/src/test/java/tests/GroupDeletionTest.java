package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupDeletionTest extends TestBase {


  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    if ( ! app.getGroupsHelper().isThereAGroup()) {
      app.getGroupsHelper().createGroup(new GroupData("test1", null, null));
    }
    List<GroupData> before = app.getGroupsHelper().getGroupList();
    app.getGroupsHelper().selectGroup(before.size() - 1);
    app.getGroupsHelper().deleteSelectedGroups();
    app.getGroupsHelper().returnToGroupPage();
    List<GroupData> after = app.getGroupsHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() - 1);
      Assert.assertEquals(before, after);
    }
  }



