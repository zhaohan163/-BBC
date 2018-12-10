package entity;

import java.io.Serializable;

/**
 * @ClassName Result
 * @Author 123456
 * @Description TODO
 * @Version 1.0
 * @Date 2018/11/25 15:56
 **/

public class Result implements Serializable {
    private boolean success;
    private String  message;

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
