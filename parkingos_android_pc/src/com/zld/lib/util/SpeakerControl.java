package com.zld.lib.util;

public class SpeakerControl {
	static byte[] cmd =  {(byte) 0xFE,  0x5C, 0x4B ,(byte) 0x89 ,//包头标记  固定值
					       0x22,  0x00, 0x00 ,       0x00,//长度可变量
					       0x68 ,0x01, 0x00 ,0x00 ,0x00 , //固定值(消息类型，转发端口，id)
					       0x0F ,0x00 ,0x00 ,0x00 ,       //具体指令长度
					       (byte) 0xFD ,0x00 ,0x0A ,0x01 ,0x00 , //消息体
					       0x00, 0x00, (byte) 0xFF, (byte) 0xFF};//数据包尾部数据， 固定值
	static byte[] cmd2 =  {(byte) 0xFE,  0x5C, 0x4B ,(byte) 0x89 ,//包头标记  固定值
	       0x22,  0x00, 0x00 ,       0x00,//长度可变量
	       0x68 ,0x02, 0x00 ,0x00 ,0x00 , //固定值(消息类型，转发端口，id)
	       0x0F ,0x00 ,0x00 ,0x00 ,       //具体指令长度
	       (byte) 0xFD ,0x00 ,0x0A ,0x01 ,0x00 , //消息体
	       0x00, 0x00, (byte) 0xFF, (byte) 0xFF};//数据包尾部数据， 固定值
}
