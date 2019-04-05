package cn.edu.hnnu.util;
/**
 * 判断是否为空
 * @author sunrongzhi
 *
 */
public class StringUtil {
	public static boolean isEmpty(String str){
		if("".equals(str) || str == null){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isNoEmpty(String str){
		if(!"".equals(str) && str != null){
			return true;
		}else{
			return false;
		}
	}

}
