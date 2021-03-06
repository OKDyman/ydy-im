package com.dyman.im.entity;

import com.dyman.im.constant.MessageTypeEnum;
import lombok.Data;

import java.util.Date;

/**
 * @author dyman
 * @describe 消息
 * @date 2020/1/12
 */
@Data
public class Message {

    /**
     * 发送人
     */
    private int sender;
    /**
     * 接收人
     */
    private int receiver;
    /**
     * 消息内容
     */
    private String content;
    /**
     * 消息类型
     * {@link MessageTypeEnum}
     */
    private int msgType;
    /**
     * 创建时间
     */
    private Date createTime;
}
