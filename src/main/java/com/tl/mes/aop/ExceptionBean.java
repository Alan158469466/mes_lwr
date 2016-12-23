package com.tl.mes.aop;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *  将异常信息写入本地磁盘
 * @author Alan
 */
@Component 
@Aspect    
public class ExceptionBean {
	
	//指定异常通知和切入点
	@AfterThrowing(throwing="e",pointcut="within(com.tl.mes.controller..*)")
	public void execute(Exception e){
		
		//将e对象信息写入文件
		try{
			FileWriter fw = new FileWriter("\\E:\\logs\\NoteException\\mes_exception.log",true);
			PrintWriter pw = new PrintWriter(fw);
			
			//获取异常发生时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time = sdf.format(new Date());
			
			//打印头部描述
			pw.println("*************************************************************");
			pw.println("**发生时间："+time);
			pw.println("**异常类型："+e);
			pw.println("**********************异常详情********************************");
			e.printStackTrace(pw);//将异常栈信息写入文件
			fw.close();
			pw.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	
	}
}
