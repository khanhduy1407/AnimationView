package tk.nkduy.animationview.library.zooming_entrances;

import android.animation.ObjectAnimator;
import android.view.View;

import tk.nkduy.animationview.library.BaseViewAnimator;

public class ZoomInLeftAnimator extends BaseViewAnimator {

    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
            ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1),
            ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.475f, 1),
            ObjectAnimator.ofFloat(target, "translationX", -target.getRight(), 48, 0),
            ObjectAnimator.ofFloat(target, "alpha", 0, 1, 1)
        );
    }
}
