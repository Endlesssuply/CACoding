package interface_adapter.clear_users;

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;


public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel viewModel;
    private ViewManagerModel viewManagerModel;

    public ClearPresenter(ClearViewModel clearViewModel, ViewManagerModel viewManagerModel) {
        this.viewManagerModel = viewManagerModel;
        this.viewModel = clearViewModel;
    }

    public void prepareSuccessView(ClearOutputData outputData) {
        String[] deletedUsers = outputData.getDeletedUsers();
        ClearState state = new ClearState(deletedUsers);
        viewModel.setState(state);
        viewModel.firePropertyChanged();
        viewManagerModel.setActiveView(viewModel.getViewName());
        viewManagerModel.firePropertyChanged();
    }

    public void prepareFailView(String error) {
        ClearState state = viewModel.getState();
    }
}
