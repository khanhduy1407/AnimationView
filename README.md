# Android View Animations

[![](https://jitpack.io/v/tk.nkduy/AnimationView.svg)](https://jitpack.io/#tk.nkduy/AnimationView)

# Usage

## Step 1

#### Gradle
```groovy
dependencies {
    implementation 'tk.nkduy.animationview:library:1.0@aar'
}
```

#### Maven

```xml
<dependency>
    <groupId>tk.nkduy.animationview</groupId>
    <artifactId>library</artifactId>
    <version>1.0</version>
</dependency>
```

## Step 2

Just like play Yo-yo.

```java
YoYo.with(Techniques.Tada)
    .duration(700)
    .repeat(5)
    .playOn(findViewById(R.id.edit_area));
```

### Effects
#### Attension
`Flash`, `Pulse`, `RubberBand`, `Shake`, `Swing`, `Wobble`, `Bounce`, `Tada`, `StandUp`, `Wave`

#### Special
`Hinge`, `RollIn`, `RollOut`,`Landing`,`TakingOff`,`DropOut`

#### Bounce
`BounceIn`, `BounceInDown`, `BounceInLeft`, `BounceInRight`, `BounceInUp`

#### Fade
`FadeIn`, `FadeInUp`, `FadeInDown`, `FadeInLeft`, `FadeInRight`

`FadeOut`, `FadeOutDown`, `FadeOutLeft`, `FadeOutRight`, `FadeOutUp`

#### Flip
`FlipInX`, `FlipOutX`, `FlipOutY`

#### Rotate
`RotateIn`, `RotateInDownLeft`, `RotateInDownRight`, `RotateInUpLeft`, `RotateInUpRight`

`RotateOut`, `RotateOutDownLeft`, `RotateOutDownRight`, `RotateOutUpLeft`, `RotateOutUpRight`

#### Slide
`SlideInLeft`, `SlideInRight`, `SlideInUp`, `SlideInDown`

`SlideOutLeft`, `SlideOutRight`, `SlideOutUp`, `SlideOutDown`

#### Zoom
`ZoomIn`, `ZoomInDown`, `ZoomInLeft`, `ZoomInRight`, `ZoomInUp`

`ZoomOut`, `ZoomOutDown`, `ZoomOutLeft`, `ZoomOutRight`, `ZoomOutUp`
