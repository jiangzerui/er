package com.sc.common.utils;

import java.util.Random;

public class UniqueCodeGenerator {
	private static Random random = new Random();
	
	/**
	 * 生成具体长度的唯一随机code
	 * @param length
	 * @return
	 */
	public static String generate(int length){
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<length; i++){
			sb.append(random.nextInt(10));
		}
		return sb.toString();
	}
	
}
