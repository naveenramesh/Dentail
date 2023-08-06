public class newUser {
    User user = new User();
    public User setNewuser(String name, String address, String phone) {
        user.setName(name);
        user.setAddress(address);
        user.setPhone(phone);
        return user;
    }
}
