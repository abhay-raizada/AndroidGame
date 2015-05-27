package com.abhay.framework;
import com.abhay.framework.Graphics.ImageFormat;
public interface Image {
	public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
