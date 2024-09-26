package interfaces;

public class UserImpl implements IUser, IProfile{

    @Override
    public boolean userLogin(String username, String password) {
        return false;
    }

    @Override
    public String userNameSurname(int UserID) {
        return "";
    }

    @Override
    public String userProfileName(int userID) {
        return "";
    }
}
