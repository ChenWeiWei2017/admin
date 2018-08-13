package com.chenweiwei.admin.util;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.OutputStream;
import java.util.Random;

/**
 * 图片验证码生成工具
 * 
 * @author chenweiwei
 */
public class GraphicUtil {

	public static String createCode(final int width, final int height, final String imgType, OutputStream output) {
		StringBuffer code = new StringBuffer();
		Random random = new Random();
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics graphic = image.getGraphics();
		return code.toString();
	}
}
