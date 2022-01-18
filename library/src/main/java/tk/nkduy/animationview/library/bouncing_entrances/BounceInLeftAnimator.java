package tk.nkduy.animationview.library.bouncing_entrances;

import android.animation.ObjectAnimator;
import android.view.View;

import tk.nkduy.animationview.library.BaseViewAnimator;

public class BounceInLeftAnimator extends BaseViewAnimator {

    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
            ObjectAnimator.ofFloat(target, "translationX", -target.getWidth(), 30, -10, 0),
            ObjectAnimator.ofFloat(target, "alpha", 0, 1, 1, 1)
        );
    }
}

