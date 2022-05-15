function loggInn() {
    const url = "/loggInn?brukernavn="+$("#brukernavn").val()+"&passord="+$("#passord").val();
    $.get(url, function (OK){
        if(OK) {
            window.location.href = "liste.html";
        } else {
            $("#feil").html("Feil brukernavn eller passord");
        }
    })
        .fail(function (jqXHR) {
          const json = $.perseJSON(jqXHR.responseText);
          $("#feil").html(json.message);
        });
}