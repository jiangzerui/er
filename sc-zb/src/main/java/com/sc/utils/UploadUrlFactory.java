package com.sc.utils;

import java.util.UUID;

public class UploadUrlFactory {

	public static String getProjectUploadLogoUrl(String filename){
		//获取图片后缀名
		String subfix = "";
		if(filename.indexOf(".")>0){
			subfix=filename.substring(filename.lastIndexOf("."));
		}
		filename = UUID.randomUUID()+"";
		return "uploadFiles/project/images/"+filename+subfix;
	}
	
	public static String getProjectUploadFileUrl(String filename){
		//获取文件后缀名
		String subfix = "";
		if(filename.indexOf(".")>0){
			subfix=filename.substring(filename.lastIndexOf("."));
		}
		filename = UUID.randomUUID()+"";
		return "uploadFiles/project/files/"+filename+subfix;
	}
	
	public static String getSubjectUploadLogoUrl(String filename) {
		//获取文件后缀名
		String subfix = "";
		if(filename.indexOf(".")>0){
			subfix=filename.substring(filename.lastIndexOf("."));
		}
		filename = UUID.randomUUID()+"";
		return "uploadFiles/subject/files/"+filename+subfix;
	}
	

	public static void main(String[] args) {
		System.out.println(getProjectUploadLogoUrl("啊.pptx"));
	}

}
