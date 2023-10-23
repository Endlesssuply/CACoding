package interface_adapter.clear_users;

public class ClearState {
    private String[] deletedUsers = new String[0];
    private String deletedUsersString = "";
    private String errorMessage = null;

    public ClearState(String[] deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

    public ClearState() {
    }

    public String getDeletedUserString() {
        for (String user : deletedUsers) {
            deletedUsersString += user + "\n";
        }
        return deletedUsersString;
    }

    public void setDeletedUsers(String[] deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
