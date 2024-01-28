const $indicator =document.querySelector('.indicator');
const $link = document.querySelectorAll('li a');
$links.forEach(($link) => {
    $link.addEventListener(
        'mousemove',
        (e) => {
            const { offsetleft,
                offsetWidth} = e.target;
                $indicator.style.left = offsetleft + 'px';
                $indicator.style.left = offsetleft + 'px';
        }     
    );
} );