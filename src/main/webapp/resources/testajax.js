$(document).ready(function () {

    var globalRequest = 0;

    $('#test-ajax-link').bind('click', function (event) {
        testAjaxFunc();
    });

    $(".modal-dialog .close").click(function () {
        $(this).closest(".modal-dialog").removeClass("show");
    });

    testAjaxFunc = function () {
        // alert("Test Ajax Function");

        if (globalRequest == 1) {
            return
        }
        globalRequest = 1;

        $.ajax({
            type: "GET",
            url: "jsoncontroller/WidgetPalooza",
            data: "",
            success: function (response) {
                globalRequest = 0;

                alert(JSON.stringify(response));

                var htmlString = "ServerResponse : <br>";
                htmlString += "Name : " + response.name + "<br>";
                htmlString += "Staff Name : " + response.staffName + "<br>";

                $('#server-response').append(htmlString);
                $('#save-modal').addClass("show");

                if (response.status == "SUCCESS") {
                    // todo
                } else {
                    // todo
                }
            },
            error: function (e) {
                globalRequest = 0;
                alert('Error: ' + e)
            },
            async: true
        });
    };
});