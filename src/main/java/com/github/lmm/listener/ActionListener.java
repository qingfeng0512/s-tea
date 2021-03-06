package com.github.lmm.listener;

/**
 * Created with IntelliJ IDEA.
 * User: ouamaqing
 * Date: 13-5-29
 * Time: 下午3:31
 * To change this template use File | Settings | File Templates.
 */
public interface ActionListener {

    public void afterClickOn();

    public void beforeClickOn();

    public void afterOpen();

    public void beforeSendkeys();

    public void afterSendkeys();

    public void beforeMouseOver();

    public void afterMouseOver();

    public void beforeselectWindow();

    public void afterselectWindow();

    public void beforerunJS();

    public void afterrunJS();

    public void beforecloseAllWindows();

    public void aftercloseAllWindows();

    public void beforecloseCurrentWindow();

    public void aftercloseCurrentWindow();

    public void beforerefresh();

    public void afterrefresh();

    public void beforeforward();

    public void afterforward();

    public void beforeback();

    public void afterback();

    public void beforetakeScreenShot();

    public void aftertakeScreenShot();

    public void beforedealAlert();

    public void afterdealAlert();

    public void beforedealPrompt();

    public void afterdealPrompt();

    public void beforedealConfirm();

    public void afterdealConfirm();

    public void beforekeyUp();

    public void afterkeyUp();

    public void beforekeyDown();

    public void afterkeyDown();

    public void beforescroll();

    public void afterscroll();

    public void beforedragAndDrop();

    public void afterdragAndDrop();

    public void beforeleftUp();

    public void afterleftUp();

    public void beforeleftDown();

    public void afterleftDown();

    public void beforeclear();

    public void afterclear();

    public void beforedoubleClick();

    public void afterdoubleClick();

    public void onException();

    public void beforesubmit();

    public void aftersubmit();
    
    public void onRetryError();
}
