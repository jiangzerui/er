package com.sc.utils;

import java.util.UUID;

public class UploadUrlFactory {

	/**
	 * 项目logo上传路径地址
	 * @param filename
	 * @return
	 */
	public static String getProjectUploadLogoUrl(String filename){
		//获取图片后缀名
		String subfix = "";
		if(filename.indexOf(".")>0){
			subfix=filename.substring(filename.lastIndexOf("."));
		}
		filename = UUID.randomUUID()+"";
		return "uploadFiles/project/images/"+filename+subfix;
	}
	
	/**
	 * 项目文件路径
	 * @param filename
	 * @return
	 */
	public static String getProjectUploadFileUrl(String filename){
		//获取文件后缀名
		String subfix = "";
		if(filename.indexOf(".")>0){
			subfix=filename.substring(filename.lastIndexOf("."));
		}
		filename = UUID.randomUUID()+"";
		return "uploadFiles/project/files/"+filename+subfix;
	}
	
	/**
	 * 提交课题文件路径
	 * @param filename
	 * @return
	 */
	public static String getSubjectUploadLogoUrl(String filename) {
		//获取文件后缀名
		String subfix = "";
		if(filename.indexOf(".")>0){
			subfix=filename.substring(filename.lastIndexOf("."));
		}
		filename = UUID.randomUUID()+"";
		return "uploadFiles/subject/files/"+filename+subfix;
	}
	
	/**
	 * 提交课题阶段成果路径
	 * @param originalFilename
	 * @return
	 */
	public static String getSubjectResultUrl(String filename) {
		String subfix = "";
		if(filename.indexOf(".")>0){
			subfix=filename.substring(filename.lastIndexOf("."));
		}
		filename = UUID.randomUUID()+"";
		return "uploadFiles/subject/resultFiles/"+filename+subfix;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getProjectUploadLogoUrl("啊.pptx"));
	}

}
