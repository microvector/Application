package com.example.opengldemo;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLSurfaceView extends GLSurfaceView {

    private final MyRenderer renderer;

    public MyGLSurfaceView(Context context) {
        super(context);
        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

        renderer = new MyRenderer();
        // Set the Renderer for drawing on the GLSurfaceView
        setRenderer(renderer);
    }
}
