package largeanddeepdom;

import base.BaseTests;
import org.testng.annotations.Test;

public class LargeAndDeepDomTest extends BaseTests {

    @Test
    public void testScrollToTable(){
        homepage.clickLargeAndDeepDom().scrollToTable();
    }

    @Test
    public void testScrollToFifthParagraph(){
        homepage.clickInfiniteScroll().scrollToParagraph(5);
    }
}
