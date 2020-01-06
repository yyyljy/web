```html
<div class="row">
    <div class="col-*-*"></div>
    <div class="col-*-*"></div>
</div>
<div class="row">
    <div class="col-*-*"></div>
    <div class="col-*-*"></div>
    <div class="col-*-*"></div>
</div>
<div class="row">  ...</div>
```

col-화면size-grid사이즈

```html
<style type="text/css">
    [class*=col] {
        background-color: gray;
        text-align: center;
        margin-top: 10px;
    }
</style>
```

[class*=col] 클래스명이 col로 시작하는것에 모두 적용