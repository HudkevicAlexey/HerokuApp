package test;

import org.testng.annotations.Test;

public class TestHeroku extends BaseTest {

    @Test
    public void contextMenuTest() {
        contextMenu.openPage();
        contextMenu.contextMenuAlertCheck();
    }

    @Test
    public void dynamicControlsCheck() {
        dynamicControls.openPage();
        dynamicControls.checkboxCheck();
        dynamicControls.inputCheck();
    }

    @Test
    public void fileUploadTest() {
        fileUploader.openPage();
        fileUploader.fileUpload();
        fileUploader.uploadedFileTitleCheck();
    }
}
