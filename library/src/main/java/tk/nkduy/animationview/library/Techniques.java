package tk.nkduy.animationview.library;

import tk.nkduy.animationview.library.attention.BounceAnimator;
import tk.nkduy.animationview.library.attention.FlashAnimator;
import tk.nkduy.animationview.library.attention.PulseAnimator;
import tk.nkduy.animationview.library.attention.RubberBandAnimator;
import tk.nkduy.animationview.library.attention.ShakeAnimator;
import tk.nkduy.animationview.library.attention.StandUpAnimator;
import tk.nkduy.animationview.library.attention.SwingAnimator;
import tk.nkduy.animationview.library.attention.TadaAnimator;
import tk.nkduy.animationview.library.attention.WaveAnimator;
import tk.nkduy.animationview.library.attention.WobbleAnimator;
import tk.nkduy.animationview.library.bouncing_entrances.BounceInAnimator;
import tk.nkduy.animationview.library.bouncing_entrances.BounceInDownAnimator;
import tk.nkduy.animationview.library.bouncing_entrances.BounceInLeftAnimator;
import tk.nkduy.animationview.library.bouncing_entrances.BounceInRightAnimator;
import tk.nkduy.animationview.library.bouncing_entrances.BounceInUpAnimator;
import tk.nkduy.animationview.library.fading_entrances.FadeInAnimator;
import tk.nkduy.animationview.library.fading_entrances.FadeInDownAnimator;
import tk.nkduy.animationview.library.fading_entrances.FadeInLeftAnimator;
import tk.nkduy.animationview.library.fading_entrances.FadeInRightAnimator;
import tk.nkduy.animationview.library.fading_entrances.FadeInUpAnimator;
import tk.nkduy.animationview.library.fading_exits.FadeOutAnimator;
import tk.nkduy.animationview.library.fading_exits.FadeOutDownAnimator;
import tk.nkduy.animationview.library.fading_exits.FadeOutLeftAnimator;
import tk.nkduy.animationview.library.fading_exits.FadeOutRightAnimator;
import tk.nkduy.animationview.library.fading_exits.FadeOutUpAnimator;
import tk.nkduy.animationview.library.flippers.FlipInXAnimator;
import tk.nkduy.animationview.library.flippers.FlipInYAnimator;
import tk.nkduy.animationview.library.flippers.FlipOutXAnimator;
import tk.nkduy.animationview.library.flippers.FlipOutYAnimator;
import tk.nkduy.animationview.library.rotating_entrances.RotateInAnimator;
import tk.nkduy.animationview.library.rotating_entrances.RotateInDownLeftAnimator;
import tk.nkduy.animationview.library.rotating_entrances.RotateInDownRightAnimator;
import tk.nkduy.animationview.library.rotating_entrances.RotateInUpLeftAnimator;
import tk.nkduy.animationview.library.rotating_entrances.RotateInUpRightAnimator;
import tk.nkduy.animationview.library.rotating_exits.RotateOutAnimator;
import tk.nkduy.animationview.library.rotating_exits.RotateOutDownLeftAnimator;
import tk.nkduy.animationview.library.rotating_exits.RotateOutDownRightAnimator;
import tk.nkduy.animationview.library.rotating_exits.RotateOutUpLeftAnimator;
import tk.nkduy.animationview.library.rotating_exits.RotateOutUpRightAnimator;
import tk.nkduy.animationview.library.sliders.SlideInDownAnimator;
import tk.nkduy.animationview.library.sliders.SlideInLeftAnimator;
import tk.nkduy.animationview.library.sliders.SlideInRightAnimator;
import tk.nkduy.animationview.library.sliders.SlideInUpAnimator;
import tk.nkduy.animationview.library.sliders.SlideOutDownAnimator;
import tk.nkduy.animationview.library.sliders.SlideOutLeftAnimator;
import tk.nkduy.animationview.library.sliders.SlideOutRightAnimator;
import tk.nkduy.animationview.library.sliders.SlideOutUpAnimator;
import tk.nkduy.animationview.library.specials.HingeAnimator;
import tk.nkduy.animationview.library.specials.RollInAnimator;
import tk.nkduy.animationview.library.specials.RollOutAnimator;
import tk.nkduy.animationview.library.specials.in.DropOutAnimator;
import tk.nkduy.animationview.library.specials.in.LandingAnimator;
import tk.nkduy.animationview.library.specials.out.TakingOffAnimator;
import tk.nkduy.animationview.library.zooming_entrances.ZoomInAnimator;
import tk.nkduy.animationview.library.zooming_entrances.ZoomInDownAnimator;
import tk.nkduy.animationview.library.zooming_entrances.ZoomInLeftAnimator;
import tk.nkduy.animationview.library.zooming_entrances.ZoomInRightAnimator;
import tk.nkduy.animationview.library.zooming_entrances.ZoomInUpAnimator;
import tk.nkduy.animationview.library.zooming_exits.ZoomOutAnimator;
import tk.nkduy.animationview.library.zooming_exits.ZoomOutDownAnimator;
import tk.nkduy.animationview.library.zooming_exits.ZoomOutLeftAnimator;
import tk.nkduy.animationview.library.zooming_exits.ZoomOutRightAnimator;
import tk.nkduy.animationview.library.zooming_exits.ZoomOutUpAnimator;

