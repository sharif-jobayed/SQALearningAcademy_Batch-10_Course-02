package parabank.framework.utils;

public class ConvertedData {
    private final AppData APP_DATA;
    private final TimeOuts TIMEOUTS;
    private final UserCreds USER_CREDS;

    public ConvertedData() {
        this.APP_DATA = new AppData();
        this.TIMEOUTS = new TimeOuts();
        this.USER_CREDS = new UserCreds();
    }

    public static class AppData {
        private String Browser;
        private String BaseURL;

        public String getBrowser() {
            return Browser;
        }

        public String getBaseURL() {
            return BaseURL;
        }
    }

    public static class TimeOuts {
        private Integer Min;
        private Integer Med;
        private Integer Max;

        public Integer getMin() {
            return Min;
        }

        public Integer getMed() {
            return Med;
        }

        public Integer getMax() {
            return Max;
        }
    }

    public static class UserCreds {
        public static class User {
            private String Username;
            private String Password;

            public String getUsername() {
                return Username;
            }

            public String getPassword() {
                return Password;
            }
        }

        private User User_0001 = new User();

        public User getUser_0001() {
            return User_0001;
        }
    }
}
