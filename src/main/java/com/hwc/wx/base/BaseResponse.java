package com.hwc.wx.base;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author jinlilong
 * @version $Id: BaserResponse.java, v 0.1 2017年12月13日 下午2:07:04 jinlilong Exp $
 */
public class BaseResponse {

    /** 成功状态*/
    private boolean success;
    /**  */
    private String  code;
    /**  */
    private String  msg;

    /**
     * 
     * @return
     */
    public static BaseResponse getSuccessResponse() {
        BaseResponse response = new BaseResponse();
        response.setCode(BaseBizContants.REST_SUCESS_CODE);
        response.setMsg(BaseBizContants.REST_SUCESS_MSG);
        response.setSuccess(true);
        return response;
    }

    /**
     * 
     * @return
     */
    public static BaseResponse getFailResponse() {
        BaseResponse response = new BaseResponse();
        response.setCode(BaseBizErrorEnums.SYSTEM_ERROR.getCode());
        response.setMsg(BaseBizErrorEnums.SYSTEM_ERROR.getMsg());
        response.setSuccess(false);
        return response;
    }

    /**
     * 
     * @param response
     * @return
     */
    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("code", getCode());
        map.put("message", getMsg());
        return map;
    }

    /**
     * Getter method for property <tt>code</tt>.
     * 
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter method for property <tt>code</tt>.
     * 
     * @param code value to be assigned to property code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter method for property <tt>msg</tt>.
     * 
     * @return property value of msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Setter method for property <tt>msg</tt>.
     * 
     * @param msg value to be assigned to property msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * Getter method for property <tt>success</tt>.
     * 
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property <tt>success</tt>.
     * 
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

}
