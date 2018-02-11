package com.example.xiaohonghu.mvvmdemo.bean;

public class UserInfoBean  {
    private String message;
    private boolean success;
    private EntityBean entity;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public EntityBean getEntity() {
        return entity;
    }

    public void setEntity(EntityBean entity) {
        this.entity = entity;
    }

    public static class EntityBean  {
        private String gender;
        private String company;
        private String duty;
        private int id;
        private String nickname;
        private String email;
        private int emailIsavalible;
        private String mobile;
        private int mobileIsavalible;
        private String password;
        private int isavalible;
        private String customerkey;
        private String createdate;
        private String userip;
        private int parentid;
        private int userlevel;
        private int type;
        private String randnum;
        private int userType;
        private int clientType;
        private String clientId;
        private int recommend;
        private String userInfo;
        private String introduce;
        private String avatar;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        private String token;
        private int loginTimes;
        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getDuty() {
            return duty;
        }

        public void setDuty(String duty) {
            this.duty = duty;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getEmailIsavalible() {
            return emailIsavalible;
        }

        public void setEmailIsavalible(int emailIsavalible) {
            this.emailIsavalible = emailIsavalible;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public int getMobileIsavalible() {
            return mobileIsavalible;
        }

        public void setMobileIsavalible(int mobileIsavalible) {
            this.mobileIsavalible = mobileIsavalible;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public int getIsavalible() {
            return isavalible;
        }

        public void setIsavalible(int isavalible) {
            this.isavalible = isavalible;
        }

        public String getCustomerkey() {
            return customerkey;
        }

        public void setCustomerkey(String customerkey) {
            this.customerkey = customerkey;
        }

        public String getCreatedate() {
            return createdate;
        }

        public void setCreatedate(String createdate) {
            this.createdate = createdate;
        }

        public String getUserip() {
            return userip;
        }

        public void setUserip(String userip) {
            this.userip = userip;
        }

        public int getParentid() {
            return parentid;
        }

        public void setParentid(int parentid) {
            this.parentid = parentid;
        }

        public int getUserlevel() {
            return userlevel;
        }

        public void setUserlevel(int userlevel) {
            this.userlevel = userlevel;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getRandnum() {
            return randnum;
        }

        public void setRandnum(String randnum) {
            this.randnum = randnum;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public int getClientType() {
            return clientType;
        }

        public void setClientType(int clientType) {
            this.clientType = clientType;
        }

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public int getRecommend() {
            return recommend;
        }

        public void setRecommend(int recommend) {
            this.recommend = recommend;
        }

        public String getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(String userInfo) {
            this.userInfo = userInfo;
        }

        public String getIntroduce() {
            return introduce;
        }

        public void setIntroduce(String introduce) {
            this.introduce = introduce;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
        public int getLoginTimes() {
            return loginTimes;
        }

        public void setLoginTimes(int loginTimes) {
            this.loginTimes = loginTimes;
        }
    }

}