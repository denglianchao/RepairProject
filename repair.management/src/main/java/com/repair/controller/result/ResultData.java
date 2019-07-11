package com.repair.controller.result;

import java.io.Serializable;

/**
 * 
 * 返回结果实体类 ResultDate
 * 
 * lianchao.deng 2016年3月15日 下午8:43:48
 *  
 * @version 1.0.0
 *
 */
public class ResultData implements Serializable {

	/**
	 * serialVersionUID:TODO（用一句话描述这个变量表示什么）
	 *
	 * @since 1.0.0
	 */
	private static final long serialVersionUID = 1L;

	/** 提示信息 */
	private String msg;
	/** 错误码 */
	private Integer code;
	/** 返回结果 **/
	private Object result;

	public ResultData() {

	}

	public ResultData(String msg, Integer code) {
		super();
		this.msg = msg;
		this.code = code;
	}

	public ResultData(Integer code) {
		super();
		this.code = code;
	}

	public static class Code {

		/** 成功 **/
		public static final Integer SUCCESS = 200;
		/** 失败 **/
		public static final Integer FAIL = 201;
		/** 维护*/
		public static final Integer SAFE = 202;
		/** 用户未登录 **/
		public static final Integer NOT_LOGIN = 210;
		/**
		 * 异常
		 */
		public static final Integer EXCEPTION = 211;

	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public static ResultData createErrorResult(String message){
		ResultData result =new ResultData();
		result.setMsg(message);
		result.setCode(Code.FAIL);
		return result;
	}

	public static ResultData createSuccessResult(String message){
		ResultData result =new ResultData();
		result.setMsg(message);
		result.setCode(Code.SUCCESS);
		return result;
	}

	public static ResultData createSuccessResult(){
		return ResultData.createSuccessResult(null);
	}

}
