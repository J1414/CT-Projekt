package de.thcproductions.nsuluofuo.tween;

import com.badlogic.gdx.graphics.g2d.Sprite;

//SpriteAccessor
//author: Julian Pieles

import aurelienribon.tweenengine.TweenAccessor;

public class SpriteAccessor implements TweenAccessor<Sprite> {

	public final int ALPHA = 0;
	
	public int getValues(Sprite arg0, int arg1, float[] arg2) {
		switch(tweenType) {
		case ALPHA:
			returnValues[0] = target.g
		}
		
	}

	public void setValues(Sprite arg0, int arg1, float[] arg2) {
		switch(tweenType) {
		
		}
	}

}
