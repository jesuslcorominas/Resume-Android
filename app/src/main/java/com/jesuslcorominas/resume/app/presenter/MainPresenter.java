package com.jesuslcorominas.resume.app.presenter;

import com.jesuslcorominas.resume.app.view.callbackview.MainView;
import com.jesuslcorominas.resume.commons.model.PersonalData;

/**
 * @author Jesús López Corominas
 */

public interface MainPresenter extends Presenter<MainView> {

    void loadPersonalData();

    PersonalData getPersonalData();
}
