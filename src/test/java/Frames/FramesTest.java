package Frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest  extends BaseTests {

    @Test
    public void testWysiwyg(){
        var wysiwygPage = homepage.clickFramesPage();
        wysiwygPage.clearTextEditor();

        String text1 = "hello ";
        String text2 = "world";

        wysiwygPage.setTextArea(text1);
        wysiwygPage.decreaseIndentation();
        wysiwygPage.setTextArea(text2);

        assertEquals(wysiwygPage.getTextFromEditor(), text1+text2, "Text from editor is incorrect");

    }
}
