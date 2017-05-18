/**
 * Created by Sudin Ranjitkar on 5/18/2017.
 */

$(function() {
    $('#messages li').click(function() {
        $(this).fadeOut();
    });
    setTimeout(function() {
        $('#messages li.info').fadeOut();
    }, 3000);
})