public enum Techniques {

    DropOut(DropOutAnimator.class),
    Landing(LandingAnimator.class),
    TakingOff(TakingOffAnimator.class),

    Flash(FlashAnimator.class),
    Pulse(PulseAnimator.class),
    RubberBand(RubberBandAnimator.class),
    Shake(ShakeAnimator.class),
    Swing(SwingAnimator.class),
    Wobble(WobbleAnimator.class),
    Bounce(BounceAnimator.class),
    Tada(TadaAnimator.class),
    StandUp(StandUpAnimator.class),
    Wave(WaveAnimator.class),

    Hinge(HingeAnimator.class),
    RollIn(RollInAnimator.class),
    RollOut(RollOutAnimator.class),

    BounceIn(BounceInAnimator.class),
    BounceInDown(BounceInDownAnimator.class),
    BounceInLeft(BounceInLeftAnimator.class),
    BounceInRight(BounceInRightAnimator.class),
    BounceInUp(BounceInUpAnimator.class),

    FadeIn(FadeInAnimator.class),
    FadeInUp(FadeInUpAnimator.class),
    FadeInDown(FadeInDownAnimator.class),
    FadeInLeft(FadeInLeftAnimator.class),
    FadeInRight(FadeInRightAnimator.class),

    FadeOut(FadeOutAnimator.class),
    FadeOutDown(FadeOutDownAnimator.class),
    FadeOutLeft(FadeOutLeftAnimator.class),
    FadeOutRight(FadeOutRightAnimator.class),
    FadeOutUp(FadeOutUpAnimator.class),

    FlipInX(FlipInXAnimator.class),
    FlipOutX(FlipOutXAnimator.class),
    FlipInY(FlipInYAnimator.class),
    FlipOutY(FlipOutYAnimator.class),
    RotateIn(RotateInAnimator.class),
    RotateInDownLeft(RotateInDownLeftAnimator.class),
    RotateInDownRight(RotateInDownRightAnimator.class),
    RotateInUpLeft(RotateInUpLeftAnimator.class),
    RotateInUpRight(RotateInUpRightAnimator.class),

    RotateOut(RotateOutAnimator.class),
    RotateOutDownLeft(RotateOutDownLeftAnimator.class),
    RotateOutDownRight(RotateOutDownRightAnimator.class),
    RotateOutUpLeft(RotateOutUpLeftAnimator.class),
    RotateOutUpRight(RotateOutUpRightAnimator.class),

    SlideInLeft(SlideInLeftAnimator.class),
    SlideInRight(SlideInRightAnimator.class),
    SlideInUp(SlideInUpAnimator.class),
    SlideInDown(SlideInDownAnimator.class),

    SlideOutLeft(SlideOutLeftAnimator.class),
    SlideOutRight(SlideOutRightAnimator.class),
    SlideOutUp(SlideOutUpAnimator.class),
    SlideOutDown(SlideOutDownAnimator.class),

    ZoomIn(ZoomInAnimator.class),
    ZoomInDown(ZoomInDownAnimator.class),
    ZoomInLeft(ZoomInLeftAnimator.class),
    ZoomInRight(ZoomInRightAnimator.class),
    ZoomInUp(ZoomInUpAnimator.class),

    ZoomOut(ZoomOutAnimator.class),
    ZoomOutDown(ZoomOutDownAnimator.class),
    ZoomOutLeft(ZoomOutLeftAnimator.class),
    ZoomOutRight(ZoomOutRightAnimator.class),
    ZoomOutUp(ZoomOutUpAnimator.class);


    private Class animatorClazz;

    private Techniques(Class clazz) {
        animatorClazz = clazz;
    }

    public BaseViewAnimator getAnimator() {
        try {
            return (BaseViewAnimator) animatorClazz.newInstance();
        } catch (Exception e) {
            throw new Error("Can not init animatorClazz instance");
        }
    }
}
