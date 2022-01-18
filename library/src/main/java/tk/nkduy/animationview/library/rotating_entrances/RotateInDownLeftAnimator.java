package tk.nkduy.animationview.library.rotating_entrances;

import android.animation.ObjectAnimator;
import android.view.View;

import tk.nkduy.animationview.library.BaseViewAnimator;

public class RotateInDownLeftAnimator extends BaseViewAnimator {

    @Override
    public void prepare(View target) {
        float x = target.getPaddingLeft();
        float y = target.getHeight() - target.getPaddingBottom();
        getAnimatorAgent().playTogether(
            ObjectAnimator.ofFloat(target, "rotation", -90, 0),
            ObjectAnimator.ofFloat(target, "alpha", 0, 1),
            ObjectAnimator.ofFloat(target, "pivotX", x, x),
            ObjectAnimator.ofFloat(target, "pivotY", y, y)
        );
    }
}
