$(function(){

    // .aside button 클릭시
    // .aside에게 'open'이라는 클래스명을 추가하고 삭제
    // 'open' 클래스명이 있는지 없는지 판단
    // 'open' 클래스 있으면 .aside의 right:0 / 버튼 이미지 btn_close.png로 변경
    // 'open' 클래스 없으면 원래대로

    var $aside = $('.aside'),
        $asideBtn = $aside.find('button');

        $asideBtn.click(function(){
            $aside.toggleClass('open');
            if($aside.hasClass('open')) {
                $aside.stop().animate({right:0}, 300, 'easeInSine');
                $(this).find('img').attr({
                    src : 'img/btn_close.png',
                    alt : 'close'
                })
            }
            else {
                $aside.stop().animate({right:'-220px'}, 300, 'easeInSine');
                $(this).find('img').attr({
                    src : 'img/btn_open.png',
                    alt : 'open'
                })
            }
        });

})