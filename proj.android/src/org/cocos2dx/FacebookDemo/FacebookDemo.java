/****************************************************************************
Copyright (c) 2010-2011 cocos2d-x.org

http://www.cocos2d-x.org

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
****************************************************************************/
package org.cocos2dx.FacebookDemo;

import org.cocos2dx.lib.Cocos2dxActivity;
import org.cocos2dx.lib.Cocos2dxGLSurfaceView;
import android.content.Intent;
import android.os.Bundle;



public class FacebookDemo extends Cocos2dxActivity{

    protected FacebookConnectPlugin facebookVan = null;
	
    protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);	
        facebookVan = new FacebookConnectPlugin(this);
        facebookVan.onCreate(savedInstanceState);
	}

    public Cocos2dxGLSurfaceView onCreateView() {
    	Cocos2dxGLSurfaceView glSurfaceView = new Cocos2dxGLSurfaceView(this);
    	// FacebookDemo should create stencil buffer
    	glSurfaceView.setEGLConfigChooser(5, 6, 5, 0, 16, 8);
    	
    	return glSurfaceView;
    }

    static {
        System.loadLibrary("cocos2dcpp");
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        facebookVan.onStart();
    }
    
    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        facebookVan.onStop();
    }
    
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // TODO Auto-generated method stub
        super.onSaveInstanceState(outState);
        facebookVan.onSaveInstanceState(outState);
    }
    
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        facebookVan.onActivityResult(requestCode, resultCode, data);
    }     
}
