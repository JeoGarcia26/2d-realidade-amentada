package org.ucan;

import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.videoio.VideoCapture;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends JFrame {
    public Main() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(Boolean.TRUE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        FrameGrabber grabber = new OpenCVFrameGrabber(0);
        Main main = new Main();
        Frame frame = null;
        CanvasFrame canvas = new CanvasFrame("Web Cam");
        canvas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            grabber.start();
            while (true) {
                frame = grabber.grab();
                canvas.showImage(frame);
            }
        } catch (FrameGrabber.Exception e) {
            throw new RuntimeException(e);
        }

    }
}