




$(document).ready(function () {

           //SIDE MENU SCRIPTS

            $('.menu-close-icon').click(function (e) {
                e.preventDefault();
                $('#side-menu').animate({ left: '-250px'});

            });

            $('.menu-open-icon').click(function (e) {
                e.preventDefault();
                var left = $('#side-menu').offset().left
                if (left == -250) {
                    $('#side-menu').animate({ left: '0px', top: '0px' });
                }
                else {
                    $('#side-menu').animate({ left: '-250px'});
                }

            });



            /*====================================
             WRITE YOUR   SCRIPTS  BELOW
            ======================================*/

   });


$(window).load(function() {
    $("#flexiselDemo1").flexisel({
        visibleItems: 4,
        animationSpeed: 1000,
        autoPlay: true,
        autoPlaySpeed: 3000,
        pauseOnHover: true,
        enableResponsiveBreakpoints: true,
        responsiveBreakpoints: {
            portrait: {
                changePoint:480,
                visibleItems: 2
            },
            landscape: {
                changePoint:640,
                visibleItems:3
            },
            tablet: {
                changePoint:768,
                visibleItems: 3
            }
        }
    });

});
