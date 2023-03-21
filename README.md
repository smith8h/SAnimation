# SAnimation

• Animations
```java

// view , degree, duration in ms
SAnimation.rotate(view, 180, 900);

// view , duration
SAnimation.fadeIn(view, 900);
SAnimation.fadeOut(view, 900);

// view, from, to, duration
SAnimation.scaleX(view, 1f, 1.2f, 900);
SAnimation.scaleY(view, 1f, 0.8f, 900);
SAnimation.scaleXY(view, 1f, 1.1f, 900);

// view, from, to, duration
SAnimation.translationX(view, 100, 150, 900);
SAnimation.translationY(view, 60, 80, 900);

```

• Click Animations
```java

// view, animation type
SAnimation.setClickAnimation(view, SAnimType.ALPHA);
// use: ALPHA, SCALE_UP, SCALE_DOWN

```