/**     
 * @FileName: CurrentHashMap.java   
 * @Package:com.test   
 * @Description: TODO  
 * @author: LUCKY    
 * @date:2016年1月26日 下午8:05:04   
 * @version V1.0     
 */
package com.test;

import java.util.concurrent.ConcurrentHashMap;


/**  
 * @ClassName: CurrentHashMap   
 * @Description: CurrentHashMapTest线程安全类  
 * @author: LUCKY  
 * @date:2016年1月26日 下午8:05:04     
 */
/*
 * hashtable是做了同步的，hashmap未考虑同步
 * 解决方案有Hashtable或者 Collections.synchronizedMap(hashMap)，这两种方式基本都是对整个hash表结构做锁定操作的
 * ，这样在锁表的期间， 别的线程就需要等待了，无疑性能不高。
 */
public class CurrentHashMapTest {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> chm=new ConcurrentHashMap<>();
		
	}
}
