package patterns.s2_proxy.impl_2;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("save a user to db...");
    }
}
