$(function(){
    $('.slide').prepend($('.slide li:last')).css({marginLeft:'-320px'})

    // 이전버튼 클릭시
    // .slide이 위치가 0 으로 이동
    // 애니메이션이 끝나면 .slide li:last가 맨 앞의 자식으로 이동
    $('.controls .prev').click(function(){
        $('.slide:not(:animated)').animate({marginLeft:0}, 400, 'swing', function(){
            $('.slide').prepend($('.slide li:last')).css({marginLeft:'-320px'})
        })
        // :not(:animated) : 애니메이션이 작동하지 않는 요소를 선택하라는 의미
        // animate({스타일속성}, 시간, '이징함수', 콜백함수);
    })
    // 다음버튼 클릭시
    $('.controls .next').click(function(){
        $('.slide:not(:animated)').animate({marginLeft:'-640px'}, 400, 'swing', function(){
            $('.slide').append($('.slide li:first')).css({marginLeft:'-320px'})
        })
    })

    // 자동 슬라이드
    setInterval(function(){
        $('.next').click();
    }, 2000);
})