// .item 마우스 오버시 .caption과 .shadow 투명도 1(animate메소드) - opacity
// img는 1.1배 확대(css메소드)

// .item 마우스 아웃시 원래대로 

$(function(){
    $('.item').mouseover(function(){
        $(this).find('.caption, .shadow').stop().animate({opacity:1});
        $(this).find('img').css({transform:'scale(1.1)'});
    }).mouseout(function(){
        $(this).find('.caption, .shadow').stop().animate({opacity:0});
        $(this).find('img').css({transform:'scale(1.0)'});
    })
})