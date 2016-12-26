package com.tl.mes.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 * 生成验证码工具类
 * @author Alan
 */
public final class ImageUtil {
	
	// 验证码字符集
	private static final char[] chars = { 
		'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 
		'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	// 字符数量
	private static final int SIZE = 4;
	// 干扰线数量
	private static final int LINES = 15;
	// 宽度
	private static final int WIDTH = 80;
	// 高度
	private static final int HEIGHT = 40;
	// 字体大小
	private static final int FONT_SIZE = 30;

	/**
	 * 生成随机验证码及图片
	 * @return  obj数组,下标0对应字符串,下标1对应图片
	 */
	public static Object[] createImage() {
		StringBuffer sb = new StringBuffer();
		
		BufferedImage image = new BufferedImage(
			WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		
		Graphics graphic = image.getGraphics();
		
		graphic.setColor(Color.LIGHT_GRAY);
		
		graphic.fillRect(0, 0, WIDTH, HEIGHT);
		
		Random ran = new Random();
		for (int i = 0; i <SIZE; i++) {
			
			int n = ran.nextInt(chars.length);
			
			graphic.setColor(getRandomColor());
			
			graphic.setFont(new Font(
				null, Font.BOLD + Font.ITALIC, FONT_SIZE));
			
			graphic.drawString(
				chars[n] + "", i * WIDTH / SIZE, HEIGHT / 2);
			
			sb.append(chars[n]);
		}
		
		// 画干扰线
		for (int i = 0; i < LINES; i++) {
			// 设置随机颜色
			graphic.setColor(getRandomColor());
			// 随机画线
			graphic.drawLine(ran.nextInt(WIDTH), ran.nextInt(HEIGHT),
					ran.nextInt(WIDTH), ran.nextInt(HEIGHT));
		}
		// 返回验证码和图片
		return new Object[]{sb.toString(), image};
	}

	/**
	 * 随机取色
	 */
	public static Color getRandomColor() {
		Random ran = new Random();
		Color color = new Color(ran.nextInt(256), 
				ran.nextInt(256), ran.nextInt(256));
		return color;
	}
	
	public static void main(String[] args) throws IOException {
		Object[] objs = createImage();
		BufferedImage image = (BufferedImage) objs[1];
		OutputStream os = new FileOutputStream("/home/soft01/1.png");
		ImageIO.write(image, "png", os);
		os.close();
	}

}
