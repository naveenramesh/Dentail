public class newUser {
    public User setNewuser(String name, String address, String phone) {
        User user = new User();
        user.setName(name);
        user.setAddress(address);
        user.setPhone(phone);
        return user;
    }
}
