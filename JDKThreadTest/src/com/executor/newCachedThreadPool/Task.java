/**     
 * @FileName: Task.java   
 * @Package:com.executor   
 * @Description: TODO  
 * @author: LUCKY    
 * @date:2016年1月27日 下午1:33:51   
 * @version V1.0     
 */
package com.executor.newCachedThreadPool;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**  
 * @ClassName: Task   
 * @Description: TODO  
 * @author: LUCKY  
 * @date:2016年1月27日 下午1:33:51     
 */
public class Task implements Runnable{

	
	
	private Date initDate;
	private String name;
	
	public Task(String name){
		initDate=new Date();
		this.name=name;
	}
	
	
	@Override
	public void run() {
		System.out.printf("%s: Task %s: Created on: %s\n",Thread.currentThread().getName(),name,initDate);
		System.out.printf("%s: Task %s: Started on: %s\n",Thread.currentThread().getName(),name,new Date());
		
		try {
			Long duration=(long)(Math.random()*10);
			System.out.printf("%s: Task %s: Doing a task during %d seconds\n",Thread.currentThread().getName(),name,duration);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.printf("%s: Task %s: Finished on: %s\n",Thread.currentThread().getName(),name,new Date());
		
	}

}
