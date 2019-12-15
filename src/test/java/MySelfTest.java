import com.kilinochi.page.group.GroupPage;
import com.kilinochi.page.groups.card.GroupPageTypeCard;
import com.kilinochi.page.groups.layer.ModalDialogLayer;
import com.kilinochi.page.groups.layer.SelectGroupsDialogLayer;
import com.kilinochi.page.groups.GroupsPage;
import com.kilinochi.page.mySelf.MySelfPage;
import com.kilinochi.page.mySelf.MySelfTab;
import org.junit.Test;
import org.openqa.selenium.Keys;


import java.util.List;

public final class MySelfTest extends BaseTest {

    @Test
    public void createWork() {

        final MySelfPage mySelfPage = userPage.mySelfPage();
        final MySelfTab mySelfTab =  mySelfPage.mySelfTab();
        //final List<GroupPageTypeCard> typeCards = dialogLayer.typeCards();
        //final GroupPageTypeCard typeCard = typeCards.get(0);
        //final ModalDialogLayer modalDialogLayer = (ModalDialogLayer) typeCard.dialogLayer();
        mySelfTab.inputName("Одно");

       // .inputPosition("Чикуня");
        //.sendDescription("Very cool group")
                //.selectRestriction(true)
               // .selectSubcategory(GroupPage.Subcategory.AUTO)
          //      .groupPage()
             //   .check();
    }
}