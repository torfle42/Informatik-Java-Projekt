package Util;

import java.awt.GraphicsEnvironment;
import java.awt.DisplayMode;
import java.awt.Rectangle;
import java.awt.GraphicsDevice;

public class Screeninfo {
    public static int total(){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screenDevices = ge.getScreenDevices();
        return screenDevices.length;
    }
    public static String name(int screen_index){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screenDevices = ge.getScreenDevices();
        GraphicsDevice device = screenDevices[screen_index];
        return device.getIDstring();
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
    public static int refreshRate(int screen_index){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screenDevices = ge.getScreenDevices();
        GraphicsDevice device = screenDevices[screen_index];
        DisplayMode mode = device.getDisplayMode();
        return mode.getRefreshRate();
    }
    public static int bitDepth(int screen_index){
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice[] screenDevices = ge.getScreenDevices();
        GraphicsDevice device = screenDevices[screen_index];
        DisplayMode mode = device.getDisplayMode();
        return mode.getBitDepth();
    }
}
