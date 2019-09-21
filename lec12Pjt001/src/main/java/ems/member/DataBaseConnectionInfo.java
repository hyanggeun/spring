package ems.member;

public class DataBaseConnectionInfo {

    private String jdbcUrl;
    private String userId;

    public DataBaseConnectionInfo(String jdbcUrl, String userId, String userPw) {
        this.jdbcUrl = jdbcUrl;
        this.userId = userId;
        this.userPw = userPw;
    }
    public DataBaseConnectionInfo(){

    }
    private String userPw;

    public String getJdbcUrl() {
        return jdbcUrl;
    }
    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserPw() {
        return userPw;
    }
    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

}
