package Util;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

public class Screeninfo {
    public static int total(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screenDevices = ge.getScreenDevices();
        return screenDevices.length;
    }
    public static int height(int screen_index){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screenDevices = ge.getScreenDevices();
        GraphicsDevice device = screenDevices[screen_index];
        Rectangle bounds = device.getDefaultConfiguration().getBounds();
        return bounds.height;

    }
    public static int width(int screen_index){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screenDevices = ge.getScreenDevices();
        GraphicsDevice device = screenDevices[screen_index];
        Rectangle bounds = device.getDefaultConfiguration().getBounds();
        return bounds.width;
    }
}
