package org.bishop.CreationalDesignPattern.BuilderDesignPattern;

public class User {

    private final String userId;
    private final String userName;
    private final String emailId;

    private User(UserBuilder userBuilder)
    {
        this.userId = userBuilder.userId;
        this.userName = userBuilder.userName;
        this.emailId = userBuilder.emailId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
    //inner class to create object of user

    static  class UserBuilder
    {
        private String userId;
        private String userName;
        private String emailId;

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setEmailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        @Override
        public String toString() {
            return "UserBuilder{" +
                    "userId='" + userId + '\'' +
                    ", userName='" + userName + '\'' +
                    ", emailId='" + emailId + '\'' +
                    '}';
        }

        public String getUserId() {
            return userId;
        }

        public String getUserName() {
            return userName;
        }

        public String getEmailId() {
            return emailId;
        }

        public User build()
        {
            User user =new User(this);
            return user;
        }
    }
}
