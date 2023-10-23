package use_case.clear_users;

public class ClearOutputData {
    //list of deleted users
    private String[] deletedUsers;
    private boolean useCaseFailed;

    public ClearOutputData(String[] deletedUsers, boolean useCaseFailed) {
        this.deletedUsers = deletedUsers;
        this.useCaseFailed = useCaseFailed;
    }

    public String[] getDeletedUsers() {
        return deletedUsers;
    }
}
