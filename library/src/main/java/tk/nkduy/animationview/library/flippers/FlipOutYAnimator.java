package tk.nkduy.animationview.library.flippers;

import android.animation.ObjectAnimator;
import android.view.View;

import tk.nkduy.animationview.library.BaseViewAnimator;

public class FlipOutYAnimator extends BaseViewAnimator {

    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
            ObjectAnimator.ofFloat(target, "rotationY", 0, 90),
            ObjectAnimator.ofFloat(target, "alpha", 1, 0)
        );
    }
}
