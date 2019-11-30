import com.kilinochi.page.group.GroupPage;
import com.kilinochi.page.groups.card.GroupPageTypeCard;
import com.kilinochi.page.groups.layer.ModalDialogLayer;
import com.kilinochi.page.groups.layer.SelectGroupsDialogLayer;
import com.kilinochi.page.login.LoginPage;
import com.kilinochi.page.user.UserPage;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import com.kilinochi.page.groups.GroupsPage;
import org.junit.Test;

import java.util.List;

import static com.codeborne.selenide.Selenide.open;

public final class CreateGroup {

    @Test
    public void createGroup() {
        open("https://ok.ru/");
        final LoginPage loginPage = (LoginPage) PageFactory
                .getFactory(Pages.LoginPage)
                .create().check();
        final UserPage userPage = (UserPage) loginPage.login().check();
        final GroupsPage groupsPage = (GroupsPage) userPage.groups().check();
        final SelectGroupsDialogLayer dialogLayer = (SelectGroupsDialogLayer) groupsPage.dialogLayer();
        final List<GroupPageTypeCard> typeCards = dialogLayer.typeCards();
        final GroupPageTypeCard typeCard = typeCards.get(0);
        final ModalDialogLayer modalDialogLayer = (ModalDialogLayer) typeCard.dialogLayer();
        final GroupPage groupPage = (GroupPage) modalDialogLayer.inputName("Cool group")
                .sendDescription("Very cool group")
                .selectRestriction(true)
                .selectSubcategory(GroupPage.Subcategory.AUTO)
                .groupPage()
                .check();
        final String groupId = groupPage.getGroupId();
    }
}
