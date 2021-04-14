$(function(){

    var $menu = $('nav ul li'),
        $contents = $('section'),
        contentsCount = $contents.length;

    // 클릭이벤트
    $menu.click(function(e){
        e.preventDefault();
        $menu.removeClass('on');
        $(this).addClass('on');

        var posY = $($(this).find('a').attr('href')).offset().top;
        console.log(posY);
        $('html, body').stop().animate({scrollTop:posY}, 500)
    });

    // 마우스 휠 이벤트
    $contents.on("mousewheel",function(event,delta){
        if (delta > 0){
            //마우스 휠을 올렸을때 실행할 구문
            var prev = $(this).prev().offset().top;
            $('html, body').stop().animate({scrollTop:prev}, 500);

            var prevIndex = $(this).prev().index() - 1;
            // console.log('이전인덱스' + prevIndex);
            if(prevIndex < 0 ) {
                prevIndex == 0;
                $menu.eq(0).addClass('on');
            } else {
                $menu.removeClass('on');
                $menu.eq(prevIndex).addClass('on');
            }

        } else if (delta < 0){
            //마우스 휠을 내렸을때 실행할 구문
            var next = $(this).next().offset().top;
            $('html, body').stop().animate({scrollTop:next}, 500);

            var nextIndex = $(this).next().index() - 1;
            // console.log('다음인덱스' + nextIndex)
            
            if(nextIndex > contentsCount -1) {
                nextIndex == contentsCount-1;
                $menu.eq(contentsCount-1).addClass('on');
            } else {
                $menu.removeClass('on');
                $menu.eq(nextIndex).addClass('on');
            }
        }
    });

    $menu.eq(0).trigger('click');
})