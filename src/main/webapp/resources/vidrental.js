$(document).ready(function () {

    var glocalRequest = 0;

    $('#add-to-cart').bind('click', function (event) {
        addToCart();
    });

    $(".modal-dialog .close").click(function () {
        $(this).closest(".modal-dialog").removeClass("show");
    });

    addToCart = function () {
        var resultContainer = $('#results');
        //alert("Test Ajax Function");
        var $form = $("#moviesForm");
        //alert("form=" + $form);
        var $inputs = $form.find("input");
        //alert("inputs=" + $inputs);
        // serialize the data int the form ready for output
        var serializedData = $form.serialize();
        alert("serializedData=" + serializedData);

        if (glocalRequest == 1) {
            return;
        }
        glocalRequest = 1;

        $.ajax({
            type: "POST",
            url: "rental-confirm",
            data: serializedData,
            success: function (data) {
                glocalRequest = 0;

                resultContainer.fadeOut('fast', function () {
                    resultContainer.html('');
                    //alert("jsonStringify=" + JSON.stringify(data));
                    for(var x in data.items) {
                        var html = '<div class="res-container">';
                        html += '<h2><a href="resources/img"' + data.items[x].image;
                        html += '<img src="resources/img"' + data.items[x].image;
                        html += '</div>';
                        resultContainer.append(html);
                    }
                    resultContainer.fadeIn('fast');
                });
            },
            error: function(e) {
                glocalRequest = 0;
                alert('Error: ' + e);
            },
            async: true
        });
    }
})
;