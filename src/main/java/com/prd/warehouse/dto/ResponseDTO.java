package com.prd.warehouse.dto;


/**
 * @ClassName:
 * @Description:
 * @Author: lvxz
 * @Date: 2018-07-26  18:02
 */
public class ResponseDTO<T> {

    private int code;
    private String msg;
    private T data;


    public static <T> ResponseDTO<T> success(T data){
        return new ResponseDTO<T>(data);
    }
    private ResponseDTO(T data) {
        this.code = 1;
        this.msg = "success";
        this.data = data;
    }

    public static <T> ResponseDTO<T> success(MessageDTO messageDTO){
        return new ResponseDTO<T>(messageDTO);
    }


    public static <T> ResponseDTO<T> success(MessageDTO messageDTO,T data){
        return new ResponseDTO<T>(messageDTO,data);
    }
    private ResponseDTO(MessageDTO messageDTO,T data) {
        this.code = messageDTO.getCode();
        this.msg = messageDTO.getMsg();
        this.data = data;
    }


    public static <T> ResponseDTO<T> fail(String msg){
        return new ResponseDTO<T>(msg);
    }
    private ResponseDTO(String msg) {
        this.code = 0;
        this.msg = msg;
    }


    /**
     * fail
     * @param messageDTO
     * @param <T>
     * @return
     */
    public static <T> ResponseDTO<T> fail(MessageDTO messageDTO){
        return new ResponseDTO<T>(messageDTO);
    }
    private ResponseDTO(MessageDTO messageDTO) {
        if(messageDTO == null){
            return;
        }
        this.code = messageDTO.getCode();
        this.msg = messageDTO.getMsg();
    }


    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

    @Override
    public String toString() {
        return "{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
