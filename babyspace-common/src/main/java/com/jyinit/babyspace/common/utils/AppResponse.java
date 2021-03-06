package com.jyinit.babyspace.common.utils;

/**
 * @author AJin ajin0369@outlook.com
 */
public class AppResponse<T> {
    /**
     * 返回值代码 由Status类定义
     *
     */
    private int code;
    /**
     * 返回的附加提示信息
     */
    private String msg;
    /**
     * 返回的数据 若没有则为空
     */
    private T data;

    /**
     * 无参构造必须有
     */
    private AppResponse() {
    }

    /**
     * 全参构造方法
     *
     * @param code 状态码
     * @param msg  附加提示信息
     * @param data 数据
     */
    private AppResponse(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
//=============================start of get/set 集合========================

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
//=============================end of  get/set 集合========================

    /**
     * 成功消息的返回
     * +2 重载方法
     *
     * @return
     */
    public static AppResponse success() {
        return builder().code(200).build();
    }

    /**
     * 成功消息的返回
     * +2 重载方法
     *
     * @param msg 附加提示消息
     * @return
     */
    public static AppResponse success(String msg) {
        return builder().code(200).msg(msg).build();
    }

    /**
     * 成功消息的返回
     * +2 重载方法
     *
     * @param msg  附加提示消息
     * @param data 需要返回的数据
     * @param <T>
     * @return
     */
    public static <T> AppResponse success(String msg, T data) {
        return builder().code(200).msg(msg).data(data).build();
    }

    /**
     * 出错消息提示 该方法要求必须返回错误消息
     *
     * @param msg 错误消息
     * @return
     */
    public static AppResponse error(String msg) {
        return builder().code(500).msg(msg).build();
    }

    /**
     * 产生异常提示  必须返回异常消息
     *
     * @param msg 异常消息
     * @return
     */
    public static AppResponse exception(String msg) {
        return builder().code(500).msg(msg).build();
    }

    /**
     * 未找到的提示消息返回
     *
     * @return
     */
    public static AppResponse notFound() {
        return builder().code(404).build();
    }

    /**
     * 构建一个AppResponseBuilder 对象
     *
     * @param <T>
     * @return
     */
    public static <T> AppResponseBuilder<T> builder() {
        return new AppResponseBuilder<T>();
    }

    /**
     * 内部类 用来解决static 不能使用泛型的问题
     *
     * @param <T>
     */
    public static class AppResponseBuilder<T> {
        /**
         * 返回值代码 由Status类定义
         *
         */
        private int code;
        /**
         * 返回的附加提示信息
         */
        private String msg;
        /**
         * 返回的数据 若没有则为空
         */
        private T data;

        /**
         * 构建一个AppResponse 对象
         *
         * @return
         */
        public AppResponse build() {
            return new AppResponse<T>(this.code, this.msg, this.data);
        }

        /**
         * 链式调用 设置状态码
         *
         * @param status 状态 参考Status
         * @return
         */
        public AppResponseBuilder code(int status) {
            this.code = status;
            return this;
        }

        /**
         * 链式调用 设置提示信息
         *
         * @param msg 提示信息
         * @return
         */
        public AppResponseBuilder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * 链式调用 设置返回数据
         *
         * @param data 返回数据
         * @return
         */
        public AppResponseBuilder data(T data) {
            this.data = data;
            return this;
        }
    }

    @Override
    public String toString() {
        return "AppResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
