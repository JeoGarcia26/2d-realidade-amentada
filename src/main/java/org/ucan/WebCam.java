package org.ucan;

import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.FrameGrabber;
import org.bytedeco.javacv.OpenCVFrameGrabber;

public class WebCam {
    FrameGrabber grabber = new OpenCVFrameGrabber(0);
    Frame frame;

    {
        try {
            frame = grabber.grab();
        } catch (FrameGrabber.Exception e) {
            throw new RuntimeException(e);
        }
    }
}
