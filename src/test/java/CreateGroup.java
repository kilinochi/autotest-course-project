import com.kilinochi.page.group.GroupPage;
import com.kilinochi.page.groups.card.GroupPageTypeCard;
import com.kilinochi.page.groups.layer.ModalDialogLayer;
import com.kilinochi.page.groups.layer.SelectGroupsDialogLayer;
import com.kilinochi.page.groups.GroupsPage;
import org.junit.Test;

import java.util.List;

public final class CreateGroup extends BaseTest {

    @Test
    public void createGroup() {
        final GroupsPage groupsPage = (GroupsPage) userPage.groups().check();
        final SelectGroupsDialogLayer dialogLayer = (SelectGroupsDialogLayer) groupsPage.dialogLayer();
        final List<GroupPageTypeCard> typeCards = dialogLayer.typeCards();
        final GroupPageTypeCard typeCard = typeCards.get(0);
        final ModalDialogLayer modalDialogLayer = (ModalDialogLayer) typeCard.dialogLayer();
        modalDialogLayer.inputName("Cool group")
                .sendDescription("Very cool group")
                .selectRestriction(true)
                .selectSubcategory(GroupPage.Subcategory.AUTO)
                .groupPage()
                .check();
    }

    @Test
    public void deleteGroup() {

    }
}
