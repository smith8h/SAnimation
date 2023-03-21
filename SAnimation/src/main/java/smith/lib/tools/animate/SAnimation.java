package smith.lib.tools.animate;

import android.animation.ObjectAnimator;
import android.view.MotionEvent;
import android.view.View;

@SuppressWarnings({"Unused"})
public class SAnimation {
    
	public static void rotation(View view, int fin, long dur) {
		animate(view, "rotation", fin, dur);
	}

    public static void fadeIn(View view, long dur) {
        view.setAlpha(0.0f);
        animate(view, "alpha", 1, dur);
	}
	
	public static void fadeOut(View view, long dur) {
        view.setAlpha(1.0f);
        animate(view, "alpha", 0, dur);
	}
	
	public static void scaleX(View view, float start, float fin, long dur) {
		view.setScaleX(start);
		animate(view, "scaleX", fin, dur);
	}
	
	public static void scaleY(View view, float start, float fin, long dur) {
		view.setScaleY(start);
		animate(view, "scaleY", fin, dur);
	}
	
	public static void scaleXY(View view, float start, float fin, long dur) {
		view.setScaleX(start);
        animate(view, "scaleX", fin, dur);
        view.setScaleY(start);
        animate(view, "scaleY", fin, dur);
	}
	
	public static void translationX(View view, int start, int fin, long dur) {
        view.setTranslationX((float) start);
        animate(view, "translationX", fin, dur);
	}
	
	public static void translationY(View view, int start, int fin, long dur) {
        view.setTranslationY((float) start);
        animate(view, "translationY", fin, dur);
	}
	
    public static void setClickAnimation(View view, SAnimType type) {
        view.setClickable(true);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override public boolean onTouch(View v, MotionEvent event) {
                switch (type) {
                    case SCALE_DOWN:
                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
								animate(v, "scaleX", 0.9f, 230);
                                animate(v, "scaleY", 0.9f, 230);
								break;
                            case MotionEvent.ACTION_UP:
                            	animate(v, "scaleX", 1, 230);
								animate(v, "scaleY", 1, 230);
                                break;
                        }
                        break;
					case SCALE_UP:
                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
								animate(v, "scaleX", 1.1f, 230);
                                animate(v, "scaleY", 1.1f, 230);
								break;
                            case MotionEvent.ACTION_UP:
                            	animate(v, "scaleX", 1, 230);
								animate(v, "scaleY", 1, 230);
                                break;
                        }
                        break;
                    case ALPHA:
                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                animate(v, "alpha", 0.8f, 230);
                                break;
                            case MotionEvent.ACTION_UP:
								animate(v, "alpha", 1, 230);
                                break;
                        }
                        break;
                }
                return false;
            }
        });
    }
	
	private static void animate(View v, String property, float fin, long dur) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(v);
		anim.setPropertyName(property);
		anim.setFloatValues(fin);
		anim.setDuration(dur);
        anim.start();
	}
}
