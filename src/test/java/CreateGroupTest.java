import com.kilinochi.page.group.GroupPage;
import com.kilinochi.page.groups.card.GroupPageTypeCard;
import com.kilinochi.page.groups.layer.ModalDialogLayer;
import com.kilinochi.page.groups.layer.SelectGroupsDialogLayer;
import com.kilinochi.page.groups.GroupsPage;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class CreateGroupTest extends BaseTest {

    private static final String GROUP_NAME = "Cool group";

    @Test
    public void createGroup() {
        final GroupsPage groupsPage = userPage.clickToGroupsPage();
        final SelectGroupsDialogLayer dialogLayer = groupsPage.clickToCreateGroupButton();
        final List<GroupPageTypeCard> typeCards = dialogLayer.wrapCards();
        final GroupPageTypeCard publicGroup = typeCards.get(0);
        final ModalDialogLayer modalDialogLayer = publicGroup.selectCreateDialogLayer();
        final GroupPage groupPage = modalDialogLayer.inputName(GROUP_NAME)
                .sendDescription("Very cool group")
                .selectRestriction(true)
                .selectSubcategory(GroupPage.Subcategory.AUTO)
                .groupPage();

        String groupName = groupPage.groupName();
        boolean isRestrictionGroup = groupPage.isRestrictionGroup();

        assertEquals(GROUP_NAME, groupName);
        assertTrue(isRestrictionGroup);
    }
}
