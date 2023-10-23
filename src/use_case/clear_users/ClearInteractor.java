package use_case.clear_users;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    final private ClearUserDataAccessInterface dataAccessObject;
    final private ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface dataAccessObject, ClearOutputBoundary clearPresenter) {
        this.dataAccessObject = dataAccessObject;
        this.clearPresenter = clearPresenter;
    }

    public void execute() {
        String[] deletedUsers = dataAccessObject.deleteAllUsers();
        clearPresenter.prepareSuccessView(new ClearOutputData(deletedUsers, false));
    }
}
